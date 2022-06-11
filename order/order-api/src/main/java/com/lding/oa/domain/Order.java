package com.lding.oa.domain;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

//订单业务
@Data
public class Order implements Serializable {
    //订单编号
    private String orderNo;
    //下单时间
    private Date createTime;
    //产品名称
    private String productName;
    //产品价格
    private int productPrice;
    //用户id
    private Long userId;
}
