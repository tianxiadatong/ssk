package model.base.ssk;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseXcDatasource<M extends BaseXcDatasource<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setType(java.lang.Integer type) {
		set("type", type);
		return (M)this;
	}
	
	public java.lang.Integer getType() {
		return getInt("type");
	}

	public M setPid(java.lang.String pid) {
		set("pid", pid);
		return (M)this;
	}
	
	public java.lang.String getPid() {
		return getStr("pid");
	}

	public M setSid(java.lang.String sid) {
		set("sid", sid);
		return (M)this;
	}
	
	public java.lang.String getSid() {
		return getStr("sid");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public M setOldName(java.lang.String oldName) {
		set("oldName", oldName);
		return (M)this;
	}
	
	public java.lang.String getOldName() {
		return getStr("oldName");
	}

	public M setEname(java.lang.String ename) {
		set("ename", ename);
		return (M)this;
	}
	
	public java.lang.String getEname() {
		return getStr("ename");
	}

	public M setBusnum(java.lang.Long busnum) {
		set("busnum", busnum);
		return (M)this;
	}
	
	public java.lang.Long getBusnum() {
		return getLong("busnum");
	}

	public M setRemarks(java.lang.String remarks) {
		set("remarks", remarks);
		return (M)this;
	}
	
	public java.lang.String getRemarks() {
		return getStr("remarks");
	}

	public M setAccessTime(java.util.Date accessTime) {
		set("accessTime", accessTime);
		return (M)this;
	}
	
	public java.util.Date getAccessTime() {
		return get("accessTime");
	}

	public M setTypenum(java.lang.Long typenum) {
		set("typenum", typenum);
		return (M)this;
	}
	
	public java.lang.Long getTypenum() {
		return getLong("typenum");
	}

	public M setColnum(java.lang.Long colnum) {
		set("colnum", colnum);
		return (M)this;
	}
	
	public java.lang.Long getColnum() {
		return getLong("colnum");
	}

	public M setNum(java.lang.Long num) {
		set("num", num);
		return (M)this;
	}
	
	public java.lang.Long getNum() {
		return getLong("num");
	}

	public M setGmtCreate(java.lang.Long gmtCreate) {
		set("gmtCreate", gmtCreate);
		return (M)this;
	}
	
	public java.lang.Long getGmtCreate() {
		return getLong("gmtCreate");
	}

	public M setGmtModified(java.lang.Long gmtModified) {
		set("gmtModified", gmtModified);
		return (M)this;
	}
	
	public java.lang.Long getGmtModified() {
		return getLong("gmtModified");
	}

	public M setIsDeleted(java.lang.Boolean isDeleted) {
		set("isDeleted", isDeleted);
		return (M)this;
	}
	
	public java.lang.Boolean getIsDeleted() {
		return get("isDeleted");
	}

	public M setCrateTime(java.util.Date crateTime) {
		set("crateTime", crateTime);
		return (M)this;
	}
	
	public java.util.Date getCrateTime() {
		return get("crateTime");
	}

	public M setModifyTime(java.util.Date modifyTime) {
		set("modifyTime", modifyTime);
		return (M)this;
	}
	
	public java.util.Date getModifyTime() {
		return get("modifyTime");
	}

}