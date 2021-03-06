package com.app.bean;
// Generated 2016-10-26 20:38:32 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TblOrderGoodsInfo generated by hbm2java
 */
@Entity
@Table(name = "tbl_order_goods_info", catalog = "shopdata")
public class TblOrderGoodsInfo implements java.io.Serializable {

	private String seqId;
	private String orderId;
	private String shopId;
	private String shopNm;
	private String goodsId;
	private String goodsNm;
	private String typeId;
	private String typeNm;
	private String buynum;
	private String price;
	private String totalAmt;
	private String instDt;
	private String modiDt;

	public TblOrderGoodsInfo() {
	}

	public TblOrderGoodsInfo(String seqId) {
		this.seqId = seqId;
	}

	public TblOrderGoodsInfo(String seqId, String orderId, String shopId, String shopNm, String goodsId, String goodsNm,
			String typeId, String typeNm, String buynum, String price, String totalAmt, String instDt, String modiDt) {
		this.seqId = seqId;
		this.orderId = orderId;
		this.shopId = shopId;
		this.shopNm = shopNm;
		this.goodsId = goodsId;
		this.goodsNm = goodsNm;
		this.typeId = typeId;
		this.typeNm = typeNm;
		this.buynum = buynum;
		this.price = price;
		this.totalAmt = totalAmt;
		this.instDt = instDt;
		this.modiDt = modiDt;
	}

	@Id

	@Column(name = "seq_id", unique = true, nullable = false, length = 32)
	public String getSeqId() {
		return this.seqId;
	}

	public void setSeqId(String seqId) {
		this.seqId = seqId;
	}

	@Column(name = "order_id", length = 32)
	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Column(name = "shop_id", length = 32)
	public String getShopId() {
		return this.shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	@Column(name = "shop_nm", length = 100)
	public String getShopNm() {
		return this.shopNm;
	}

	public void setShopNm(String shopNm) {
		this.shopNm = shopNm;
	}

	@Column(name = "goods_id", length = 32)
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

	@Column(name = "type_id", length = 32)
	public String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	@Column(name = "type_nm", length = 100)
	public String getTypeNm() {
		return this.typeNm;
	}

	public void setTypeNm(String typeNm) {
		this.typeNm = typeNm;
	}

	@Column(name = "buynum", length = 8)
	public String getBuynum() {
		return this.buynum;
	}

	public void setBuynum(String buynum) {
		this.buynum = buynum;
	}

	@Column(name = "price", length = 12)
	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Column(name = "total_amt", length = 12)
	public String getTotalAmt() {
		return this.totalAmt;
	}

	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
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

}
