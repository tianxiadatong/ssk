package model.ssk;

import model.base.ssk.BaseXcDatasource;

import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class XcDatasource extends BaseXcDatasource<XcDatasource> {
	public static final XcDatasource dao = new XcDatasource().dao();

	public static List<XcDatasource> getDs(int type) {
		//return dao.find("select name,typenum from xc_datasource where type=?",type);
		return dao.find("select name,sum(typenum) typenum from xc_datasource where type=? group by name",type);
	}
	public static List<XcDatasource> getDs1(int type) {
		//return dao.find("select name,typenum from xc_datasource where type=?",type);
		return dao.find("select * from xc_datasource where type=? ",type);
	}
	public static List<XcDatasource> getDs2(int type,int userid) {
		//return dao.find("select name,typenum from xc_datasource where type=?",type);
		return dao.find("SELECT id cid,concat(name,\"-\",tablename) name,ename,tableEname,isOtherLibraries,`column` ,IFNULL(b.type,0) type" +
				" FROM xc_datasource a LEFT JOIN (select type,cid from xc_apply where userid=? and `status`=2) b on b.cid=a.id where a.type=?",userid,type);
	}
	public static void saveXc(String ename,String tableName,String tableEname,int i){
		new XcDatasource().setEname(ename).setTableName(tableName).setTableEname(tableEname)
				.setIsOtherLibraries(i).save();
	}
}
