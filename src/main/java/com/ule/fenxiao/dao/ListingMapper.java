package com.ule.fenxiao.dao;

import com.ule.fenxiao.vo.Item;
import com.ule.fenxiao.vo.Listing;

import java.util.List;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
public interface ListingMapper {
    List<Listing> findALl();
    List<Listing> findByListId(int listId);
}
