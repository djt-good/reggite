package com.djt.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "address_book")
public class AddressBook {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 收货人
     */
    private String consignee;

    /**
     * 性别 0 女 1 男
     */
    private Byte sex;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 省级区划编号
     */
    @Column(name = "province_code")
    private String provinceCode;

    /**
     * 省级名称
     */
    @Column(name = "province_name")
    private String provinceName;

    /**
     * 市级区划编号
     */
    @Column(name = "city_code")
    private String cityCode;

    /**
     * 市级名称
     */
    @Column(name = "city_name")
    private String cityName;

    /**
     * 区级区划编号
     */
    @Column(name = "district_code")
    private String districtCode;

    /**
     * 区级名称
     */
    @Column(name = "district_name")
    private String districtName;

    /**
     * 详细地址
     */
    private String detail;

    /**
     * 标签
     */
    private String label;

    /**
     * 默认 0 否 1是
     */
    @Column(name = "is_default")
    private Boolean isDefault;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private Long createUser;

    /**
     * 修改人
     */
    @Column(name = "update_user")
    private Long updateUser;

    /**
     * 是否删除
     */
    @Column(name = "is_deleted")
    private Integer isDeleted;

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
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取收货人
     *
     * @return consignee - 收货人
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * 设置收货人
     *
     * @param consignee 收货人
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * 获取性别 0 女 1 男
     *
     * @return sex - 性别 0 女 1 男
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置性别 0 女 1 男
     *
     * @param sex 性别 0 女 1 男
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取省级区划编号
     *
     * @return province_code - 省级区划编号
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 设置省级区划编号
     *
     * @param provinceCode 省级区划编号
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * 获取省级名称
     *
     * @return province_name - 省级名称
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 设置省级名称
     *
     * @param provinceName 省级名称
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * 获取市级区划编号
     *
     * @return city_code - 市级区划编号
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置市级区划编号
     *
     * @param cityCode 市级区划编号
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 获取市级名称
     *
     * @return city_name - 市级名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置市级名称
     *
     * @param cityName 市级名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 获取区级区划编号
     *
     * @return district_code - 区级区划编号
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * 设置区级区划编号
     *
     * @param districtCode 区级区划编号
     */
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    /**
     * 获取区级名称
     *
     * @return district_name - 区级名称
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * 设置区级名称
     *
     * @param districtName 区级名称
     */
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    /**
     * 获取详细地址
     *
     * @return detail - 详细地址
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置详细地址
     *
     * @param detail 详细地址
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * 获取标签
     *
     * @return label - 标签
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置标签
     *
     * @param label 标签
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 获取默认 0 否 1是
     *
     * @return is_default - 默认 0 否 1是
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * 设置默认 0 否 1是
     *
     * @param isDefault 默认 0 否 1是
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取修改人
     *
     * @return update_user - 修改人
     */
    public Long getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置修改人
     *
     * @param updateUser 修改人
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取是否删除
     *
     * @return is_deleted - 是否删除
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除
     *
     * @param isDeleted 是否删除
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}