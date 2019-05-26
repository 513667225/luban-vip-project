package com.modules.order.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
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
    public class Orderdetail implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 唯一id
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 订单表ID
            */
        @TableField("orderId")
    private Integer orderId;

            /**
            * 订单项ID
            */
        @TableField("orderdetailId")
    private Integer orderdetailId;

            /**
            * 商品ID
            */
        @TableField("productID")
    private Integer productID;

            /**
            * 商品赠品ID
            */
        @TableField("giftId")
    private Integer giftId;

            /**
            * 价格
            */
    private Double price;

            /**
            * 数量
            */
    private Integer number;

            /**
            * 总金额 价格*数量
            */
    private Double total0;

            /**
            * 配送费
            */
    private Double fee;

            /**
            * 是否评价过。n:未评价,y:已评价；默认n
            */
        @TableField("isComment")
    private String isComment;

            /**
            * n:库存不足；y:库存充足。默认n
            */
        @TableField("lowStocks")
    private String lowStocks;

            /**
            * 规格信息
            */
    private String info;

        public Integer getId() {
        return id;
        }

            public Orderdetail setId(Integer id) {
        this.id = id;
            return this;
        }
        public Integer getOrderId() {
        return orderId;
        }

            public Orderdetail setOrderId(Integer orderId) {
        this.orderId = orderId;
            return this;
        }
        public Integer getOrderdetailId() {
        return orderdetailId;
        }

            public Orderdetail setOrderdetailId(Integer orderdetailId) {
        this.orderdetailId = orderdetailId;
            return this;
        }
        public Integer getProductID() {
        return productID;
        }

            public Orderdetail setProductID(Integer productID) {
        this.productID = productID;
            return this;
        }
        public Integer getGiftId() {
        return giftId;
        }

            public Orderdetail setGiftId(Integer giftId) {
        this.giftId = giftId;
            return this;
        }
        public Double getPrice() {
        return price;
        }

            public Orderdetail setPrice(Double price) {
        this.price = price;
            return this;
        }
        public Integer getNumber() {
        return number;
        }

            public Orderdetail setNumber(Integer number) {
        this.number = number;
            return this;
        }
        public Double getTotal0() {
        return total0;
        }

            public Orderdetail setTotal0(Double total0) {
        this.total0 = total0;
            return this;
        }
        public Double getFee() {
        return fee;
        }

            public Orderdetail setFee(Double fee) {
        this.fee = fee;
            return this;
        }
        public String getIsComment() {
        return isComment;
        }

            public Orderdetail setIsComment(String isComment) {
        this.isComment = isComment;
            return this;
        }
        public String getLowStocks() {
        return lowStocks;
        }

            public Orderdetail setLowStocks(String lowStocks) {
        this.lowStocks = lowStocks;
            return this;
        }
        public String getInfo() {
        return info;
        }

            public Orderdetail setInfo(String info) {
        this.info = info;
            return this;
        }

    @Override
    public String toString() {
    return "Orderdetail{" +
            "id=" + id +
            ", orderId=" + orderId +
            ", orderdetailId=" + orderdetailId +
            ", productID=" + productID +
            ", giftId=" + giftId +
            ", price=" + price +
            ", number=" + number +
            ", total0=" + total0 +
            ", fee=" + fee +
            ", isComment=" + isComment +
            ", lowStocks=" + lowStocks +
            ", info=" + info +
    "}";
    }
}
