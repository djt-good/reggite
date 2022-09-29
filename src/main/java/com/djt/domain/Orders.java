package com.djt.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Orders {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 订单号
     */
    private String number;

    /**
     * 订单状态 1待付款，2待派送，3已派送，4已完成，5已取消
     */
    private Integer status;

    /**
     * 下单用户
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 地址id
     */
    @Column(name = "address_book_id")
    private Long addressBookId;

    /**
     * 下单时间
     */
    @Column(name = "order_time")
    private Date orderTime;

    /**
     * 结账时间
     */
    @Column(name = "checkout_time")
    private Date checkoutTime;

    /**
     * 支付方式 1微信,2支付宝
     */
    @Column(name = "pay_method")
    private Integer payMethod;

    /**
     * 实收金额
     */
    private BigDecimal amount;

    /**
     * 备注
     */
    private String remark;

    private String phone;

    private String address;

    @Column(name = "user_name")
    private String userName;

    private String consignee;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取订单号
     *
     * @return number - 订单号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置订单号
     *
     * @param number 订单号
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取订单状态 1待付款，2待派送，3已派送，4已完成，5已取消
     *
     * @return status - 订单状态 1待付款，2待派送，3已派送，4已完成，5已取消
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置订单状态 1待付款，2待派送，3已派送，4已完成，5已取消
     *
     * @param status 订单状态 1待付款，2待派送，3已派送，4已完成，5已取消
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取下单用户
     *
     * @return user_id - 下单用户
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置下单用户
     *
     * @param userId 下单用户
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取地址id
     *
     * @return address_book_id - 地址id
     */
    public Long getAddressBookId() {
        return addressBookId;
    }

    /**
     * 设置地址id
     *
     * @param addressBookId 地址id
     */
    public void setAddressBookId(Long addressBookId) {
        this.addressBookId = addressBookId;
    }

    /**
     * 获取下单时间
     *
     * @return order_time - 下单时间
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 设置下单时间
     *
     * @param orderTime 下单时间
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 获取结账时间
     *
     * @return checkout_time - 结账时间
     */
    public Date getCheckoutTime() {
        return checkoutTime;
    }

    /**
     * 设置结账时间
     *
     * @param checkoutTime 结账时间
     */
    public void setCheckoutTime(Date checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    /**
     * 获取支付方式 1微信,2支付宝
     *
     * @return pay_method - 支付方式 1微信,2支付宝
     */
    public Integer getPayMethod() {
        return payMethod;
    }

    /**
     * 设置支付方式 1微信,2支付宝
     *
     * @param payMethod 支付方式 1微信,2支付宝
     */
    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * 获取实收金额
     *
     * @return amount - 实收金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置实收金额
     *
     * @param amount 实收金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return consignee
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * @param consignee
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }
}