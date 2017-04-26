package com.app.bean;
// Generated 2016-10-30 15:27:58 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TblEpriseInfo generated by hbm2java
 */
@Entity
@Table(name = "tbl_eprise_info", catalog = "shopdata")
public class TblEpriseInfo implements java.io.Serializable {

	private String epriseId;
	private String epriseNm;
	private String licNo;
	private String buildDt;
	private String busiDt;
	private String business;
	private String regAddr;
	private String epriseType;
	private String legal;
	private String cerType;
	private String cerNo;
	private String epriseTel;
	private String taxUrl;
	private String epriseUrl;
	private String status;
	private String instDt;
	private String modiDt;
	private String cancelDt;

	public TblEpriseInfo() {
	}

	public TblEpriseInfo(String epriseId) {
		this.epriseId = epriseId;
	}

	public TblEpriseInfo(String epriseId, String epriseNm, String licNo, String buildDt, String busiDt, String business,
			String regAddr, String epriseType, String legal, String cerType, String cerNo, String epriseTel,
			String taxUrl, String epriseUrl, String status, String instDt, String modiDt, String cancelDt) {
		this.epriseId = epriseId;
		this.epriseNm = epriseNm;
		this.licNo = licNo;
		this.buildDt = buildDt;
		this.busiDt = busiDt;
		this.business = business;
		this.regAddr = regAddr;
		this.epriseType = epriseType;
		this.legal = legal;
		this.cerType = cerType;
		this.cerNo = cerNo;
		this.epriseTel = epriseTel;
		this.taxUrl = taxUrl;
		this.epriseUrl = epriseUrl;
		this.status = status;
		this.instDt = instDt;
		this.modiDt = modiDt;
		this.cancelDt = cancelDt;
	}

	@Id

	@Column(name = "eprise_id", unique = true, nullable = false, length = 32)
	public String getEpriseId() {
		return this.epriseId;
	}

	public void setEpriseId(String epriseId) {
		this.epriseId = epriseId;
	}

	@Column(name = "eprise_nm", length = 200)
	public String getEpriseNm() {
		return this.epriseNm;
	}

	public void setEpriseNm(String epriseNm) {
		this.epriseNm = epriseNm;
	}

	@Column(name = "lic_no", length = 18)
	public String getLicNo() {
		return this.licNo;
	}

	public void setLicNo(String licNo) {
		this.licNo = licNo;
	}

	@Column(name = "build_dt", length = 8)
	public String getBuildDt() {
		return this.buildDt;
	}

	public void setBuildDt(String buildDt) {
		this.buildDt = buildDt;
	}

	@Column(name = "busi_dt", length = 17)
	public String getBusiDt() {
		return this.busiDt;
	}

	public void setBusiDt(String busiDt) {
		this.busiDt = busiDt;
	}

	@Column(name = "business", length = 500)
	public String getBusiness() {
		return this.business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	@Column(name = "reg_addr", length = 200)
	public String getRegAddr() {
		return this.regAddr;
	}

	public void setRegAddr(String regAddr) {
		this.regAddr = regAddr;
	}

	@Column(name = "eprise_type", length = 1)
	public String getEpriseType() {
		return this.epriseType;
	}

	public void setEpriseType(String epriseType) {
		this.epriseType = epriseType;
	}

	@Column(name = "legal", length = 64)
	public String getLegal() {
		return this.legal;
	}

	public void setLegal(String legal) {
		this.legal = legal;
	}

	@Column(name = "cer_type", length = 2)
	public String getCerType() {
		return this.cerType;
	}

	public void setCerType(String cerType) {
		this.cerType = cerType;
	}

	@Column(name = "cer_no", length = 20)
	public String getCerNo() {
		return this.cerNo;
	}

	public void setCerNo(String cerNo) {
		this.cerNo = cerNo;
	}

	@Column(name = "eprise_tel", length = 20)
	public String getEpriseTel() {
		return this.epriseTel;
	}

	public void setEpriseTel(String epriseTel) {
		this.epriseTel = epriseTel;
	}

	@Column(name = "tax_url", length = 32)
	public String getTaxUrl() {
		return this.taxUrl;
	}

	public void setTaxUrl(String taxUrl) {
		this.taxUrl = taxUrl;
	}

	@Column(name = "eprise_url", length = 32)
	public String getEpriseUrl() {
		return this.epriseUrl;
	}

	public void setEpriseUrl(String epriseUrl) {
		this.epriseUrl = epriseUrl;
	}

	@Column(name = "status", length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "inst_dt", length = 14)
	public String getInstDt() {
		return this.instDt;
	}

	public void setInstDt(String instDt) {
		this.instDt = instDt;
	}

	@Column(name = "modi_dt", length = 14)
	public String getModiDt() {
		return this.modiDt;
	}

	public void setModiDt(String modiDt) {
		this.modiDt = modiDt;
	}

	@Column(name = "cancel_dt", length = 14)
	public String getCancelDt() {
		return this.cancelDt;
	}

	public void setCancelDt(String cancelDt) {
		this.cancelDt = cancelDt;
	}

}
