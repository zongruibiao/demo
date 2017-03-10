package com.ule.fenxiao.dao;

import com.ule.fenxiao.MyMapper;
import com.ule.fenxiao.vo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zongruibiao on 2017/3/2.
 */
public interface UserMapper  extends MyMapper<UserInfo>{


}
