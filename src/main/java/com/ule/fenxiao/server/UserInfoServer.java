package com.ule.fenxiao.server;

import com.ule.fenxiao.vo.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zongruibiao on 2017/3/2.
 */
public interface UserInfoServer {

     List<UserInfo> findAllUserInfo();
}
