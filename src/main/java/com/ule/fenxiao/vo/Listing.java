package com.ule.fenxiao.vo;

import java.io.Serializable;

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
    private Integer storeCls1;
    private Integer storeCls2;
    private Integer storeCls3;
    private Long brand;
    private Integer weight;
    private Long defItemId;
    private String defImgUrl;
    private Integer storage;
    private Integer merchantStorage;
    private Integer soldCount;
    private Integer createTime;
    private Integer updateTime;
    private Float minPrice;
    private Float maxPrice;
    private String reqVal1Ids;
    private String reqVal2Ids;
    private String attribute;
    private String listDesc;
    private String promotionIds;
    private String tag;
    private Byte delFlag;
    private String md5Verify;
    private Integer starId;
    private Integer adId;
    private String dcCode;
    private String dcName;
    private String single;
    private Byte limitWay;
    private Integer limitNum;
    private Float oldPrice;
    private Float freight;
    private Float insurance;
    private String promotionDesc;
    private Byte deliveryType;
    private String searchTag;
    private Integer startShipmentDate;
    private Integer endShipmentDate;
    private Byte colorDisplayType;
    private Integer arrivalDate;
    private Integer deliveryMinDay;
    private Integer deliveryMaxDay;
    private Byte priceApprovedState;
    private Integer operateStateTime;
    private String listNumber;
    private Float tax;
    private Byte listingSource;
    private Integer packageCount;
    private Short saleMode;
    private Byte listingType;
    private Byte listingState;
    private Byte searchEngineFlag;
    private String labels;
    private Integer userId;
    private String userName;
	private Integer effectTime;
	private Integer failureTime;    
	private String remark;
    private Byte searchOption=null;
    private String imgUrls = null;
    private Integer uleCardPay;
    private Integer logisticsWay;
    private String packageSizeInfo;
    private Double merchantFreightPay;
    private Integer prepareCargoTime;
    private Long otherListId;
    private Integer localSpecialty;
    private Long oldListId;
    private String sellUnit;
    private Byte boxSell;
    private String sellUnitSingle;
	private String standardAttributeIds;
    private Integer priceApprovedTime;
    private Integer firstOnlineTime;
    private String packageWeight;
    private Byte priceCompare;
    private Integer saleChannelsId;			// 销售渠道ID
	private String saleChannelName;			// 销售渠道
	private Integer directProvince;			// 定向省份
    private String listPromotionName;		// 副标题
    private Integer allowChangePrice;		// 是否允许变价
    private Integer automateShelve;			// 是否自动上架
    private Integer automateShelveHour;		// 自动上架时间
    private Integer zoneProposalFlag;		// 专区提取标志  0:待提取 1:已提取
    private String jqListDesc;				// 商品描述的静态页面的地址
    private Float agencyRate;				// 代理费率
    private Float purchasePrice = null;		// 进价
    private Byte settlementType = null;		// 结算方式
    private Float settlementPoint = null; 	// 返点数
    private Byte shipmentType = null;		// 发货方式
    private String nationalStandardNumber = null;	// 国标码
    private String listPackageName;			// 商品包装名称
    private Integer validityTerm;			// 商品有效期
    private Byte packageType;				// 包装类型
    private Integer storeSortNum = null;	// 商品店铺排序序号
    private Integer expiryValue=null;		// 商品有效期
    private Byte orginPlace=null;			// 商品产地
    private Float priceSearchFactor=null;	// 价格搜索因子
    private String desPurPrice; 			// 加密进价
    private Integer saleLimitNum; 			// 负毛利限购数量
    private Float netProfit;				// 净毛利
    private Integer offlineCode; 			// 下架原因代码CODE
    private Integer onlineableTime; 		// 处罚性下架可上架时间
    private Integer listBargaining;			// 议价(0不支持议价，1支持议价)
    private String generalFlag;				// 通用标志  值1,2.1标识优选农品，2用于搜索
    private String promotionDescTwo; 		// 新秒杀的标签描述
    private Byte isEmsFreight; 				// 必须EMS发货   0支持，-1不支持。
    private Byte isReturnSevendays;			// 是否支持7天无理由退换货   0支持，-1不支持。
    private String listingTag ;			// 默认为空，有值以半角逗号分隔，该字段是可扩展字段。1210：代表top200热销推荐商品 1211：天猫热销推荐商品 1212：京东热销推荐商品 1213：一号店热销推荐商品
    private String videoUrl ;			// 商品视频链接地址
    
    private Integer thirdPlatformId;			//第三方导入平台Id
    private Long thirdProductId;            //第三方商品Id
    private Float thirdProductPrice;        //第三方商品价格
    private String takeWay;    //提货方式
    private String validPeriod ; //有效期
    private String thirdPrdId;//新第三方商品Id
    private Long cuzFreTemplateId;//自定义运费模板id
    
    /** 有参，无参构造 **/
    public Listing() {
	}

	public Listing(Long listId, String listName, Long merchantId,
			String merchantName, String storeName, Integer storeId, Long prdId,
			Long categoryId, Integer storeCls1, Integer storeCls2,
			Integer storeCls3, Long brand, Integer weight, Long defItemId,
			String defImgUrl, Integer storage, Integer soldCount,
			Integer createTime, Integer updateTime, Float minPrice,
			Float maxPrice, String reqVal1Ids, String reqVal2Ids,
			String attribute, String listDesc, String promotionIds, String tag,
			Byte delFlag, Integer starId, Integer adId, String dcCode,
			String dcName, String single, Byte limitWay, Integer limitNum,
			Float oldPrice, Float freight, Float insurance,String promotionDesc,
			Byte deliveryType,String searchTag,Integer startShipmentDate,
			Integer endShipmentDate,Byte colorDisplayType,Integer merchantStorage,Integer arrivalDate,
			Integer deliveryMinDay,Integer deliveryMaxDay , String takeWay,String validPeriod,String thirdPrdId) {
		this.listId = listId;
		this.listName = listName;
		this.merchantId = merchantId;
		this.merchantName = merchantName;
		this.storeName = storeName;
		this.storeId = storeId;
		this.prdId = prdId;
		this.categoryId = categoryId;
		this.storeCls1 = storeCls1;
		this.storeCls2 = storeCls2;
		this.storeCls3 = storeCls3;
		this.brand = brand;
		this.weight = weight;
		this.defItemId = defItemId;
		this.defImgUrl = defImgUrl;
		this.storage = storage;
		this.soldCount = soldCount;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.reqVal1Ids = reqVal1Ids;
		this.reqVal2Ids = reqVal2Ids;
		this.attribute = attribute;
		this.listDesc = listDesc;
		this.promotionIds = promotionIds;
		this.tag = tag;
		this.delFlag = delFlag;
		this.starId = starId;
		this.adId = adId;
		this.dcCode = dcCode;
		this.dcName = dcName;
		this.single = single;
		this.limitWay = limitWay;
		this.limitNum = limitNum;
		this.oldPrice = oldPrice;
		this.freight = freight;
		this.insurance = insurance;
		this.promotionDesc = promotionDesc;
		this.deliveryType = deliveryType;
		this.searchTag = searchTag;
		this.startShipmentDate = startShipmentDate;
		this.endShipmentDate = endShipmentDate;
		this.colorDisplayType = colorDisplayType;
		this.merchantStorage = merchantStorage;
		this.arrivalDate = arrivalDate;
		this.deliveryMinDay = deliveryMinDay;
		this.deliveryMaxDay =  deliveryMaxDay;
		this.takeWay = takeWay;
		this.validPeriod = validPeriod;
		this.thirdPrdId = thirdPrdId;
	}

       /*重载构造函数，物品比较用
     * zhangchen
     */
    public Listing(Long listId, String listName, Long merchantId,
			String merchantName, String storeName, Integer storeId, Long prdId,
			Long categoryId, Integer storeCls1, Integer storeCls2,
			Integer storeCls3, Long brand, Integer weight, Long defItemId,
			String defImgUrl, Integer storage, Integer soldCount,
			Integer createTime, Integer updateTime, Float minPrice,
			Float maxPrice, String promotionIds, String tag,
			Byte delFlag, Integer starId, Integer adId, String dcCode,
			String dcName, String single,Integer arrivalDate,
			Integer deliveryMinDay,Integer deliveryMaxDay) {
		this.listId = listId;
		this.listName = listName;
		this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.storeName = storeName;
        this.storeId = storeId;
        this.prdId = prdId;
        this.categoryId = categoryId;
        this.storeCls1 = storeCls1;
        this.storeCls2 = storeCls2;
        this.storeCls3 = storeCls3;
        this.brand = brand;
        this.weight = weight;
        this.defItemId = defItemId;
        this.defImgUrl = defImgUrl;
        this.storage = storage;
        this.soldCount = soldCount;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.promotionIds = promotionIds;
        this.tag = tag;
        this.delFlag = delFlag;
        this.starId = starId;
        this.adId = adId;
        this.dcCode = dcCode;
        this.dcName = dcName;
        this.single = single;
        this.arrivalDate = arrivalDate;
		this.deliveryMinDay = deliveryMinDay;
		this.deliveryMaxDay =  deliveryMaxDay;
    }
    
    /** setter,getter方法 **/
    public String getPromotionDescTwo() {
		return promotionDescTwo;
	}
	public void setPromotionDescTwo(String promotionDescTwo) {
		this.promotionDescTwo = promotionDescTwo;
	}
	public String getListingTag() {
		return listingTag;
	}
	public void setListingTag(String listingTag) {
		this.listingTag = listingTag;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
    public Float getAgencyRate() {
		return agencyRate;
	}
	public void setAgencyRate(Float agencyRate) {
		this.agencyRate = agencyRate;
	}
	public String getJqListDesc() {
		return jqListDesc;
	}
	public void setJqListDesc(String jqListDesc) {
		this.jqListDesc = jqListDesc;
	}
	public Integer getAutomateShelveHour() {
		return automateShelveHour;
	}
	public void setAutomateShelveHour(Integer automateShelveHour) {
		this.automateShelveHour = automateShelveHour;
	}
	public Integer getAllowChangePrice() {
		return allowChangePrice;
	}
	public void setAllowChangePrice(Integer allowChangePrice) {
		this.allowChangePrice = allowChangePrice;
	}
	public Integer getAutomateShelve() {
		return automateShelve;
	}
	public void setAutomateShelve(Integer automateShelve) {
		this.automateShelve = automateShelve;
	}
	public Integer getSaleChannelsId() {
		return saleChannelsId;
	}
	public void setSaleChannelsId(Integer saleChannelsId) {
		this.saleChannelsId = saleChannelsId;
	}
	public String getSaleChannelName() {
		return saleChannelName;
	}
	public void setSaleChannelName(String saleChannelName) {
		this.saleChannelName = saleChannelName;
	}
    public Integer getListBargaining() {
		return listBargaining;
	}
	public void setListBargaining(Integer listBargaining) {
		this.listBargaining = listBargaining;
	}
	public String getSellUnit() {
		return sellUnit;
	}
	public void setSellUnit(String sellUnit) {
		this.sellUnit = sellUnit;
	}
	public Byte getBoxSell() {
		return boxSell;
	}
	public void setBoxSell(Byte boxSell) {
		this.boxSell = boxSell;
	}
	public Integer getExpiryValue() {
		return expiryValue;
	}
	public void setExpiryValue(Integer expiryValue) {
		this.expiryValue = expiryValue;
	}
	public Byte getOrginPlace() {
		return orginPlace;
	}
	public void setOrginPlace(Byte orginPlace) {
		this.orginPlace = orginPlace;
	}
	public Byte getSettlementType() {
		return settlementType;
	}
	public void setSettlementType(Byte settlementType) {
		this.settlementType = settlementType;
	}
	public Float getSettlementPoint() {
		return settlementPoint;
	}
	public void setSettlementPoint(Float settlementPoint) {
		this.settlementPoint = settlementPoint;
	}
	public Byte getShipmentType() {
		return shipmentType;
	}
	public void setShipmentType(Byte shipmentType) {
		this.shipmentType = shipmentType;
	}
	public String getNationalStandardNumber() {
		return nationalStandardNumber;
	}
	public void setNationalStandardNumber(String nationalStandardNumber) {
		this.nationalStandardNumber = nationalStandardNumber;
	}
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
    public Integer getStoreCls1() {
        return storeCls1;
    }
    public void setStoreCls1(Integer storeCls1) {
        this.storeCls1 = storeCls1;
    }
    public Integer getStoreCls2() {
        return storeCls2;
    }
    public void setStoreCls2(Integer storeCls2) {
        this.storeCls2 = storeCls2;
    }
    public Integer getStoreCls3() {
        return storeCls3;
    }
    public void setStoreCls3(Integer storeCls3) {
        this.storeCls3 = storeCls3;
    }
    public Long getBrand() {
        return brand;
    }
    public void setBrand(Long brand) {
        this.brand = brand;
    }
    public Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    public Long getDefItemId() {
        return defItemId;
    }
    public void setDefItemId(Long defItemId) {
        this.defItemId = defItemId;
    }
    public String getDefImgUrl() {
        return defImgUrl;
    }
    public void setDefImgUrl(String defImgUrl) {
        this.defImgUrl = defImgUrl;
    }
    public Integer getStorage() {
        return storage;
    }
    public void setStorage(Integer storage) {
        this.storage = storage;
    }
    public Integer getSoldCount() {
        return soldCount;
    }
    public void setSoldCount(Integer soldCount) {
        this.soldCount = soldCount;
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
    public Float getMinPrice() {
        return minPrice;
    }
    public void setMinPrice(Float minPrice) {
        this.minPrice = minPrice;
    }
    public Float getMaxPrice() {
        return maxPrice;
    }
    public void setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
    }
    public String getReqVal1Ids() {
        return reqVal1Ids;
    }
    public void setReqVal1Ids(String reqVal1Ids) {
        this.reqVal1Ids = reqVal1Ids;
    }
    public String getReqVal2Ids() {
        return reqVal2Ids;
    }
    public void setReqVal2Ids(String reqVal2Ids) {
        this.reqVal2Ids = reqVal2Ids;
    }
    public String getAttribute() {
        return attribute;
    }
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    public String getListDesc() {
        return listDesc;
    }
    public void setListDesc(String listDesc) {
        this.listDesc = listDesc;
    }
    public String getPromotionIds() {
        return promotionIds;
    }
    public void setPromotionIds(String promotionIds) {
        this.promotionIds = promotionIds;
    }
    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }
    public Byte getDelFlag() {
        return delFlag;
    }
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
    public Integer getStarId() {
        return starId;
    }
    public void setStarId(Integer starId) {
        this.starId = starId;
    }
    public Integer getAdId() {
        return adId;
    }
    public void setAdId(Integer adId) {
        this.adId = adId;
    }
	public String getDcCode() {
		return dcCode;
	}
	public void setDcCode(String dcCode) {
		this.dcCode = dcCode;
	}
	public String getDcName() {
		return dcName;
	}
	public void setDcName(String dcName) {
		this.dcName = dcName;
	}
	public String getSingle() {
		return single;
	}
	public void setSingle(String single) {
		this.single = single;
	}
	public Byte getLimitWay() {
		return limitWay;
	}
	public void setLimitWay(Byte limitWay) {
		this.limitWay = limitWay;
	}
	public Integer getLimitNum() {
		return limitNum;
	}
	public void setLimitNum(Integer limitNum) {
		this.limitNum = limitNum;
	}
	public Float getOldPrice() {
		return oldPrice;
	}
	public void setOldPrice(Float oldPrice) {
		this.oldPrice = oldPrice;
	}
	public Float getFreight() {
		return freight;
	}
	public void setFreight(Float freight) {
		this.freight = freight;
	}
	public Float getInsurance() {
		return insurance;
	}
	public void setInsurance(Float insurance) {
		this.insurance = insurance;
	}
	public String getPromotionDesc() {
		return promotionDesc;
	}
	public void setPromotionDesc(String promotionDesc) {
		this.promotionDesc = promotionDesc;
	}
	public Byte getDeliveryType() {
		return deliveryType;
	}
	public void setDeliveryType(Byte deliveryType) {
		this.deliveryType = deliveryType;
	}
	public String getSearchTag() {
		return searchTag;
	}
	public void setSearchTag(String searchTag) {
		this.searchTag = searchTag;
	}
	public Integer getStartShipmentDate() {
		return startShipmentDate;
	}
	public void setStartShipmentDate(Integer startShipmentDate) {
		this.startShipmentDate = startShipmentDate;
	}
	public Integer getEndShipmentDate() {
		return endShipmentDate;
	}
	public void setEndShipmentDate(Integer endShipmentDate) {
		this.endShipmentDate = endShipmentDate;
	}
	public Byte getColorDisplayType() {
		return colorDisplayType;
	}
	public void setColorDisplayType(Byte colorDisplayType) {
		this.colorDisplayType = colorDisplayType;
	}
	public Integer getMerchantStorage() {
		return merchantStorage;
	}
	public void setMerchantStorage(Integer merchantStorage) {
		this.merchantStorage = merchantStorage;
	}
	public Integer getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Integer arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Integer getDeliveryMinDay() {
		return deliveryMinDay;
	}
	public void setDeliveryMinDay(Integer deliveryMinDay) {
		this.deliveryMinDay = deliveryMinDay;
	}
	public Integer getDeliveryMaxDay() {
		return deliveryMaxDay;
	}
	public void setDeliveryMaxDay(Integer deliveryMaxDay) {
		this.deliveryMaxDay = deliveryMaxDay;
	}	
	public Byte getPriceApprovedState() {
		return priceApprovedState;
	}
	public void setPriceApprovedState(Byte priceApprovedState) {
		this.priceApprovedState = priceApprovedState;
	}
	public Integer getOperateStateTime() {
		return operateStateTime;
	}
	public void setOperateStateTime(Integer operateStateTime) {
		this.operateStateTime = operateStateTime;
	}
	public String getListNumber() {
		return listNumber;
	}
	public void setListNumber(String listNumber) {
		this.listNumber = listNumber;
	}
	public Float getTax() {
		return tax;
	}
	public void setTax(Float tax) {
		this.tax = tax;
	}
	public Byte getListingSource() {
		return listingSource;
	}
	public void setListingSource(Byte listingSource) {
		this.listingSource = listingSource;
	}
	public Integer getPackageCount() {
		return packageCount;
	}
	public void setPackageCount(Integer packageCount) {
		this.packageCount = packageCount;
	}
	public Short getSaleMode() {
		return saleMode;
	}
	public void setSaleMode(Short saleMode) {
		this.saleMode = saleMode;
	}
	public Byte getListingType() {
		return listingType;
	}
	public void setListingType(Byte listingType) {
		this.listingType = listingType;
	}
	public Byte getListingState() {
		return listingState;
	}
	public void setListingState(Byte listingState) {
		this.listingState = listingState;
	}
	public Byte getSearchEngineFlag() {
		return searchEngineFlag;
	}
	public void setSearchEngineFlag(Byte searchEngineFlag) {
		this.searchEngineFlag = searchEngineFlag;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStandardAttributeIds() {
		return standardAttributeIds;
	}
	public void setStandardAttributeIds(String standardAttributeIds) {
		this.standardAttributeIds = standardAttributeIds;
	}
	public String getLabels() {
		return labels;
	}
	public void setLabels(String labels) {
		this.labels = labels;
	}
	public Float getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(Float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public String getImgUrls() {
		return imgUrls;
	}
	public void setImgUrls(String imgUrls) {
		this.imgUrls = imgUrls;
	}
	public Integer getEffectTime() {
		return effectTime;
	}
	public void setEffectTime(Integer effectTime) {
		this.effectTime = effectTime;
	}
	public Integer getFailureTime() {
		return failureTime;
	}
	public void setFailureTime(Integer failureTime) {
		this.failureTime = failureTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getPriceApprovedTime() {
		return priceApprovedTime;
	}
	public void setPriceApprovedTime(Integer priceApprovedTime) {
		this.priceApprovedTime = priceApprovedTime;
	}
	public Integer getFirstOnlineTime() {
		return firstOnlineTime;
	}
	public void setFirstOnlineTime(Integer firstOnlineTime) {
		this.firstOnlineTime = firstOnlineTime;
	}
	public String getListPackageName() {
		return listPackageName;
	}
	public void setListPackageName(String listPackageName) {
		this.listPackageName = listPackageName;
	}
	public Integer getValidityTerm() {
		return validityTerm;
	}
	public void setValidityTerm(Integer validityTerm) {
		this.validityTerm = validityTerm;
	}
	public Byte getPackageType() {
		return packageType;
	}
	public void setPackageType(Byte packageType) {
		this.packageType = packageType;
	}
	public Integer getStoreSortNum() {
		return storeSortNum;
	}
	public void setStoreSortNum(Integer storeSortNum) {
		this.storeSortNum = storeSortNum;
	}
	public String getListPromotionName() {
		return listPromotionName;
	}
	public void setListPromotionName(String listPromotionName) {
		this.listPromotionName = listPromotionName;
	}
	public Byte getSearchOption() {
		return searchOption;
	}
	public void setSearchOption(Byte searchOption) {
		this.searchOption = searchOption;
	}	
	public String getPackageWeight() {
		return packageWeight;
	}
	public void setPackageWeight(String packageWeight) {
		this.packageWeight = packageWeight;
	}
	public Float getNetProfit() {
		return netProfit;
	}
	public void setNetProfit(Float netProfit) {
		this.netProfit = netProfit;
	}
	public Integer getSaleLimitNum() {
		return saleLimitNum;
	}
	public void setSaleLimitNum(Integer saleLimitNum) {
		this.saleLimitNum = saleLimitNum;
	}
	public String getDesPurPrice() {
		return desPurPrice;
	}
	public void setDesPurPrice(String desPurPrice) {
		this.desPurPrice = desPurPrice;
	}
	public Float getPriceSearchFactor() {
		return priceSearchFactor;
	}
	public void setPriceSearchFactor(Float priceSearchFactor) {
		this.priceSearchFactor = priceSearchFactor;
	}
	public Integer getUleCardPay() {
		return uleCardPay;
	}
	public void setUleCardPay(Integer uleCardPay) {
		this.uleCardPay = uleCardPay;
	}
	public Integer getLogisticsWay() {
		return logisticsWay;
	}
	public void setLogisticsWay(Integer logisticsWay) {
		this.logisticsWay = logisticsWay;
	}
	public String getPackageSizeInfo() {
		return packageSizeInfo;
	}
	public void setPackageSizeInfo(String packageSizeInfo) {
		this.packageSizeInfo = packageSizeInfo;
	}
	public Double getMerchantFreightPay() {
		return merchantFreightPay;
	}
	public void setMerchantFreightPay(Double merchantFreightPay) {
		this.merchantFreightPay = merchantFreightPay;
	}
	public Integer getPrepareCargoTime() {
		return prepareCargoTime;
	}
	public void setPrepareCargoTime(Integer prepareCargoTime) {
		this.prepareCargoTime = prepareCargoTime;
	}
	public Long getOtherListId() {
		return otherListId;
	}
	public void setOtherListId(Long otherListId) {
		this.otherListId = otherListId;
	}
	public Integer getLocalSpecialty() {
		return localSpecialty;
	}
	public void setLocalSpecialty(Integer localSpecialty) {
		this.localSpecialty = localSpecialty;
	}
	public Long getOldListId() {
		return oldListId;
	}
	public void setOldListId(Long oldListId) {
		this.oldListId = oldListId;
	}
	public String getSellUnitSingle() {
		return sellUnitSingle;
	}
	public void setSellUnitSingle(String sellUnitSingle) {
		this.sellUnitSingle = sellUnitSingle;
	}
	public Integer getOnlineableTime() {
		return onlineableTime;
	}
	public void setOnlineableTime(Integer onlineableTime) {
		this.onlineableTime = onlineableTime;
	}
	public Integer getOfflineCode() {
		return offlineCode;
	}
	public String getGeneralFlag() {
		return generalFlag;
	}
	public void setGeneralFlag(String generalFlag) {
		this.generalFlag = generalFlag;
	}
	public void setOfflineCode(Integer offlineCode) {
		this.offlineCode = offlineCode;
	}
	public Byte getPriceCompare() {
		return priceCompare;
	}
	public void setPriceCompare(Byte priceCompare) {
		this.priceCompare = priceCompare;
	}
	public Integer getDirectProvince() {
		return directProvince;
	}
	public void setDirectProvince(Integer directProvince) {
		this.directProvince = directProvince;
	}
	public Integer getZoneProposalFlag() {
		return zoneProposalFlag;
	}
	public void setZoneProposalFlag(Integer zoneProposalFlag) {
		this.zoneProposalFlag = zoneProposalFlag;
	}
	public String getMd5Verify() {
		return md5Verify;
	}
	public void setMd5Verify(String md5Verify) {
		this.md5Verify = md5Verify;
	}
	public Byte getIsEmsFreight() {
		return isEmsFreight;
	}
	public void setIsEmsFreight(Byte isEmsFreight) {
		this.isEmsFreight = isEmsFreight;
	}
	public Byte getIsReturnSevendays() {
		return isReturnSevendays;
	}
	public void setIsReturnSevendays(Byte isReturnSevendays) {
		this.isReturnSevendays = isReturnSevendays;
	}
	public Integer getThirdPlatformId() {
		return thirdPlatformId;
	}

	public void setThirdPlatformId(Integer thirdPlatformId) {
		this.thirdPlatformId = thirdPlatformId;
	}

	public Long getThirdProductId() {
		return thirdProductId;
	}

	public void setThirdProductId(Long thirdProductId) {
		this.thirdProductId = thirdProductId;
	}

	public Float getThirdProductPrice() {
		return thirdProductPrice;
	}

	public void setThirdProductPrice(Float thirdProductPrice) {
		this.thirdProductPrice = thirdProductPrice;
	}
	
	public String getTakeWay() {
		return takeWay;
	}

	public void setTakeWay(String takeWay) {
		this.takeWay = takeWay;
	}

	public String getValidPeriod() {
		return validPeriod;
	}

	public void setValidPeriod(String validPeriod) {
		this.validPeriod = validPeriod;
	}

	
	
	public String getThirdPrdId() {
		return thirdPrdId;
	}

	public void setThirdPrdId(String thirdPrdId) {
		this.thirdPrdId = thirdPrdId;
	}
	

	public Long getCuzFreTemplateId() {
		return cuzFreTemplateId;
	}

	public void setCuzFreTemplateId(Long cuzFreTemplateId) {
		this.cuzFreTemplateId = cuzFreTemplateId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adId == null) ? 0 : adId.hashCode());
		result = prime * result
				+ ((attribute == null) ? 0 : attribute.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result
				+ ((categoryId == null) ? 0 : categoryId.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((dcCode == null) ? 0 : dcCode.hashCode());
		result = prime * result + ((dcName == null) ? 0 : dcName.hashCode());
		result = prime * result
				+ ((defImgUrl == null) ? 0 : defImgUrl.hashCode());
		result = prime * result
				+ ((defItemId == null) ? 0 : defItemId.hashCode());
		result = prime * result + ((delFlag == null) ? 0 : delFlag.hashCode());
		result = prime * result + ((freight == null) ? 0 : freight.hashCode());
		result = prime * result
				+ ((insurance == null) ? 0 : insurance.hashCode());
		result = prime * result
				+ ((limitNum == null) ? 0 : limitNum.hashCode());
		result = prime * result
				+ ((limitWay == null) ? 0 : limitWay.hashCode());
		result = prime * result
				+ ((listDesc == null) ? 0 : listDesc.hashCode());
		result = prime * result + ((listId == null) ? 0 : listId.hashCode());
		result = prime * result
				+ ((listName == null) ? 0 : listName.hashCode());
		result = prime * result
				+ ((maxPrice == null) ? 0 : maxPrice.hashCode());
		result = prime * result
				+ ((merchantId == null) ? 0 : merchantId.hashCode());
		result = prime * result
				+ ((merchantName == null) ? 0 : merchantName.hashCode());
		result = prime * result
				+ ((minPrice == null) ? 0 : minPrice.hashCode());
		result = prime * result
				+ ((oldPrice == null) ? 0 : oldPrice.hashCode());
		result = prime * result + ((prdId == null) ? 0 : prdId.hashCode());
		result = prime * result
				+ ((promotionIds == null) ? 0 : promotionIds.hashCode());
		result = prime * result
				+ ((reqVal1Ids == null) ? 0 : reqVal1Ids.hashCode());
		result = prime * result
				+ ((reqVal2Ids == null) ? 0 : reqVal2Ids.hashCode());
		result = prime * result + ((single == null) ? 0 : single.hashCode());
		result = prime * result
				+ ((soldCount == null) ? 0 : soldCount.hashCode());
		result = prime * result + ((starId == null) ? 0 : starId.hashCode());
		result = prime * result + ((storage == null) ? 0 : storage.hashCode());
		result = prime * result
				+ ((storeCls1 == null) ? 0 : storeCls1.hashCode());
		result = prime * result
				+ ((storeCls2 == null) ? 0 : storeCls2.hashCode());
		result = prime * result
				+ ((storeCls3 == null) ? 0 : storeCls3.hashCode());
		result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
		result = prime * result
				+ ((storeName == null) ? 0 : storeName.hashCode());
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
		result = prime * result
				+ ((updateTime == null) ? 0 : updateTime.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		result = prime * result + ((promotionDesc == null) ? 0 : promotionDesc.hashCode());
		result = prime * result + ((deliveryType == null) ? 0 : deliveryType.hashCode());
		result = prime * result + ((searchTag == null) ? 0 : searchTag.hashCode());
		result = prime * result + ((startShipmentDate == null) ? 0 : startShipmentDate.hashCode());
		result = prime * result + ((endShipmentDate == null) ? 0 : endShipmentDate.hashCode());
		result = prime * result + ((colorDisplayType == null) ? 0 : colorDisplayType.hashCode());
		result = prime * result + ((merchantStorage == null) ? 0 : merchantStorage.hashCode());
		result = prime * result + ((arrivalDate == null) ? 0 : arrivalDate.hashCode());
		result = prime * result + ((deliveryMinDay == null) ? 0 : deliveryMinDay.hashCode());
		result = prime * result + ((deliveryMaxDay == null) ? 0 : deliveryMaxDay.hashCode());
		result = prime * result + ((priceApprovedState == null) ? 0 : priceApprovedState.hashCode());
		result = prime * result + ((operateStateTime == null) ? 0 : operateStateTime.hashCode());
		result = prime * result + ((listNumber == null) ? 0 : listNumber.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((listingSource == null) ? 0 : listingSource.hashCode());
		result = prime * result + ((packageCount == null) ? 0 : packageCount.hashCode());
		result = prime * result + ((saleMode == null) ? 0 : saleMode.hashCode());
		result = prime * result + ((listingType == null) ? 0 : listingType.hashCode());
		result = prime * result + ((listingState == null) ? 0 : listingState.hashCode());
		result = prime * result + ((searchEngineFlag == null) ? 0 : searchEngineFlag.hashCode());
		result = prime * result + ((standardAttributeIds == null) ? 0 : standardAttributeIds.hashCode());
		result = prime * result + ((takeWay == null) ? 0 : takeWay.hashCode());
		result = prime * result + ((validPeriod == null) ? 0 : validPeriod.hashCode());
		result = prime * result + ((thirdPrdId == null) ? 0 : thirdPrdId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Listing other = (Listing) obj;
		if (adId == null) {
			if (other.adId != null)
				return false;
		} else if (!adId.equals(other.adId))
			return false;
		if (attribute == null) {
			if (other.attribute != null)
				return false;
		} else if (!attribute.equals(other.attribute))
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (categoryId == null) {
			if (other.categoryId != null)
				return false;
		} else if (!categoryId.equals(other.categoryId))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (dcCode == null) {
			if (other.dcCode != null)
				return false;
		} else if (!dcCode.equals(other.dcCode))
			return false;
		if (dcName == null) {
			if (other.dcName != null)
				return false;
		} else if (!dcName.equals(other.dcName))
			return false;
		if (defImgUrl == null) {
			if (other.defImgUrl != null)
				return false;
		} else if (!defImgUrl.equals(other.defImgUrl))
			return false;
		if (defItemId == null) {
			if (other.defItemId != null)
				return false;
		} else if (!defItemId.equals(other.defItemId))
			return false;
		if (delFlag == null) {
			if (other.delFlag != null)
				return false;
		} else if (!delFlag.equals(other.delFlag))
			return false;
		if (freight == null) {
			if (other.freight != null)
				return false;
		} else if (!freight.equals(other.freight))
			return false;
		if (insurance == null) {
			if (other.insurance != null)
				return false;
		} else if (!insurance.equals(other.insurance))
			return false;
		if (limitNum == null) {
			if (other.limitNum != null)
				return false;
		} else if (!limitNum.equals(other.limitNum))
			return false;
		if (limitWay == null) {
			if (other.limitWay != null)
				return false;
		} else if (!limitWay.equals(other.limitWay))
			return false;
		if (listDesc == null) {
			if (other.listDesc != null)
				return false;
		} else if (!listDesc.equals(other.listDesc))
			return false;
		if (listId == null) {
			if (other.listId != null)
				return false;
		} else if (!listId.equals(other.listId))
			return false;
		if (listName == null) {
			if (other.listName != null)
				return false;
		} else if (!listName.equals(other.listName))
			return false;
		if (maxPrice == null) {
			if (other.maxPrice != null)
				return false;
		} else if (!maxPrice.equals(other.maxPrice))
			return false;
		if (merchantId == null) {
			if (other.merchantId != null)
				return false;
		} else if (!merchantId.equals(other.merchantId))
			return false;
		if (merchantName == null) {
			if (other.merchantName != null)
				return false;
		} else if (!merchantName.equals(other.merchantName))
			return false;
		if (minPrice == null) {
			if (other.minPrice != null)
				return false;
		} else if (!minPrice.equals(other.minPrice))
			return false;
		if (oldPrice == null) {
			if (other.oldPrice != null)
				return false;
		} else if (!oldPrice.equals(other.oldPrice))
			return false;
		if (prdId == null) {
			if (other.prdId != null)
				return false;
		} else if (!prdId.equals(other.prdId))
			return false;
		if (promotionIds == null) {
			if (other.promotionIds != null)
				return false;
		} else if (!promotionIds.equals(other.promotionIds))
			return false;
		if (reqVal1Ids == null) {
			if (other.reqVal1Ids != null)
				return false;
		} else if (!reqVal1Ids.equals(other.reqVal1Ids))
			return false;
		if (reqVal2Ids == null) {
			if (other.reqVal2Ids != null)
				return false;
		} else if (!reqVal2Ids.equals(other.reqVal2Ids))
			return false;
		if (single == null) {
			if (other.single != null)
				return false;
		} else if (!single.equals(other.single))
			return false;
		if (soldCount == null) {
			if (other.soldCount != null)
				return false;
		} else if (!soldCount.equals(other.soldCount))
			return false;
		if (starId == null) {
			if (other.starId != null)
				return false;
		} else if (!starId.equals(other.starId))
			return false;
		if (storage == null) {
			if (other.storage != null)
				return false;
		} else if (!storage.equals(other.storage))
			return false;
		if (storeCls1 == null) {
			if (other.storeCls1 != null)
				return false;
		} else if (!storeCls1.equals(other.storeCls1))
			return false;
		if (storeCls2 == null) {
			if (other.storeCls2 != null)
				return false;
		} else if (!storeCls2.equals(other.storeCls2))
			return false;
		if (storeCls3 == null) {
			if (other.storeCls3 != null)
				return false;
		} else if (!storeCls3.equals(other.storeCls3))
			return false;
		if (storeId == null) {
			if (other.storeId != null)
				return false;
		} else if (!storeId.equals(other.storeId))
			return false;
		if (storeName == null) {
			if (other.storeName != null)
				return false;
		} else if (!storeName.equals(other.storeName))
			return false;
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
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
		if (promotionDesc == null) {
			if (other.promotionDesc != null)
				return false;
		} else if (!promotionDesc.equals(other.promotionDesc))
			return false;	
		if (deliveryType == null) {
			if (other.deliveryType != null)
				return false;
		} else if (!deliveryType.equals(other.deliveryType))
			return false;
		if (searchTag == null) {
			if (other.searchTag != null)
				return false;
		} else if (!searchTag.equals(other.searchTag))
			return false;
		if (startShipmentDate == null) {
			if (other.startShipmentDate != null)
				return false;
		} else if (!startShipmentDate.equals(other.startShipmentDate))
			return false;
		if (endShipmentDate == null) {
			if (other.endShipmentDate != null)
				return false;
		} else if (!endShipmentDate.equals(other.endShipmentDate))
			return false;
		if (colorDisplayType == null) {
			if (other.colorDisplayType != null)
				return false;
		} else if (!colorDisplayType.equals(other.colorDisplayType))
			return false;
		if (merchantStorage == null) {
			if (other.merchantStorage != null)
				return false;
		} else if (!merchantStorage.equals(other.merchantStorage))
			return false;
		if (arrivalDate == null) {
			if (other.arrivalDate != null)
				return false;
		} else if (!arrivalDate.equals(other.arrivalDate))
			return false;
		if (deliveryMinDay == null) {
			if (other.deliveryMinDay != null)
				return false;
		} else if (!deliveryMinDay.equals(other.deliveryMinDay))
			return false;
		if (deliveryMaxDay == null) {
			if (other.deliveryMaxDay != null)
				return false;
		} else if (!deliveryMaxDay.equals(other.deliveryMaxDay))
			return false;
		
		if (priceApprovedState == null) {
			if (other.priceApprovedState != null)
				return false;
		} else if (!priceApprovedState.equals(other.priceApprovedState))
			return false;
		if (operateStateTime == null) {
			if (other.operateStateTime != null)
				return false;
		} else if (!operateStateTime.equals(other.operateStateTime))
			return false;
		
		if (listNumber == null) {
			if (other.listNumber != null)
				return false;
		} else if (!listNumber.equals(other.listNumber))
			return false;

		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;

		if (listingSource == null) {
			if (other.listingSource != null)
				return false;
		} else if (!listingSource.equals(other.listingSource))
			return false;

		if (packageCount == null) {
			if (other.packageCount != null)
				return false;
		} else if (!packageCount.equals(other.packageCount))
			return false;

		if (saleMode == null) {
			if (other.saleMode != null)
				return false;
		} else if (!saleMode.equals(other.saleMode))
			return false;		
		
		if (listingType == null) {
			if (other.listingType != null)
				return false;
		} else if (!listingType.equals(other.listingType))
			return false;		

		if (listingState == null) {
			if (other.listingState != null)
				return false;
		} else if (!listingState.equals(other.listingState))
			return false;		

		if (searchEngineFlag == null) {
			if (other.searchEngineFlag != null)
				return false;
		} else if (!searchEngineFlag.equals(other.searchEngineFlag))
			return false;		

		if (standardAttributeIds == null) {
			if (other.standardAttributeIds != null)
				return false;
		} else if (!standardAttributeIds.equals(other.standardAttributeIds))
			return false;		
		
		if (thirdPrdId == null) {
			if (other.thirdPrdId != null)
				return false;
		} else if (!thirdPrdId.equals(other.thirdPrdId))
			return false;		
		
		
		return true;
	}

	@Override
	public String toString() {
		return "Listing [listId=" + listId + ", listName=" + listName
				+ ", merchantId=" + merchantId + ", merchantName="
				+ merchantName + ", storeName=" + storeName + ", storeId="
				+ storeId + ", prdId=" + prdId + ", categoryId=" + categoryId
				+ ", storeCls1=" + storeCls1 + ", storeCls2=" + storeCls2
				+ ", storeCls3=" + storeCls3 + ", brand=" + brand + ", weight="
				+ weight + ", defItemId=" + defItemId + ", defImgUrl="
				+ defImgUrl + ", storage=" + storage + ", merchantStorage="
				+ merchantStorage + ", soldCount=" + soldCount
				+ ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", minPrice=" + minPrice + ", maxPrice=" + maxPrice
				+ ", reqVal1Ids=" + reqVal1Ids + ", reqVal2Ids=" + reqVal2Ids
				+ ", attribute=" + attribute + ", listDesc=" + listDesc
				+ ", promotionIds=" + promotionIds + ", tag=" + tag
				+ ", delFlag=" + delFlag + ", md5Verify=" + md5Verify
				+ ", starId=" + starId + ", adId=" + adId + ", dcCode="
				+ dcCode + ", dcName=" + dcName + ", single=" + single
				+ ", limitWay=" + limitWay + ", limitNum=" + limitNum
				+ ", oldPrice=" + oldPrice + ", freight=" + freight
				+ ", insurance=" + insurance + ", promotionDesc="
				+ promotionDesc + ", deliveryType=" + deliveryType
				+ ", searchTag=" + searchTag + ", startShipmentDate="
				+ startShipmentDate + ", endShipmentDate=" + endShipmentDate
				+ ", colorDisplayType=" + colorDisplayType + ", arrivalDate="
				+ arrivalDate + ", deliveryMinDay=" + deliveryMinDay
				+ ", deliveryMaxDay=" + deliveryMaxDay
				+ ", priceApprovedState=" + priceApprovedState
				+ ", operateStateTime=" + operateStateTime + ", listNumber="
				+ listNumber + ", tax=" + tax + ", listingSource="
				+ listingSource + ", packageCount=" + packageCount
				+ ", saleMode=" + saleMode + ", listingType=" + listingType
				+ ", listingState=" + listingState + ", searchEngineFlag="
				+ searchEngineFlag + ", labels=" + labels + ", userId="
				+ userId + ", userName=" + userName + ", effectTime="
				+ effectTime + ", failureTime=" + failureTime + ", remark="
				+ remark + ", searchOption=" + searchOption + ", imgUrls="
				+ imgUrls + ", uleCardPay=" + uleCardPay + ", logisticsWay="
				+ logisticsWay + ", packageSizeInfo=" + packageSizeInfo
				+ ", merchantFreightPay=" + merchantFreightPay
				+ ", prepareCargoTime=" + prepareCargoTime + ", otherListId="
				+ otherListId + ", localSpecialty=" + localSpecialty
				+ ", oldListId=" + oldListId + ", sellUnit=" + sellUnit
				+ ", boxSell=" + boxSell + ", sellUnitSingle=" + sellUnitSingle
				+ ", standardAttributeIds=" + standardAttributeIds
				+ ", priceApprovedTime=" + priceApprovedTime
				+ ", firstOnlineTime=" + firstOnlineTime + ", packageWeight="
				+ packageWeight + ", saleChannelsId=" + saleChannelsId
				+ ", saleChannelName=" + saleChannelName + ", directProvince="
				+ directProvince + ", listPromotionName=" + listPromotionName
				+ ", allowChangePrice=" + allowChangePrice
				+ ", automateShelve=" + automateShelve
				+ ", automateShelveHour=" + automateShelveHour
				+ ", zoneProposalFlag=" + zoneProposalFlag + ", jqListDesc="
				+ jqListDesc + ", agencyRate=" + agencyRate
				+ ", purchasePrice=" + purchasePrice + ", settlementType="
				+ settlementType + ", settlementPoint=" + settlementPoint
				+ ", shipmentType=" + shipmentType
				+ ", nationalStandardNumber=" + nationalStandardNumber
				+ ", listPackageName=" + listPackageName + ", validityTerm="
				+ validityTerm + ", packageType=" + packageType
				+ ", storeSortNum=" + storeSortNum + ", expiryValue="
				+ expiryValue + ", orginPlace=" + orginPlace
				+ ", priceSearchFactor=" + priceSearchFactor + ", desPurPrice="
				+ desPurPrice + ", saleLimitNum=" + saleLimitNum
				+ ", netProfit=" + netProfit + ", offlineCode=" + offlineCode
				+ ", onlineableTime=" + onlineableTime + ", listBargaining="
				+ listBargaining + ", priceCompare=" + priceCompare
				+ ", generalFlag=" + generalFlag + ", promotionDescTwo="
				+ promotionDescTwo + ", isEmsFreight=" + isEmsFreight
				+ ", isReturnSevendays=" + isReturnSevendays + ", listingTag="
				+ listingTag + ", videoUrl=" + videoUrl + ", takeWay="
				+ takeWay + ", validPeriod=" + validPeriod + ", thirdPrdId=" + thirdPrdId + "]";
	}
	
	/**
	 * 商品标签枚举
	 * @category TOP200_HOT_SALE	热销推荐商品(1210)
	 * @category TMALL				天猫热销商品(1211)
	 * @category JD					京东热销商品(1212)
	 * @category YHD				一号店热销商品(1213)
	 * @category INSTALLMENT		分期付款(1310)
	 */
    public enum ListingTag {
       TOP200_HOT_SALE(1210), 
       TMALL(1211), 
       JD(1212), 
       YHD(1213), 
       INSTALLMENT(1310);
 
       // 定义私有变量
       private int code;
 
       // 构造函数，枚举类型只能为私有
       private ListingTag(int code) {
           this.code = code;
       }
       
       public String toString() {
           return String.valueOf(this.code);
       }
    }

}
