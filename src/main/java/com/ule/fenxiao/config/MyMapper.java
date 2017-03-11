package com.ule.fenxiao.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by zongruibiao on 2017/3/9.
 * 被继承的Mapper，一般业务Mapper继承它
 * 不要把MyMapper放到同其他Mapper一起，该类不能被当做普通Mapper一样被扫描，否则会出错
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
