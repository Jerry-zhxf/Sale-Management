package org.zhxf.sale.domain;
// Generated 2019-6-14 11:15:34 by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sale generated by hbm2java
 */
@Entity
@Table(name = "sale", catalog = "saletest")
public class Sale implements java.io.Serializable {

	private String orderNo;
	private StaffInfo staffInfo;
	private StoreInfo storeInfo;
	private Vip vip;
	private Date saleDate;
	private Float totalAmount;
	private Float payAmount;
	private Float discount;
	private String payment;
	private Boolean isDelivery;
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);
	private Set<Delivery> deliveries = new HashSet<Delivery>(0);

	public Sale() {
	}

	public Sale(String orderNo, StaffInfo staffInfo, StoreInfo storeInfo, Vip vip) {
		this.orderNo = orderNo;
		this.staffInfo = staffInfo;
		this.storeInfo = storeInfo;
		this.vip = vip;
	}

	public Sale(String orderNo, StaffInfo staffInfo, StoreInfo storeInfo, Vip vip, Date saleDate, Float totalAmount,
			Float payAmount, Float discount, String payment, Boolean isDelivery, Set<OrderDetail> orderDetails,
			Set<Delivery> deliveries) {
		this.orderNo = orderNo;
		this.staffInfo = staffInfo;
		this.storeInfo = storeInfo;
		this.vip = vip;
		this.saleDate = saleDate;
		this.totalAmount = totalAmount;
		this.payAmount = payAmount;
		this.discount = discount;
		this.payment = payment;
		this.isDelivery = isDelivery;
		this.orderDetails = orderDetails;
		this.deliveries = deliveries;
	}

	@Id

	@Column(name = "Order_no", unique = true, nullable = false, length = 25)
	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Staff_no", nullable = false)
	public StaffInfo getStaffInfo() {
		return this.staffInfo;
	}

	public void setStaffInfo(StaffInfo staffInfo) {
		this.staffInfo = staffInfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Store_no", nullable = false)
	public StoreInfo getStoreInfo() {
		return this.storeInfo;
	}

	public void setStoreInfo(StoreInfo storeInfo) {
		this.storeInfo = storeInfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIP_no", nullable = false)
	public Vip getVip() {
		return this.vip;
	}

	public void setVip(Vip vip) {
		this.vip = vip;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Sale_date", length = 19)
	public Date getSaleDate() {
		return this.saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	@Column(name = "Total_amount", precision = 8)
	public Float getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Column(name = "Pay_amount", precision = 8)
	public Float getPayAmount() {
		return this.payAmount;
	}

	public void setPayAmount(Float payAmount) {
		this.payAmount = payAmount;
	}

	@Column(name = "Discount", precision = 12, scale = 0)
	public Float getDiscount() {
		return this.discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	@Column(name = "Payment", length = 4)
	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Column(name = "isDelivery")
	public Boolean getIsDelivery() {
		return this.isDelivery;
	}

	public void setIsDelivery(Boolean isDelivery) {
		this.isDelivery = isDelivery;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sale")
	public Set<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sale")
	public Set<Delivery> getDeliveries() {
		return this.deliveries;
	}

	public void setDeliveries(Set<Delivery> deliveries) {
		this.deliveries = deliveries;
	}

}