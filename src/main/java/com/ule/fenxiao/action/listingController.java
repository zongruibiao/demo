package com.ule.fenxiao.action;

import com.ule.fenxiao.dao.ListingMapper;
import com.ule.fenxiao.vo.Listing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
@Controller
public class listingController {

    @Autowired
    ListingMapper listingMapper;

    @RequestMapping("/findByListId/{listId}")
    public @ResponseBody  String findByListId(Model model, @PathVariable int listId){
        List<Listing> result=listingMapper.findByListId(listId);
        model.addAttribute("resultList",result);
        return result.toString();
    }
}