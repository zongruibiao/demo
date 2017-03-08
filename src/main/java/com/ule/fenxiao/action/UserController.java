package com.ule.fenxiao.action;

import com.ule.fenxiao.dao.UserMapper;
import com.ule.fenxiao.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by zongruibiao on 2017/2/27.
 */
@Controller
public class UserController {

    @Autowired
    UserMapper server;
    @RequestMapping("/queryAllUser")
    public  String queryAllUser(){
       List<UserInfo> result= server.queryAll();
       return "item/userList";
   }
}
