package com.qfedu.wedding.demo.pojo;

public class Order {
    private Integer orderId;

    private Integer orderNum;

    private String orderCount;

    private Integer orderMoney;

    private Integer orderStatus;

    private Integer orderHotelId;

    private Integer orderUserId;
    private  User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(String orderCount) {
        this.orderCount = orderCount == null ? null : orderCount.trim();
    }

    public Integer getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Integer orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderHotelId() {
        return orderHotelId;
    }

    public void setOrderHotelId(Integer orderHotelId) {
        this.orderHotelId = orderHotelId;
    }

    public Integer getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderNum=" + orderNum +
                ", orderCount='" + orderCount + '\'' +
                ", orderMoney=" + orderMoney +
                ", orderStatus=" + orderStatus +
                ", orderHotelId=" + orderHotelId +
                ", orderUserId=" + orderUserId +
                ", user=" + user +
                '}';
    }
}