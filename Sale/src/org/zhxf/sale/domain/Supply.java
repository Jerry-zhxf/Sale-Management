package org.zhxf.sale.domain;
// Generated 2019-6-14 11:15:34 by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Supply generated by hbm2java
 */
@Entity
@Table(name = "supply", catalog = "saletest")
public class Supply implements java.io.Serializable {

	private SupplyId id;
	private ItemInfo itemInfo;
	private SupplyInfo supplyInfo;
	private Date supplyDate;
	private Long supplyQuality;
	private Float supplyPrice;

	public Supply() {
	}

	public Supply(SupplyId id, ItemInfo itemInfo, SupplyInfo supplyInfo, Date supplyDate) {
		this.id = id;
		this.itemInfo = itemInfo;
		this.supplyInfo = supplyInfo;
		this.supplyDate = supplyDate;
	}

	public Supply(SupplyId id, ItemInfo itemInfo, SupplyInfo supplyInfo, Date supplyDate, Long supplyQuality,
			Float supplyPrice) {
		this.id = id;
		this.itemInfo = itemInfo;
		this.supplyInfo = supplyInfo;
		this.supplyDate = supplyDate;
		this.supplyQuality = supplyQuality;
		this.supplyPrice = supplyPrice;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "vendorNo", column = @Column(name = "Vendor_no", nullable = false, length = 16)),
			@AttributeOverride(name = "itemNo", column = @Column(name = "Item_no", nullable = false, length = 13)) })
	public SupplyId getId() {
		return this.id;
	}

	public void setId(SupplyId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Item_no", nullable = false, insertable = false, updatable = false)
	public ItemInfo getItemInfo() {
		return this.itemInfo;
	}

	public void setItemInfo(ItemInfo itemInfo) {
		this.itemInfo = itemInfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Vendor_no", nullable = false, insertable = false, updatable = false)
	public SupplyInfo getSupplyInfo() {
		return this.supplyInfo;
	}

	public void setSupplyInfo(SupplyInfo supplyInfo) {
		this.supplyInfo = supplyInfo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Supply_date", nullable = false, length = 19)
	public Date getSupplyDate() {
		return this.supplyDate;
	}

	public void setSupplyDate(Date supplyDate) {
		this.supplyDate = supplyDate;
	}

	@Column(name = "Supply_quality")
	public Long getSupplyQuality() {
		return this.supplyQuality;
	}

	public void setSupplyQuality(Long supplyQuality) {
		this.supplyQuality = supplyQuality;
	}

	@Column(name = "Supply_price", precision = 8)
	public Float getSupplyPrice() {
		return this.supplyPrice;
	}

	public void setSupplyPrice(Float supplyPrice) {
		this.supplyPrice = supplyPrice;
	}

}