package com.app.bean;
// Generated 2016-9-25 22:42:38 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TblMyClassifyInfo generated by hbm2java
 */
@Entity
@Table(name = "tbl_my_classify_info", catalog = "shopdata")
public class TblMyClassifyInfo implements java.io.Serializable {

	private String uuid;
	private String shopId;
	private String classify;
	private String cname;
	private String status;
	private String instDt;
	private String modifyDt;
	private String rev;

	public TblMyClassifyInfo() {
	}

	public TblMyClassifyInfo(String uuid) {
		this.uuid = uuid;
	}

	public TblMyClassifyInfo(String uuid, String shopId, String classify, String cname, String status, String instDt,
			String modifyDt, String rev) {
		this.uuid = uuid;
		this.shopId = shopId;
		this.classify = classify;
		this.cname = cname;
		this.status = status;
		this.instDt = instDt;
		this.modifyDt = modifyDt;
		this.rev = rev;
	}

	@Id

	@Column(name = "uuid", unique = true, nullable = false, length = 32)
	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Column(name = "shop_id", length = 32)
	public String getShopId() {
		return this.shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	@Column(name = "classify", length = 32)
	public String getClassify() {
		return this.classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	@Column(name = "cname", length = 200)
	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Column(name = "status", length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "instDt", length = 14)
	public String getInstDt() {
		return this.instDt;
	}

	public void setInstDt(String instDt) {
		this.instDt = instDt;
	}

	@Column(name = "modifyDt", length = 14)
	public String getModifyDt() {
		return this.modifyDt;
	}

	public void setModifyDt(String modifyDt) {
		this.modifyDt = modifyDt;
	}

	@Column(name = "rev", length = 45)
	public String getRev() {
		return this.rev;
	}

	public void setRev(String rev) {
		this.rev = rev;
	}

}
