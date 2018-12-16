package model.ssk;

import model.base.ssk.BaseXcApply;

import java.util.Date;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class XcApply extends BaseXcApply<XcApply> {
	public static final XcApply dao = new XcApply().dao();
	public static long saveApply(int userid,String deptName,String trueName,String resources,String typeName,int type,String reason,String cid){
		    XcApply xc=   new XcApply().setUserId(userid).setDeptName(deptName).setTrueName(trueName)
				.setResources(resources).setReason(reason).setCrateTime(new Date())
				.setGmtCreate(new Date().getTime()).setType(type).setTypeName(typeName).setCid(cid);
		    xc.save();
		    return xc.getId();

	}
	public static boolean getApplyIsExist(String cid,int userid){
		return XcApply.dao.findFirst("select * from xc_apply where userid=? and cid=? and type=2",userid,cid)==null?false:true;
	}
}
