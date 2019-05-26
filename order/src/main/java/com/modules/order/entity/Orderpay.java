package com.modules.order.entity;

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
    public class Orderpay implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 唯一ID
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 订单ID
            */
        @TableField("orderId")
    private Integer orderId;

            /**
            * 支付状态。y:支付成功,n:支付失败
            */
    private String paystatus;

            /**
            * 支付金额
            */
    private Double payamount;

            /**
            * 支付时间
            */
        @TableField("createTime")
    private Date createTime;

            /**
            * 支付方式
            */
    private String paymethod;

            /**
            * 确认日期
            */
    private Date confirmdate;

            /**
            * 确认人
            */
    private String confirmuser;

            /**
            * 备注
            */
    private String remark;

            /**
            * 支付宝交易号，以后用来发货
            */
        @TableField("tradeNo")
    private Integer tradeNo;

        public Integer getId() {
        return id;
        }

            public Orderpay setId(Integer id) {
        this.id = id;
            return this;
        }
        public Integer getOrderId() {
        return orderId;
        }

            public Orderpay setOrderId(Integer orderId) {
        this.orderId = orderId;
            return this;
        }
        public String getPaystatus() {
        return paystatus;
        }

            public Orderpay setPaystatus(String paystatus) {
        this.paystatus = paystatus;
            return this;
        }
        public Double getPayamount() {
        return payamount;
        }

            public Orderpay setPayamount(Double payamount) {
        this.payamount = payamount;
            return this;
        }
        public Date getCreateTime() {
        return createTime;
        }

            public Orderpay setCreateTime(Date createTime) {
        this.createTime = createTime;
            return this;
        }
        public String getPaymethod() {
        return paymethod;
        }

            public Orderpay setPaymethod(String paymethod) {
        this.paymethod = paymethod;
            return this;
        }
        public Date getConfirmdate() {
        return confirmdate;
        }

            public Orderpay setConfirmdate(Date confirmdate) {
        this.confirmdate = confirmdate;
            return this;
        }
        public String getConfirmuser() {
        return confirmuser;
        }

            public Orderpay setConfirmuser(String confirmuser) {
        this.confirmuser = confirmuser;
            return this;
        }
        public String getRemark() {
        return remark;
        }

            public Orderpay setRemark(String remark) {
        this.remark = remark;
            return this;
        }
        public Integer getTradeNo() {
        return tradeNo;
        }

            public Orderpay setTradeNo(Integer tradeNo) {
        this.tradeNo = tradeNo;
            return this;
        }

    @Override
    public String toString() {
    return "Orderpay{" +
            "id=" + id +
            ", orderId=" + orderId +
            ", paystatus=" + paystatus +
            ", payamount=" + payamount +
            ", createTime=" + createTime +
            ", paymethod=" + paymethod +
            ", confirmdate=" + confirmdate +
            ", confirmuser=" + confirmuser +
            ", remark=" + remark +
            ", tradeNo=" + tradeNo +
    "}";
    }
}
