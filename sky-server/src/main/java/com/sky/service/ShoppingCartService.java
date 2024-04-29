package com.sky.service;

import com.sky.dto.ShoppingCartDTO;

/**
 * @ClassName: ShoppingCard
 * @Description: TODO(一句话描述该类的功能)
 * @DateTime: 2024/4/29
 **/
public interface ShoppingCartService {

    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCard(ShoppingCartDTO shoppingCartDTO);
}
