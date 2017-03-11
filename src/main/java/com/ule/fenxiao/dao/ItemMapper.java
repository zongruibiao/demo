package com.ule.fenxiao.dao;

import com.ule.fenxiao.config.MyMapper;
import com.ule.fenxiao.vo.Item;

import java.util.List;
import java.util.Map;

/**
 * Created by zongruibiao on 2017/3/7.
 *
 */
public interface ItemMapper  extends MyMapper<Item> {

     List<Item> findALl();
     Item finByItemId(int itemId);
     void updateByItemId(Item item);
     void saveItem(Item item);
     void delByItemId(int itemId);
     Item queryByItem(Item item);
     List<Item> queryByItemIdList(List<Long> list);
     List<Item> queryByItemIdMap(Map<String, Object> map);
     int getSaveItemId(Item item);
}
