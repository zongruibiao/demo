package com.ule.fenxiao.action;

import com.ule.fenxiao.dao.UserMapper;
import com.ule.fenxiao.vo.Listing;
import com.ule.fenxiao.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zongruibiao on 2017/2/27.
 */
@Controller
public class UserController {

    @Autowired
    UserMapper server;


    @RequestMapping("/deleteByExample")
    public @ResponseBody String deleteByExample(){
        UserInfo userInfo=new UserInfo();
        userInfo.setId(1L);
        userInfo.setUserInfoName("测试");
        server.updateByPrimaryKey(userInfo);
        //server.deleteByExample(userInfo);
       return "删除成功";
   }
}
