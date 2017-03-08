package com.ule.fenxiao.dao;

import com.ule.fenxiao.vo.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by zongruibiao on 2017/3/7.
 */
@Mapper
public interface ItemMapper  {

     List<Item> findALl();
     Item finByItemId(int itemId);
     void updateByItemId(Item item);
     void saveItem(Item item);
     void delByItemId(int itemId);
     Item queryByItem(Item item);
     List<Item> queryByItemIdList(List<Long> list);
     List<Item> queryByItemIdMap(Map<String,Object> map);
     int getSaveItemId(Item item);
}
