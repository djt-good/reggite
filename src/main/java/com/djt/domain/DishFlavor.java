package com.djt.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "dish_flavor")
public class DishFlavor {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 菜品
     */
    @Column(name = "dish_id")
    private Long dishId;

    /**
     * 口味名称
     */
    private String name;

    /**
     * 口味数据list
     */
    private String value;

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
     * 获取菜品
     *
     * @return dish_id - 菜品
     */
    public Long getDishId() {
        return dishId;
    }

    /**
     * 设置菜品
     *
     * @param dishId 菜品
     */
    public void setDishId(Long dishId) {
        this.dishId = dishId;
    }

    /**
     * 获取口味名称
     *
     * @return name - 口味名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置口味名称
     *
     * @param name 口味名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取口味数据list
     *
     * @return value - 口味数据list
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置口味数据list
     *
     * @param value 口味数据list
     */
    public void setValue(String value) {
        this.value = value;
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