package com.ule.fenxiao.vo;

import java.io.Serializable;

/**
 * Created by LRQ
 *
 * @author LRQ
 *         Date: 2009-7-8
 *         Time: 15:10:14
 */
public class Item implements Serializable {
    private static final long serialVersionUID = -4778074048982241351L;    
    private Long itemId;
    private String itemName;
    private Long listId;
    private Integer storeId;
    private Long merchantId;
    private String imgUrl;
    private Integer weight;
    private Integer storage;
    private Float price;
    private Float salPrice;
    private Integer soldCount;
    private String sku;
    private Long reqVal2Id;
    private Long reqVal1Id;
    private String attribute;
    private Integer createTime;
    private Integer updateTime;
    private Byte itemFlag;
    private Float oldPrice;
    private String colorDisplayImg;
    private Integer merchantStorage;
    private Integer operateStateTime;
    private String nationalStandardNumber;
    private Byte shipmentState;
    private Byte delFlag;
    private Byte itemState;
    private Byte itemSource;
    private String standardAttributeIds;
    private Byte contentApprovedState;
    private Integer contentApprovedTime;
    private Integer firstOnlineTime;    
    private String storeCode;
    private Integer offlineCode;//备注对应的字段CODE
    private Integer onlineableTime; // 处罚性下架可上架时间
	/******退回原因******/
    private String backReason;        
    
    private Byte itemType;
    
    private String remark ; //备注
    private Byte operateSource ; //操作来源
    
    
    /******关于河南分销申请下架的相关字段******/
    private Byte subItemState; //子状态
    private Integer applyOffshelvesTime; // 申请下架时间
    private Integer applyPassTime; // 申请通过时间
    private String boxBarcode;//箱装条形码
    
    public String getBackReason() {
		return backReason;
	}

	public void setBackReason(String backReason) {
		this.backReason = backReason;
	}

	public Byte getContentApprovedState() {
		return contentApprovedState;
	}

	public void setContentApprovedState(Byte contentApprovedState) {
		this.contentApprovedState = contentApprovedState;
	}

	public Byte getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Byte delFlag) {
		this.delFlag = delFlag;
	}

	public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }


    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }


    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }


    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }


    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }


    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }


    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }


    public Float getSalPrice() {
        return salPrice;
    }

    public void setSalPrice(Float salPrice) {
        this.salPrice = salPrice;
    }


    public Integer getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(Integer soldCount) {
        this.soldCount = soldCount;
    }


    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }


    public Long getReqVal1Id() {
        return reqVal1Id;
    }

    public void setReqVal1Id(Long reqVal1Id) {
        this.reqVal1Id = reqVal1Id;
    }


    public Long getReqVal2Id() {
        return reqVal2Id;
    }

    public void setReqVal2Id(Long reqVal2Id) {
        this.reqVal2Id = reqVal2Id;
    }


    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }


    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }


    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }


    public Byte getItemFlag() {
        return itemFlag;
    }

    public void setItemFlag(Byte itemFlag) {
        this.itemFlag = itemFlag;
    }
      
    public Float getOldPrice() {
		return oldPrice;
	}

	public void setOldPrice(Float oldPrice) {
		this.oldPrice = oldPrice;
	}
	
	public String getColorDisplayImg() {
		return colorDisplayImg;
	}

	public void setColorDisplayImg(String colorDisplayImg) {
		this.colorDisplayImg = colorDisplayImg;
	}
	
	public Integer getMerchantStorage() {
		return merchantStorage;
	}

	public void setMerchantStorage(Integer merchantStorage) {
		this.merchantStorage = merchantStorage;
	}	
	
	public Integer getOperateStateTime() {
		return operateStateTime;
	}

	public void setOperateStateTime(Integer operateStateTime) {
		this.operateStateTime = operateStateTime;
	}

	public String getNationalStandardNumber() {
		return nationalStandardNumber;
	}

	public void setNationalStandardNumber(String nationalStandardNumber) {
		this.nationalStandardNumber = nationalStandardNumber;
	}

	public Byte getShipmentState() {
		return shipmentState;
	}

	public void setShipmentState(Byte shipmentState) {
		this.shipmentState = shipmentState;
	}	
	
	public Byte getItemState() {
		return itemState;
	}

	public void setItemState(Byte itemState) {
		this.itemState = itemState;
	}	
	
	public Byte getItemSource() {
		return itemSource;
	}

	public void setItemSource(Byte itemSource) {
		this.itemSource = itemSource;
	}	

	public String getStandardAttributeIds() {
		return standardAttributeIds;
	}

	public void setStandardAttributeIds(String standardAttributeIds) {
		this.standardAttributeIds = standardAttributeIds;
	}	

	public Byte getItemType() {
		return itemType;
	}

	public void setItemType(Byte itemType) {
		this.itemType = itemType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getOfflineCode() {
		return this.offlineCode;
	}

	public void setOfflineCode(Integer offlineCode) {
		this.offlineCode = offlineCode;
	}

	public Byte getOperateSource() {
		return operateSource;
	}

	public void setOperateSource(Byte operateSource) {
		this.operateSource = operateSource;
	}	

	public Integer getContentApprovedTime() {
		return contentApprovedTime;
	}

	public void setContentApprovedTime(Integer contentApprovedTime) {
		this.contentApprovedTime = contentApprovedTime;
	}

	public Integer getFirstOnlineTime() {
		return firstOnlineTime;
	}

	public void setFirstOnlineTime(Integer firstOnlineTime) {
		this.firstOnlineTime = firstOnlineTime;
	}
	
	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	

	public Integer getOnlineableTime() {
		return onlineableTime;
	}

	public void setOnlineableTime(Integer onlineableTime) {
		this.onlineableTime = onlineableTime;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (attribute == null) {
			if (other.attribute != null)
				return false;
		} else if (!attribute.equals(other.attribute))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (imgUrl == null) {
			if (other.imgUrl != null)
				return false;
		} else if (!imgUrl.equals(other.imgUrl))
			return false;
		if (itemFlag == null) {
			if (other.itemFlag != null)
				return false;
		} else if (!itemFlag.equals(other.itemFlag))
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (listId == null) {
			if (other.listId != null)
				return false;
		} else if (!listId.equals(other.listId))
			return false;
		if (merchantId == null) {
			if (other.merchantId != null)
				return false;
		} else if (!merchantId.equals(other.merchantId))
			return false;
		if (oldPrice == null) {
			if (other.oldPrice != null)
				return false;
		} else if (!oldPrice.equals(other.oldPrice))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (reqVal1Id == null) {
			if (other.reqVal1Id != null)
				return false;
		} else if (!reqVal1Id.equals(other.reqVal1Id))
			return false;
		if (reqVal2Id == null) {
			if (other.reqVal2Id != null)
				return false;
		} else if (!reqVal2Id.equals(other.reqVal2Id))
			return false;
		if (salPrice == null) {
			if (other.salPrice != null)
				return false;
		} else if (!salPrice.equals(other.salPrice))
			return false;
		if (sku == null) {
			if (other.sku != null)
				return false;
		} else if (!sku.equals(other.sku))
			return false;
		if (soldCount == null) {
			if (other.soldCount != null)
				return false;
		} else if (!soldCount.equals(other.soldCount))
			return false;
		if (storage == null) {
			if (other.storage != null)
				return false;
		} else if (!storage.equals(other.storage))
			return false;
		if (storeId == null) {
			if (other.storeId != null)
				return false;
		} else if (!storeId.equals(other.storeId))
			return false;
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		if (colorDisplayImg == null) {
			if (other.colorDisplayImg != null)
				return false;
		} else if (!colorDisplayImg.equals(other.colorDisplayImg))
			return false;
		if (merchantStorage == null) {
			if (other.merchantStorage != null)
				return false;
		} else if (!merchantStorage.equals(other.merchantStorage))
			return false;
		if (operateStateTime == null) {
			if (other.operateStateTime != null)
				return false;
		} else if (!operateStateTime.equals(other.operateStateTime))
			return false;
		if (shipmentState == null) {
			if (other.shipmentState != null)
				return false;
		} else if (!shipmentState.equals(other.shipmentState))
			return false;
		if (nationalStandardNumber == null) {
			if (other.nationalStandardNumber != null)
				return false;
		} else if (!nationalStandardNumber.equals(other.nationalStandardNumber))
			return false;
		if (delFlag == null) {
			if (other.delFlag != null)
				return false;
		} else if (!delFlag.equals(other.delFlag))
			return false;
		if (itemState == null) {
			if (other.itemState != null)
				return false;
		} else if (!itemState.equals(other.itemState))
			return false;
		if (itemSource == null) {
			if (other.itemSource != null)
				return false;
		} else if (!itemSource.equals(other.itemSource))
			return false;

		if (standardAttributeIds == null) {
			if (other.standardAttributeIds != null)
				return false;
		} else if (!standardAttributeIds.equals(other.standardAttributeIds))
			return false;
		
		return true;
	}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((attribute == null) ? 0 : attribute.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((imgUrl == null) ? 0 : imgUrl.hashCode());
		result = prime * result
				+ ((itemFlag == null) ? 0 : itemFlag.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result
				+ ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((listId == null) ? 0 : listId.hashCode());
		result = prime * result
				+ ((merchantId == null) ? 0 : merchantId.hashCode());
		result = prime * result
				+ ((oldPrice == null) ? 0 : oldPrice.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result
				+ ((reqVal1Id == null) ? 0 : reqVal1Id.hashCode());
		result = prime * result
				+ ((reqVal2Id == null) ? 0 : reqVal2Id.hashCode());
		result = prime * result
				+ ((salPrice == null) ? 0 : salPrice.hashCode());
		result = prime * result + ((sku == null) ? 0 : sku.hashCode());
		result = prime * result
				+ ((soldCount == null) ? 0 : soldCount.hashCode());
		result = prime * result + ((storage == null) ? 0 : storage.hashCode());
		result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
		result = prime * result
				+ ((updateTime == null) ? 0 : updateTime.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		result = prime * result + ((colorDisplayImg == null) ? 0 : colorDisplayImg.hashCode());
		result = prime * result + ((merchantStorage == null) ? 0 : merchantStorage.hashCode());
		result = prime * result + ((operateStateTime == null) ? 0 : operateStateTime.hashCode());
		result = prime * result + ((shipmentState == null) ? 0 : shipmentState.hashCode());
		result = prime * result + ((nationalStandardNumber == null) ? 0 : nationalStandardNumber.hashCode());
		result = prime * result + ((delFlag == null) ? 0 : delFlag.hashCode());
		result = prime * result + ((itemState == null) ? 0 : itemState.hashCode());
		result = prime * result + ((itemSource == null) ? 0 : itemSource.hashCode());
		result = prime * result + ((standardAttributeIds == null) ? 0 : standardAttributeIds.hashCode());
		return result;
	}
    
    
	public Byte getSubItemState() {
		return subItemState;
	}

	public void setSubItemState(Byte subItemState) {
		this.subItemState = subItemState;
	}

	public Integer getApplyOffshelvesTime() {
		return applyOffshelvesTime;
	}

	public void setApplyOffshelvesTime(Integer applyOffshelvesTime) {
		this.applyOffshelvesTime = applyOffshelvesTime;
	}

	public Integer getApplyPassTime() {
		return applyPassTime;
	}

	public void setApplyPassTime(Integer applyPassTime) {
		this.applyPassTime = applyPassTime;
	}
	
	private String md5Verify;


	public String getMd5Verify() {
		return md5Verify;
	}

	public void setMd5Verify(String md5Verify) {
		this.md5Verify = md5Verify;
	}
	
	public String getBoxBarcode() {
		return boxBarcode;
	}

	public void setBoxBarcode(String boxBarcode) {
		this.boxBarcode = boxBarcode;
	}

	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName
				+ ", listId=" + listId + ", storeId=" + storeId
				+ ", merchantId=" + merchantId + ", imgUrl=" + imgUrl
				+ ", weight=" + weight + ", storage=" + storage + ", price="
				+ price + ", salPrice=" + salPrice + ", soldCount=" + soldCount
				+ ", sku=" + sku + ", reqVal2Id=" + reqVal2Id + ", reqVal1Id="
				+ reqVal1Id + ", attribute=" + attribute + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", itemFlag="
				+ itemFlag + ", oldPrice=" + oldPrice + ", colorDisplayImg="
				+ colorDisplayImg + ", merchantStorage=" + merchantStorage
				+ ", operateStateTime=" + operateStateTime
				+ ", nationalStandardNumber=" + nationalStandardNumber
				+ ", shipmentState=" + shipmentState + ", delFlag=" + delFlag
				+ ", itemState=" + itemState + ", itemSource=" + itemSource
				+ ", standardAttributeIds=" + standardAttributeIds
				+ ", contentApprovedState=" + contentApprovedState
				+ ", contentApprovedTime=" + contentApprovedTime
				+ ", firstOnlineTime=" + firstOnlineTime + ", storeCode="
				+ storeCode + ", offlineCode=" + offlineCode
				+ ", onlineableTime=" + onlineableTime + ", backReason="
				+ backReason + ", itemType=" + itemType + ", remark=" + remark
				+ ", operateSource=" + operateSource + ", subItemState="
				+ subItemState + ", applyOffshelvesTime=" + applyOffshelvesTime
				+ ", applyPassTime=" + applyPassTime + ", md5Verify="
				+ md5Verify + "]";
	}
}
