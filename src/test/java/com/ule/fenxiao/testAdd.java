//package com.ule.fenxiao;
//
//import com.ule.fenxiao.dao.IUserService;
//import com.ule.fenxiao.dto.SearchDto;
//import com.ule.fenxiao.tools.BaseSearch;
//import com.ule.fenxiao.tools.SearchTools;
//import com.ule.fenxiao.vo.UserInfo;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.List;
//
///**
// * Created by zongruibiao on 2017/3/1.
// */
//@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
//public class testAdd {
//    @Autowired
//    private IUserService userService;
//
//   // @Test
//    public void add(){
//        UserInfo user=new UserInfo();
//        user.setUserInfoName("天风");
//        user.setUserInfoEmail("tianfeng@163.com");
//        user.setUserInfoAddress("青州人");
//        user.setUserInfoTel("15951550575");
//        userService.save(user);
//
//
//    }
//
//    //@Test
//    public void queryByName(){
//       List<UserInfo> result= userService.findAll(new BaseSearch<UserInfo>(new SearchDto("id","gt","1")));
//       for(UserInfo user : result){
//           System.out.println(user.toString());
//       }
//    }
//
//    @Test
//    public void queryByTools(){
//        List<UserInfo> list = userService.findAll(SearchTools.buildSpecification(
//                SearchTools.buildSpeDto("and", new SearchDto("and", "id", "gt", 2)),
//                SearchTools.buildSpeDto("and", new SearchDto("userName", "ne", "user5"),
//                        new SearchDto("or", "userName", "ne", "user9"))
//        ));
//        printResult(list);
//    }
//
//    public  void printResult( List<UserInfo>  result){
//        for(UserInfo user :result){
//            System.out.println(user.toString());
//        }
//    }
//}
