package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: OrderMapper
 * @Description: TODO(一句话描述该类的功能)
 * @DateTime: 2024/4/29
 **/
@Mapper
public interface OrderMapper {

    /**
     * 插入订单数据
     * @param orders
     */
    void insert(Orders orders);
}
