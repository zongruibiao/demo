package com.ule.fenxiao.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ule.fenxiao.dao.ItemMapper;
import com.ule.fenxiao.vo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * Created by zongruibiao on 2017/3/7.
 */

@Controller
public class itemController {

    @Autowired
    ItemMapper itemMapper;

    @RequestMapping("/query/queryAllItem")
    public String queryAllItem(Model model){
        List<Item> result=itemMapper.findALl();
        //Item item=new Item();
        //item.setItemId(63820101L);
        //result=itemMapper.select(item);
        model.addAttribute("resultList",result);
        return "item/itemList";
    }
    @RequestMapping("/queryByPage/{currentPage}")
    public String queryByPage(Model model,@PathVariable Integer currentPage){
        /**
         * 第一个参数是第几页；第二个参数是每页显示条数。
         */
        if(currentPage!=null){
            PageHelper.startPage(currentPage,1);
        }
        //List<Item> result=itemMapper.findALl();
        PageInfo    pageInfo=new PageInfo(itemMapper.findALl());
        model.addAttribute("pageInfo",pageInfo);
        return "item/itemList";
    }

    @RequestMapping("/finByItemId/{itemId}")
    public String finByItemId(@PathVariable String itemId,Model model){
        Item result=itemMapper.finByItemId(Integer.valueOf(itemId));
        model.addAttribute("resultList",result);
        return "item/itemList";
    }

    @RequestMapping("/updateByItemId")
    public @ResponseBody String updateByItemId(){
        Item item=new Item();
        item.setItemName("七匹狼潮流服装");
        item.setStoreId(110);
        item.setMerchantId(100983L);
        item.setItemId(63821001L);
        itemMapper.updateByItemId(item);
        return "修改成功";
    }

    @RequestMapping("/saveItemInfo")
    public @ResponseBody String saveItemInfo(){
        Item item=new Item();
        item.setItemId(86741901L);
        item.setItemName("潮流服装");
        item.setListId(867419L);
        item.setStoreId(2096);
        item.setMerchantId(100983L);
        itemMapper.saveItem(item);
        return "保存成功";
    }

    /**
     * 返回插入的主键Id
     * @return
     */
    @RequestMapping(value = "/getSaveItemId")
    public @ResponseBody String getSaveItemId(){
        Item item=new Item();
        item.setItemName("潮流服装");
        item.setListId(129L);
        item.setStoreId(2096);
        item.setMerchantId(100983L);
        itemMapper.getSaveItemId(item);
        return "保存成功"+item.getItemId();
    }

    @RequestMapping("/delByItemId/{itemId}")
    public @ResponseBody  String delByItemId(@PathVariable Integer itemId){
        itemMapper.delByItemId(itemId);
        return "删除成功";
    }

    @RequestMapping("/queryByItem")
    public String queryByItem(Model model){
        Item item=new Item();
        item.setItemId(63830801L);
        item.setListId(638308L);
        Item result=itemMapper.queryByItem(item);
        System.out.println(result.toString());
        model.addAttribute("resultList",result);
        return "item/itemList";
    }

    @RequestMapping("/queryByItemIdList")
    public String queryByItemIdList(Model model){
        List<Item> result=itemMapper.queryByItemIdList(Arrays.asList(63830801L,63830802L));
        model.addAttribute("resultList",result);
        return "item/itemList";
    }

    @RequestMapping("/queryByItemIdMap")
    public String queryByItemIdMap(Model model){
        Map<String,Object> map=new HashMap();
        map.put("itemName","奥迪多规格");
        map.put("ids",Arrays.asList(63830801L,63830802L));
        List<Item> result=itemMapper.queryByItemIdMap(map);
        model.addAttribute("resultList",result);
        return "item/itemList";
    }

}
