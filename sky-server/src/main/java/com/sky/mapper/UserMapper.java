package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName: UserMapper
 * @Description: TODO(一句话描述该类的功能)
 * @DateTime: 2024/4/19
 **/
@Mapper
public interface UserMapper {

    @Select("select * from user where openid = #{openid}")
    User getByOpenId(String openid);

    /**
     * 插入数据
     * @param user
     */
    void insert(User user);
}
