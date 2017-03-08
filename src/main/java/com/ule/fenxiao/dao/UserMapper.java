package com.ule.fenxiao.dao;

import com.ule.fenxiao.vo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zongruibiao on 2017/3/2.
 */
@Mapper
public interface UserMapper {

    int save(UserInfo user);

    UserInfo selectById(Integer id);

    int updateById(UserInfo user);

    int deleteById(Integer id);


    List<UserInfo> queryAll();

    @Select("select * from user_info WHERE user_info_name = #{name}")
    UserInfo findByName(@Param("name") String name);
}
