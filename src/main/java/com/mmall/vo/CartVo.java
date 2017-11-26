package com.mmall.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by sooszy on 2017/11/14.
 */
public class CartVo {
    private List<CartProductVo> cartProductVoList;
    private BigDecimal carTotalPrice;
    private Boolean allChecked;//是否都勾选
    private String imageHost;

    public List<CartProductVo> getCartProductVoList() {
        return cartProductVoList;
    }

    public void setCartProductVoList(List<CartProductVo> cartProductVoList) {
        this.cartProductVoList = cartProductVoList;
    }

    public BigDecimal getCarTotalPrice() {
        return carTotalPrice;
    }

    public void setCarTotalPrice(BigDecimal carTotalPrice) {
        this.carTotalPrice = carTotalPrice;
    }

    public Boolean getAllChecked() {
        return allChecked;
    }

    public void setAllChecked(Boolean allChecked) {
        this.allChecked = allChecked;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }
}
