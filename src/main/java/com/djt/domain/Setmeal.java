package com.djt.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Setmeal {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 菜品分类id
     */
    @Column(name = "category_id")
    private Long categoryId;

    /**
     * 套餐名称
     */
    private String name;

    /**
     * 套餐价格
     */
    private BigDecimal price;

    /**
     * 状态 0:停用 1:启用
     */
    private Integer status;

    /**
     * 编码
     */
    private String code;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 图片
     */
    private String image;

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
     * 获取菜品分类id
     *
     * @return category_id - 菜品分类id
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 设置菜品分类id
     *
     * @param categoryId 菜品分类id
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取套餐名称
     *
     * @return name - 套餐名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置套餐名称
     *
     * @param name 套餐名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取套餐价格
     *
     * @return price - 套餐价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置套餐价格
     *
     * @param price 套餐价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取状态 0:停用 1:启用
     *
     * @return status - 状态 0:停用 1:启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0:停用 1:启用
     *
     * @param status 状态 0:停用 1:启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取编码
     *
     * @return code - 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编码
     *
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取描述信息
     *
     * @return description - 描述信息
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述信息
     *
     * @param description 描述信息
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取图片
     *
     * @return image - 图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置图片
     *
     * @param image 图片
     */
    public void setImage(String image) {
        this.image = image;
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