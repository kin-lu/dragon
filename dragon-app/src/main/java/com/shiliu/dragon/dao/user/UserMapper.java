package com.shiliu.dragon.dao.user;


import com.shiliu.dragon.common.base.BaseMapper;
import com.shiliu.dragon.model.user.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据条件查询用户集合
     *
     * @param user 查询条件
     * @return 用户集合
     */
    List<User> selectUser(@Param("user") User user);

    /**
     * 根据用户ID或者用户名称查询用户
     *
     * @param id   用户ID
     * @param name 用户名
     * @return 一个用户
     */
    User selectUserByIdOrName(@Param("id") Long id, @Param("name") String name);

    /**
     * 根据用户ID集合查询用户集合
     *
     * @param ids 用户ID集合
     * @return 用户集合
     */
    List<User> selectUserByIds(@Param("ids") List<Long> ids);


}