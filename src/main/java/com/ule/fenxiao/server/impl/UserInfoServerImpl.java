package com.ule.fenxiao.server.impl;

import com.ule.fenxiao.dao.UserMapper;
import com.ule.fenxiao.server.UserInfoServer;
import com.ule.fenxiao.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zongruibiao on 2017/3/3.
 */
@Service
public class UserInfoServerImpl  implements  UserInfoServer{

    @Autowired
    UserMapper server;

   public  List<UserInfo> findAllUserInfo(){

       return server.queryAll();
   }

}

