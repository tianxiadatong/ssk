package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.upload.UploadFile;

import model.ssk.XcInterface;
import util.ExcelExportUtil;
import util.FileUtil;
import util.MsgUtil;
import util.TimeUtil;
/*
三实库接口文档模块
 */
public class InterfaceFileController extends Controller {

	    //上传接口文档到服务器
	    public void upload() {
	    	try {
	    		List<UploadFile> upfile = getFiles("file");
				XcInterface xi=new XcInterface().setGmtCreate(new Date().getTime());
				for (UploadFile uf:upfile) {
					File file = uf.getFile();
					FileUtil fs = new FileUtil();
					File t = new File("C:\\ssk\\upload\\" + file.getName());//设置本地上传文件对象（并重命名）
					if(t.exists()){
						t.delete();
					}
					t.createNewFile();
					fs.fileChannelCopy(file, t);//将上传的文件的数据拷贝到本地新建的文件
					if(file.getName().indexOf("html")>=0){
						xi.setName(getPara("module")+"-"+file.getName().replace(".html","")).
								setPageUrl("http://59.202.68.28:8080/ssk/upload/"+file.getName());
					}else{
						xi.setUrl("http://59.202.68.28:8080/ssk/upload/"+file.getName());
					}

				}
				xi.save();
				renderJson(MsgUtil.successMsg("上传成功"));

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	    }


	public void selectInterface() {
	    List<XcInterface> list=XcInterface.selectXI();
		renderJson(MsgUtil.successMsg(list));
	}

	/**
	     * 导出Excel
	     */
	    public void download() {
	    	File file = new File("C:\\ssk\\upload\\API.md");
	 		renderFile(file);
	    }

}
