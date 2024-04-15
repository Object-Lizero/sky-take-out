package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName: SetmealDishMapper
 * @Description: 套餐菜品关系表
 * @DateTime: 2024/4/15
 **/
@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品id查询对应的套餐id
     *
     * @param dishIds
     * @return
     */
    //select setmeal_id from setmeal_dish where dish_id in (1,2,3,4)
    List<Long> getSetmeaIdsByDishIds(List<Long> dishIds);
}
