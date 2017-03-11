package com.ule.fenxiao.vo;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

/**
 * 商品javabean   modify by kangtao 2015-4-17
 */

public class Listing implements Serializable {
	
	private static final long serialVersionUID = -4823374901903383012L;
    private Long listId;	// 主键
    private String listName;
    private Long merchantId;
    private String merchantName;
    private String storeName;
    private Integer storeId; 
    private Long prdId;
    private Long categoryId;

    @Transient
    private List<Item> itemList;

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Long getPrdId() {
        return prdId;
    }

    public void setPrdId(Long prdId) {
        this.prdId = prdId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "listId=" + listId +
                ", listName='" + listName + '\'' +
                ", merchantId=" + merchantId +
                ", merchantName='" + merchantName + '\'' +
                ", storeName='" + storeName + '\'' +
                ", storeId=" + storeId +
                ", prdId=" + prdId +
                ", categoryId=" + categoryId +
                ", itemList=" + itemList.toString() +
                '}';
    }
}
