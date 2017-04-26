package com.app.bean;
// Generated 2016-10-19 21:55:08 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TblGoodsInfo generated by hbm2java
 */
@Entity
@Table(name = "tbl_goods_info", catalog = "shopdata")
public class TblGoodsInfo implements java.io.Serializable {

	private String goodsId;
	private String goodsNm;
	private String shopId;
	private String classify;
	private String amount;
	private Integer store;
	private String typeId;
	private String yfId;
	private String special;
	private String content;
	private String status;
	private String instDt;
	private String modiDt;
	private String reason;
	private String rev;

	public TblGoodsInfo() {
	}

	public TblGoodsInfo(String goodsId) {
		this.goodsId = goodsId;
	}

	public TblGoodsInfo(String goodsId, String goodsNm, String shopId, String classify, String amount, Integer store,
			String typeId, String yfId, String special, String content, String status, String instDt, String modiDt,
			String reason, String rev) {
		this.goodsId = goodsId;
		this.goodsNm = goodsNm;
		this.shopId = shopId;
		this.classify = classify;
		this.amount = amount;
		this.store = store;
		this.typeId = typeId;
		this.yfId = yfId;
		this.special = special;
		this.content = content;
		this.status = status;
		this.instDt = instDt;
		this.modiDt = modiDt;
		this.reason = reason;
		this.rev = rev;
	}

	@Id

	@Column(name = "goods_id", unique = true, nullable = false, length = 32)
	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "goods_nm", length = 100)
	public String getGoodsNm() {
		return this.goodsNm;
	}

	public void setGoodsNm(String goodsNm) {
		this.goodsNm = goodsNm;
	}

	@Column(name = "shop_id", length = 32)
	public String getShopId() {
		return this.shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	@Column(name = "classify", length = 8)
	public String getClassify() {
		return this.classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	@Column(name = "amount", length = 12)
	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Column(name = "store")
	public Integer getStore() {
		return this.store;
	}

	public void setStore(Integer store) {
		this.store = store;
	}

	@Column(name = "type_id", length = 32)
	public String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	@Column(name = "yf_id", length = 32)
	public String getYfId() {
		return this.yfId;
	}

	public void setYfId(String yfId) {
		this.yfId = yfId;
	}

	@Column(name = "special", length = 100)
	public String getSpecial() {
		return this.special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	@Column(name = "content", length = 4000)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
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

	@Column(name = "reason", length = 100)
	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Column(name = "rev", length = 50)
	public String getRev() {
		return this.rev;
	}

	public void setRev(String rev) {
		this.rev = rev;
	}

}
