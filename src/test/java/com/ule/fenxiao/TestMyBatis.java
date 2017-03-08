package com.ule.fenxiao;

import com.ule.fenxiao.dao.UserMapper;
import com.ule.fenxiao.vo.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by zongruibiao on 2017/3/3.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMyBatis {
    @Autowired
    UserMapper server;

    @Test
    public  void queryAllUser(){
        List<UserInfo> result= server.queryAll();
        System.out.println(result.toString());
    }
}
