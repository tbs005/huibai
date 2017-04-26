package com.app.bean;
// Generated 2016-12-24 16:26:32 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TblFloorInfo generated by hbm2java
 */
@Entity
@Table(name = "tbl_floor_info", catalog = "shopdata")
public class TblFloorInfo implements java.io.Serializable {

	private String FId;
	private String FNm;
	private String FType;
	private String tab1;
	private String tab2;
	private String classify;
	private String keyword;
	private String status;
	private String instoper;
	private String instdt;
	private String midfoper;
	private String midfdt;
	private String rev;

	public TblFloorInfo() {
	}

	public TblFloorInfo(String FId) {
		this.FId = FId;
	}

	public TblFloorInfo(String FId, String FNm, String FType, String tab1, String tab2, String classify, String keyword,
			String status, String instoper, String instdt, String midfoper, String midfdt, String rev) {
		this.FId = FId;
		this.FNm = FNm;
		this.FType = FType;
		this.tab1 = tab1;
		this.tab2 = tab2;
		this.classify = classify;
		this.keyword = keyword;
		this.status = status;
		this.instoper = instoper;
		this.instdt = instdt;
		this.midfoper = midfoper;
		this.midfdt = midfdt;
		this.rev = rev;
	}

	@Id

	@Column(name = "f_id", unique = true, nullable = false, length = 6)
	public String getFId() {
		return this.FId;
	}

	public void setFId(String FId) {
		this.FId = FId;
	}

	@Column(name = "f_nm", length = 20)
	public String getFNm() {
		return this.FNm;
	}

	public void setFNm(String FNm) {
		this.FNm = FNm;
	}

	@Column(name = "f_type", length = 4)
	public String getFType() {
		return this.FType;
	}

	public void setFType(String FType) {
		this.FType = FType;
	}

	@Column(name = "tab1", length = 20)
	public String getTab1() {
		return this.tab1;
	}

	public void setTab1(String tab1) {
		this.tab1 = tab1;
	}

	@Column(name = "tab2", length = 20)
	public String getTab2() {
		return this.tab2;
	}

	public void setTab2(String tab2) {
		this.tab2 = tab2;
	}

	@Column(name = "classify", length = 8)
	public String getClassify() {
		return this.classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	@Column(name = "keyword", length = 200)
	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Column(name = "status", length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "instoper", length = 30)
	public String getInstoper() {
		return this.instoper;
	}

	public void setInstoper(String instoper) {
		this.instoper = instoper;
	}

	@Column(name = "instdt", length = 14)
	public String getInstdt() {
		return this.instdt;
	}

	public void setInstdt(String instdt) {
		this.instdt = instdt;
	}

	@Column(name = "midfoper", length = 30)
	public String getMidfoper() {
		return this.midfoper;
	}

	public void setMidfoper(String midfoper) {
		this.midfoper = midfoper;
	}

	@Column(name = "midfdt", length = 14)
	public String getMidfdt() {
		return this.midfdt;
	}

	public void setMidfdt(String midfdt) {
		this.midfdt = midfdt;
	}

	@Column(name = "rev", length = 30)
	public String getRev() {
		return this.rev;
	}

	public void setRev(String rev) {
		this.rev = rev;
	}

}
