package com.modules.product.entity;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.annotation.IdType;
    import java.util.Date;
    import com.baomidou.mybatisplus.annotation.TableId;
    import com.baomidou.mybatisplus.annotation.TableField;
    import java.io.Serializable;

/**
* <p>
    * 
    * </p>
*
* @author 
* @since 2019-05-23
*/
    public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 商品唯一ID
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 商品类别Id
            */
        @TableField("catalogID")
    private String catalogID;

            /**
            * 商品名称
            */
    private String name;

            /**
            * 商品简介
            */
    private String introduce;

            /**
            * 定价
            */
    private BigDecimal price;

            /**
            * 现价
            */
        @TableField("nowPrice")
    private BigDecimal nowPrice;

            /**
            * 小图片地址
            */
    private String picture;

            /**
            * 赠送积分
            */
    private Integer score;

            /**
            * 大图片地址
            */
        @TableField("maxPicture")
    private String maxPicture;

            /**
            * 是否是新品 n:否 y:是
            */
    private String isnew;

            /**
            * 是否打折 n:否 y:是
            */
    private String sale;

            /**
            * 活动ID
            */
        @TableField("activityId")
    private String activityId;

            /**
            * 礼品ID
            */
        @TableField("giftId")
    private String giftId;

            /**
            * 浏览次数
            */
    private Integer hit;

            /**
            * 商品单位 默认 件
            */
    private String unit;

            /**
            * 录入人账号
            */
        @TableField("createAccount")
    private String createAccount;

            /**
            * 录入时间
            */
    private Date createtime;

            /**
            * 最后修改人账号
            */
        @TableField("updateAccount")
    private String updateAccount;

            /**
            * 最后修改时间
            */
    private Date updatetime;

            /**
            * 是否限时促销。n：否，y：是
            */
        @TableField("isTimePromotion")
    private String isTimePromotion;

            /**
            * 商品状态。1：新增，2：已上架，3：已下架
            */
    private Integer status;

            /**
            * 商品介绍
            */
        @TableField("productHTML")
    private String productHTML;

            /**
            * 商品图片 如果多张用逗号隔开
            */
    private String images;

            /**
            * 销量库存
            */
    private Integer sellcount;

            /**
            * 剩余库存数
            */
    private Integer stock;

            /**
            * 搜索关键字
            */
        @TableField("searchKey")
    private String searchKey;

            /**
            * 页面标题
            */
    private String title;

            /**
            * 页面描述
            */
    private String description;

            /**
            * 页面关键词
            */
    private String keywords;

            /**
            * 品牌id
            */
        @TableField("brandId")
    private Integer brandId;

        public Integer getId() {
        return id;
        }

            public Product setId(Integer id) {
        this.id = id;
            return this;
        }
        public String getCatalogID() {
        return catalogID;
        }

            public Product setCatalogID(String catalogID) {
        this.catalogID = catalogID;
            return this;
        }
        public String getName() {
        return name;
        }

            public Product setName(String name) {
        this.name = name;
            return this;
        }
        public String getIntroduce() {
        return introduce;
        }

            public Product setIntroduce(String introduce) {
        this.introduce = introduce;
            return this;
        }
        public BigDecimal getPrice() {
        return price;
        }

            public Product setPrice(BigDecimal price) {
        this.price = price;
            return this;
        }
        public BigDecimal getNowPrice() {
        return nowPrice;
        }

            public Product setNowPrice(BigDecimal nowPrice) {
        this.nowPrice = nowPrice;
            return this;
        }
        public String getPicture() {
        return picture;
        }

            public Product setPicture(String picture) {
        this.picture = picture;
            return this;
        }
        public Integer getScore() {
        return score;
        }

            public Product setScore(Integer score) {
        this.score = score;
            return this;
        }
        public String getMaxPicture() {
        return maxPicture;
        }

            public Product setMaxPicture(String maxPicture) {
        this.maxPicture = maxPicture;
            return this;
        }
        public String getIsnew() {
        return isnew;
        }

            public Product setIsnew(String isnew) {
        this.isnew = isnew;
            return this;
        }
        public String getSale() {
        return sale;
        }

            public Product setSale(String sale) {
        this.sale = sale;
            return this;
        }
        public String getActivityId() {
        return activityId;
        }

            public Product setActivityId(String activityId) {
        this.activityId = activityId;
            return this;
        }
        public String getGiftId() {
        return giftId;
        }

            public Product setGiftId(String giftId) {
        this.giftId = giftId;
            return this;
        }
        public Integer getHit() {
        return hit;
        }

            public Product setHit(Integer hit) {
        this.hit = hit;
            return this;
        }
        public String getUnit() {
        return unit;
        }

            public Product setUnit(String unit) {
        this.unit = unit;
            return this;
        }
        public String getCreateAccount() {
        return createAccount;
        }

            public Product setCreateAccount(String createAccount) {
        this.createAccount = createAccount;
            return this;
        }
        public Date getCreatetime() {
        return createtime;
        }

            public Product setCreatetime(Date createtime) {
        this.createtime = createtime;
            return this;
        }
        public String getUpdateAccount() {
        return updateAccount;
        }

            public Product setUpdateAccount(String updateAccount) {
        this.updateAccount = updateAccount;
            return this;
        }
        public Date getUpdatetime() {
        return updatetime;
        }

            public Product setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
            return this;
        }
        public String getIsTimePromotion() {
        return isTimePromotion;
        }

            public Product setIsTimePromotion(String isTimePromotion) {
        this.isTimePromotion = isTimePromotion;
            return this;
        }
        public Integer getStatus() {
        return status;
        }

            public Product setStatus(Integer status) {
        this.status = status;
            return this;
        }
        public String getProductHTML() {
        return productHTML;
        }

            public Product setProductHTML(String productHTML) {
        this.productHTML = productHTML;
            return this;
        }
        public String getImages() {
        return images;
        }

            public Product setImages(String images) {
        this.images = images;
            return this;
        }
        public Integer getSellcount() {
        return sellcount;
        }

            public Product setSellcount(Integer sellcount) {
        this.sellcount = sellcount;
            return this;
        }
        public Integer getStock() {
        return stock;
        }

            public Product setStock(Integer stock) {
        this.stock = stock;
            return this;
        }
        public String getSearchKey() {
        return searchKey;
        }

            public Product setSearchKey(String searchKey) {
        this.searchKey = searchKey;
            return this;
        }
        public String getTitle() {
        return title;
        }

            public Product setTitle(String title) {
        this.title = title;
            return this;
        }
        public String getDescription() {
        return description;
        }

            public Product setDescription(String description) {
        this.description = description;
            return this;
        }
        public String getKeywords() {
        return keywords;
        }

            public Product setKeywords(String keywords) {
        this.keywords = keywords;
            return this;
        }
        public Integer getBrandId() {
        return brandId;
        }

            public Product setBrandId(Integer brandId) {
        this.brandId = brandId;
            return this;
        }

    @Override
    public String toString() {
    return "Product{" +
            "id=" + id +
            ", catalogID=" + catalogID +
            ", name=" + name +
            ", introduce=" + introduce +
            ", price=" + price +
            ", nowPrice=" + nowPrice +
            ", picture=" + picture +
            ", score=" + score +
            ", maxPicture=" + maxPicture +
            ", isnew=" + isnew +
            ", sale=" + sale +
            ", activityId=" + activityId +
            ", giftId=" + giftId +
            ", hit=" + hit +
            ", unit=" + unit +
            ", createAccount=" + createAccount +
            ", createtime=" + createtime +
            ", updateAccount=" + updateAccount +
            ", updatetime=" + updatetime +
            ", isTimePromotion=" + isTimePromotion +
            ", status=" + status +
            ", productHTML=" + productHTML +
            ", images=" + images +
            ", sellcount=" + sellcount +
            ", stock=" + stock +
            ", searchKey=" + searchKey +
            ", title=" + title +
            ", description=" + description +
            ", keywords=" + keywords +
            ", brandId=" + brandId +
    "}";
    }
}
