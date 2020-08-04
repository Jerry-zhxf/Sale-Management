package org.zhxf.sale.domain;
// Generated 2019-6-14 11:15:34 by Hibernate Tools 5.2.12.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * OrderDetail generated by hbm2java
 */
@Entity
@Table(name = "order_detail", catalog = "saletest")
public class OrderDetail implements java.io.Serializable {

	private OrderDetailId id;
	private ItemInfo itemInfo;
	private Sale sale;
	private Long itemQty;
	private Float itemPrice;

	public OrderDetail() {
	}

	public OrderDetail(OrderDetailId id, ItemInfo itemInfo, Sale sale) {
		this.id = id;
		this.itemInfo = itemInfo;
		this.sale = sale;
	}

	public OrderDetail(OrderDetailId id, ItemInfo itemInfo, Sale sale, Long itemQty, Float itemPrice) {
		this.id = id;
		this.itemInfo = itemInfo;
		this.sale = sale;
		this.itemQty = itemQty;
		this.itemPrice = itemPrice;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "orderNo", column = @Column(name = "Order_no", nullable = false, length = 25)),
			@AttributeOverride(name = "itemNo", column = @Column(name = "Item_no", nullable = false, length = 13)) })
	public OrderDetailId getId() {
		return this.id;
	}

	public void setId(OrderDetailId id) {
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
	@JoinColumn(name = "Order_no", nullable = false, insertable = false, updatable = false)
	public Sale getSale() {
		return this.sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	@Column(name = "Item_qty")
	public Long getItemQty() {
		return this.itemQty;
	}

	public void setItemQty(Long itemQty) {
		this.itemQty = itemQty;
	}

	@Column(name = "Item_price", precision = 8)
	public Float getItemPrice() {
		return this.itemPrice;
	}

	public void setItemPrice(Float itemPrice) {
		this.itemPrice = itemPrice;
	}

}