package com.ule.fenxiao.dao;


import com.ule.fenxiao.config.MyMapper;
import com.ule.fenxiao.vo.Listing;

import java.util.List;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
public interface ListingMapper  extends MyMapper<Listing> {
    List<Listing> findALl();
    List<Listing> findByListId(int listId);
}
