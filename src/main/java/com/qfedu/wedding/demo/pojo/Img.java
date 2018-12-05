package com.qfedu.wedding.demo.pojo;

public class Img {
    private Integer imgId;

    private String imgUrl;

    private Integer imgHotelId;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Integer getImgHotelId() {
        return imgHotelId;
    }

    public void setImgHotelId(Integer imgHotelId) {
        this.imgHotelId = imgHotelId;
    }
}