package com.linqi.RiskCtrlSys.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * author: linqi
 * description: 商品信息POJO对象
 * date: 2024
 */
@Data
public class ProductPO {

    /**
     * 商品价格
     */
    private BigDecimal price;
}
