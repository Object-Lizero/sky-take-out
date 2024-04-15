package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * @ClassName: DishService
 * @Description: TODO(一句话描述该类的功能)
 * @DateTime: 2024/4/15
 **/
public interface DishService {

    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
