package com.djt.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "shopping_cart")
public class ShoppingCart {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 图片
     */
    private String image;

    /**
     * 主键
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 菜品id
     */
    @Column(name = "dish_id")
    private Long dishId;

    /**
     * 套餐id
     */
    @Column(name = "setmeal_id")
    private Long setmealId;

    /**
     * 口味
     */
    @Column(name = "dish_flavor")
    private String dishFlavor;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取主键
     *
     * @return user_id - 主键
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置主键
     *
     * @param userId 主键
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
     * 获取口味
     *
     * @return dish_flavor - 口味
     */
    public String getDishFlavor() {
        return dishFlavor;
    }

    /**
     * 设置口味
     *
     * @param dishFlavor 口味
     */
    public void setDishFlavor(String dishFlavor) {
        this.dishFlavor = dishFlavor;
    }

    /**
     * 获取数量
     *
     * @return number - 数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置数量
     *
     * @param number 数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取金额
     *
     * @return amount - 金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
}