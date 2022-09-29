package com.djt.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "setmeal_dish")
public class SetmealDish {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 套餐id 
     */
    @Column(name = "setmeal_id")
    private Long setmealId;

    /**
     * 菜品id
     */
    @Column(name = "dish_id")
    private Long dishId;

    /**
     * 菜品名称 （冗余字段）
     */
    private String name;

    /**
     * 菜品原价（冗余字段）
     */
    private BigDecimal price;

    /**
     * 份数
     */
    private Integer copies;

    /**
     * 排序
     */
    private Integer sort;

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
     * 获取套餐id 
     *
     * @return setmeal_id - 套餐id 
     */
    public Long getSetmealId() {
        return setmealId;
    }

    /**
     * 设置套餐id 
     *
     * @param setmealId 套餐id 
     */
    public void setSetmealId(Long setmealId) {
        this.setmealId = setmealId;
    }

    /**
     * 获取菜品id
     *
     * @return dish_id - 菜品id
     */
    public Long getDishId() {
        return dishId;
    }

    /**
     * 设置菜品id
     *
     * @param dishId 菜品id
     */
    public void setDishId(Long dishId) {
        this.dishId = dishId;
    }

    /**
     * 获取菜品名称 （冗余字段）
     *
     * @return name - 菜品名称 （冗余字段）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置菜品名称 （冗余字段）
     *
     * @param name 菜品名称 （冗余字段）
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取菜品原价（冗余字段）
     *
     * @return price - 菜品原价（冗余字段）
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置菜品原价（冗余字段）
     *
     * @param price 菜品原价（冗余字段）
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取份数
     *
     * @return copies - 份数
     */
    public Integer getCopies() {
        return copies;
    }

    /**
     * 设置份数
     *
     * @param copies 份数
     */
    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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