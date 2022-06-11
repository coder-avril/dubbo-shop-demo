package com.lding.pa.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
    //商品id
    private Long id;
    //商品名称
    private String name;
    //商品价格
    private int price;
    //商品库存
    private int stock;
}
