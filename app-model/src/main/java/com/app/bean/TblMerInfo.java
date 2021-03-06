package com.app.bean;

// Generated 2016-5-30 13:50:25 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TblMerInfo generated by hbm2java
 */
@Entity
@Table(name = "TBL_MER_INFO", catalog = "shopdata")
public class TblMerInfo implements java.io.Serializable {

	private String merId;
	private String merSta;
	private String grade;
	private String merTyp;
	private String merNm;
	private String epriseNm;
	private String business;
	private String addr;
	private String orgBrhNo;
	private String busLicNo;
	private String busLicRegAddr;
	private String merContact;
	private String merFax;
	private String merTel;
	private String merLegalName;
	private String merLegalCerType;
	private String merLegalCerNo;
	private String busLicNoPicFilepath;
	private String taxRegNoPicFilepath;
	private String merLegalPicFilepath;
	private String orgNoPicFilepath;
	private String applyTm;
	private String stopBusTime;
	private String lastUptDtm;
	private String perId;
	
	public TblMerInfo() {
	}

	public TblMerInfo(String merId, String merSta, String merNm,
			String merContact, String merTel, String applyTm, String lastUptDtm) {
		this.merId = merId;
		this.merSta = merSta;
		this.merNm = merNm;
		this.merContact = merContact;
		this.merTel = merTel;
		this.applyTm = applyTm;
		this.lastUptDtm = lastUptDtm;
	}

	public TblMerInfo(String merId, String merSta, String grade,
			String merTyp, String merNm, String epriseNm, String business,
			String addr, String orgBrhNo, String busLicNo,
			String busLicRegAddr, String merContact, String merFax,
			String merTel, String merLegalName, String merLegalCerType,
			String merLegalCerNo, String busLicNoPicFilepath,
			String taxRegNoPicFilepath, String merLegalPicFilepath,
			String orgNoPicFilepath, String applyTm, String stopBusTime,
			String lastUptDtm) {
		this.merId = merId;
		this.merSta = merSta;
		this.grade = grade;
		this.merTyp = merTyp;
		this.merNm = merNm;
		this.epriseNm = epriseNm;
		this.business = business;
		this.addr = addr;
		this.orgBrhNo = orgBrhNo;
		this.busLicNo = busLicNo;
		this.busLicRegAddr = busLicRegAddr;
		this.merContact = merContact;
		this.merFax = merFax;
		this.merTel = merTel;
		this.merLegalName = merLegalName;
		this.merLegalCerType = merLegalCerType;
		this.merLegalCerNo = merLegalCerNo;
		this.busLicNoPicFilepath = busLicNoPicFilepath;
		this.taxRegNoPicFilepath = taxRegNoPicFilepath;
		this.merLegalPicFilepath = merLegalPicFilepath;
		this.orgNoPicFilepath = orgNoPicFilepath;
		this.applyTm = applyTm;
		this.stopBusTime = stopBusTime;
		this.lastUptDtm = lastUptDtm;
	}

	@Id
	@Column(name = "MER_ID", unique = true, nullable = false, length = 15)
	public String getMerId() {
		return this.merId;
	}

	public void setMerId(String merId) {
		this.merId = merId;
	}

	@Column(name = "MER_STA", nullable = false, length = 2)
	public String getMerSta() {
		return this.merSta;
	}

	public void setMerSta(String merSta) {
		this.merSta = merSta;
	}

	@Column(name = "GRADE", length = 2)
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Column(name = "MER_TYP", length = 1)
	public String getMerTyp() {
		return this.merTyp;
	}

	public void setMerTyp(String merTyp) {
		this.merTyp = merTyp;
	}

	@Column(name = "MER_NM", nullable = false, length = 128)
	public String getMerNm() {
		return this.merNm;
	}

	public void setMerNm(String merNm) {
		this.merNm = merNm;
	}

	@Column(name = "EPRISE_NM", length = 128)
	public String getEpriseNm() {
		return this.epriseNm;
	}

	public void setEpriseNm(String epriseNm) {
		this.epriseNm = epriseNm;
	}

	@Column(name = "BUSINESS", length = 300)
	public String getBusiness() {
		return this.business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	@Column(name = "ADDR", length = 30)
	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Column(name = "ORG_BRH_NO", length = 20)
	public String getOrgBrhNo() {
		return this.orgBrhNo;
	}

	public void setOrgBrhNo(String orgBrhNo) {
		this.orgBrhNo = orgBrhNo;
	}

	@Column(name = "BUS_LIC_NO", length = 20)
	public String getBusLicNo() {
		return this.busLicNo;
	}

	public void setBusLicNo(String busLicNo) {
		this.busLicNo = busLicNo;
	}

	@Column(name = "BUS_LIC_REG_ADDR", length = 128)
	public String getBusLicRegAddr() {
		return this.busLicRegAddr;
	}

	public void setBusLicRegAddr(String busLicRegAddr) {
		this.busLicRegAddr = busLicRegAddr;
	}

	@Column(name = "MER_CONTACT", nullable = false, length = 128)
	public String getMerContact() {
		return this.merContact;
	}

	public void setMerContact(String merContact) {
		this.merContact = merContact;
	}

	@Column(name = "MER_FAX", length = 20)
	public String getMerFax() {
		return this.merFax;
	}

	public void setMerFax(String merFax) {
		this.merFax = merFax;
	}

	@Column(name = "MER_TEL", nullable = false, length = 20)
	public String getMerTel() {
		return this.merTel;
	}

	public void setMerTel(String merTel) {
		this.merTel = merTel;
	}

	@Column(name = "MER_LEGAL_NAME", length = 128)
	public String getMerLegalName() {
		return this.merLegalName;
	}

	public void setMerLegalName(String merLegalName) {
		this.merLegalName = merLegalName;
	}

	@Column(name = "MER_LEGAL_CER_TYPE", length = 2)
	public String getMerLegalCerType() {
		return this.merLegalCerType;
	}

	public void setMerLegalCerType(String merLegalCerType) {
		this.merLegalCerType = merLegalCerType;
	}

	@Column(name = "MER_LEGAL_CER_NO", length = 20)
	public String getMerLegalCerNo() {
		return this.merLegalCerNo;
	}

	public void setMerLegalCerNo(String merLegalCerNo) {
		this.merLegalCerNo = merLegalCerNo;
	}

	@Column(name = "BUS_LIC_NO_PIC_FILEPATH", length = 128)
	public String getBusLicNoPicFilepath() {
		return this.busLicNoPicFilepath;
	}

	public void setBusLicNoPicFilepath(String busLicNoPicFilepath) {
		this.busLicNoPicFilepath = busLicNoPicFilepath;
	}

	@Column(name = "TAX_REG_NO_PIC_FILEPATH", length = 128)
	public String getTaxRegNoPicFilepath() {
		return this.taxRegNoPicFilepath;
	}

	public void setTaxRegNoPicFilepath(String taxRegNoPicFilepath) {
		this.taxRegNoPicFilepath = taxRegNoPicFilepath;
	}

	@Column(name = "MER_LEGAL_PIC_FILEPATH", length = 128)
	public String getMerLegalPicFilepath() {
		return this.merLegalPicFilepath;
	}

	public void setMerLegalPicFilepath(String merLegalPicFilepath) {
		this.merLegalPicFilepath = merLegalPicFilepath;
	}

	@Column(name = "ORG_NO_PIC_FILEPATH", length = 128)
	public String getOrgNoPicFilepath() {
		return this.orgNoPicFilepath;
	}

	public void setOrgNoPicFilepath(String orgNoPicFilepath) {
		this.orgNoPicFilepath = orgNoPicFilepath;
	}

	@Column(name = "APPLY_TM", nullable = false, length = 14)
	public String getApplyTm() {
		return this.applyTm;
	}

	public void setApplyTm(String applyTm) {
		this.applyTm = applyTm;
	}

	@Column(name = "STOP_BUS_TIME", length = 14)
	public String getStopBusTime() {
		return this.stopBusTime;
	}

	public void setStopBusTime(String stopBusTime) {
		this.stopBusTime = stopBusTime;
	}

	@Column(name = "LAST_UPT_DTM", nullable = false, length = 14)
	public String getLastUptDtm() {
		return this.lastUptDtm;
	}

	public void setLastUptDtm(String lastUptDtm) {
		this.lastUptDtm = lastUptDtm;
	}

	public String getPerId() {
		return perId;
	}
	@Column(name = "PER_ID")
	public void setPerId(String perId) {
		this.perId = perId;
	}
	

}
