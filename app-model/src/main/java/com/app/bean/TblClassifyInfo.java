package com.app.bean;

// Generated 2016-8-28 0:36:07 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TblClassifyInfo generated by hbm2java
 */
@Entity
@Table(name = "tbl_classify_info", catalog = "shopdata")
public class TblClassifyInfo implements java.io.Serializable {

	private String classify;
	private String cname;
	private Integer clevel;
	private Integer cseq;
	private String pclassify;
	private String status;

	public TblClassifyInfo() {
	}

	public TblClassifyInfo(String classify) {
		this.classify = classify;
	}

	public TblClassifyInfo(String classify, String cname, Integer clevel,
			Integer cseq, String pclassify, String status) {
		this.classify = classify;
		this.cname = cname;
		this.clevel = clevel;
		this.cseq = cseq;
		this.pclassify = pclassify;
		this.status = status;
	}

	@Id
	@Column(name = "classify", unique = true, nullable = false, length = 8)
	public String getClassify() {
		return this.classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	@Column(name = "cname", length = 30)
	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Column(name = "clevel")
	public Integer getClevel() {
		return this.clevel;
	}

	public void setClevel(Integer clevel) {
		this.clevel = clevel;
	}

	@Column(name = "cseq")
	public Integer getCseq() {
		return this.cseq;
	}

	public void setCseq(Integer cseq) {
		this.cseq = cseq;
	}

	@Column(name = "pclassify", length = 8)
	public String getPclassify() {
		return this.pclassify;
	}

	public void setPclassify(String pclassify) {
		this.pclassify = pclassify;
	}

	@Column(name = "status", length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
