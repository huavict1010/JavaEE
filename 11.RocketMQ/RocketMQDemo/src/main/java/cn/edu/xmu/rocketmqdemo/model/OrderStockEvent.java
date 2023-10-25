package cn.edu.xmu.restfuldemo.model;

import lombok.Data;

/**
 * 订单扣库存事件
 * @author Ming Qiu
 * @date Created in 2020/11/8 0:46
 **/
@Data
public class OrderStockEvent {
    private Long skuId;
    private Integer quantity;
}
