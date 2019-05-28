package com.modules.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author
 * @since 2019-05-23
 */
@TableName("`order`")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 账号
     */
    private String account;

    /**
     * 付款方式
     */
    @TableField("payType")
    private String payType;

    /**
     * 运送方式
     */
    private String carry;

    /**
     * 折扣
     */
    private String rebate;

    /**
     * 创建日期
     */
    private Date createdate;

    /**
     * 备注 支付宝的WIDsubject
     */
    private String remak;

    /**
     * 订单状态init:未审核  pass 已审核  send 已发货 sign 已签收 cancel 已取消  file 已归档  finish 交易完成
     */
    private String status;

    /**
     * 退款状态(直接借用了支付宝的退款状态)。
     * WAISELLER_AGREE：等待卖家同意退款；
     * WAIBUYER_RETURN_GOODS：卖家同意退款，等待买家退货；
     * WAISELLER_CONFIRM_GOODS：买家已退货，等待卖家收到退货；
     * REFUND_SUCCESS：卖家收到退货，退款成功，交易关闭
     */
    @TableField("refundStatus")
    private String refundStatus;

    /**
     * 支付状态  n：未支付 p:部分支付；  y：全部支付
     */
    private String paystatus;

    /**
     * 库存状态： n:库存不足  y:库存充足  默认n
     */
    @TableField("lowStocks")
    private String lowStocks;

    /**
     * 订单总金额
     */
    private Double amount;

    /**
     * 订单总积分
     */
    @TableField("amountExchangeScore")
    private Integer amountExchangeScore;

    /**
     * 运费总金额
     */
    private Double fee;

    /**
     * 商品总金额
     */
    private String ptotal;

    /**
     * 商品总数量
     */
    private String quantity;

    /**
     * 订单是否修改过n:没有修改过 y;修改过 默认：n
     */
    @TableField("updateAmount")
    private String updateAmount;

    /**
     * 配送方式编码
     */
    @TableField("expressCode")
    private String expressCode;

    /**
     * 配送方式名称
     */
    @TableField("expressName")
    private String expressName;

    /**
     * 快递运单号
     */
    @TableField("expressNo")
    private String expressNo;

    /**
     * 快递公司名称
     */
    @TableField("expressCompanyName")
    private String expressCompanyName;

    /**
     * 确认发货备注
     */
    @TableField("confirmSendProductRemark")
    private String confirmSendProductRemark;

    /**
     * 客户附加要求
     */
    @TableField("otherRequirement")
    private String otherRequirement;

    /**
     * 此订单的所有订单项对应的商品都进行了评论，则此值为y，表示此订单的评论功能已经关闭，默认为null，在订单状态为已发货后，则用户可以对订单进行评价。
     */
    @TableField("closedComment")
    private String closedComment;

    /**
     * 订单获赠积分
     */
    private Integer score;

    public Integer getId() {
        return id;
    }

    public Order setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public Order setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getPayType() {
        return payType;
    }

    public Order setPayType(String payType) {
        this.payType = payType;
        return this;
    }

    public String getCarry() {
        return carry;
    }

    public Order setCarry(String carry) {
        this.carry = carry;
        return this;
    }

    public String getRebate() {
        return rebate;
    }

    public Order setRebate(String rebate) {
        this.rebate = rebate;
        return this;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public Order setCreatedate(Date createdate) {
        this.createdate = createdate;
        return this;
    }

    public String getRemak() {
        return remak;
    }

    public Order setRemak(String remak) {
        this.remak = remak;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Order setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public Order setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }

    public String getPaystatus() {
        return paystatus;
    }

    public Order setPaystatus(String paystatus) {
        this.paystatus = paystatus;
        return this;
    }

    public String getLowStocks() {
        return lowStocks;
    }

    public Order setLowStocks(String lowStocks) {
        this.lowStocks = lowStocks;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public Order setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public Integer getAmountExchangeScore() {
        return amountExchangeScore;
    }

    public Order setAmountExchangeScore(Integer amountExchangeScore) {
        this.amountExchangeScore = amountExchangeScore;
        return this;
    }

    public Double getFee() {
        return fee;
    }

    public Order setFee(Double fee) {
        this.fee = fee;
        return this;
    }

    public String getPtotal() {
        return ptotal;
    }

    public Order setPtotal(String ptotal) {
        this.ptotal = ptotal;
        return this;
    }

    public String getQuantity() {
        return quantity;
    }

    public Order setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getUpdateAmount() {
        return updateAmount;
    }

    public Order setUpdateAmount(String updateAmount) {
        this.updateAmount = updateAmount;
        return this;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public Order setExpressCode(String expressCode) {
        this.expressCode = expressCode;
        return this;
    }

    public String getExpressName() {
        return expressName;
    }

    public Order setExpressName(String expressName) {
        this.expressName = expressName;
        return this;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public Order setExpressNo(String expressNo) {
        this.expressNo = expressNo;
        return this;
    }

    public String getExpressCompanyName() {
        return expressCompanyName;
    }

    public Order setExpressCompanyName(String expressCompanyName) {
        this.expressCompanyName = expressCompanyName;
        return this;
    }

    public String getConfirmSendProductRemark() {
        return confirmSendProductRemark;
    }

    public Order setConfirmSendProductRemark(String confirmSendProductRemark) {
        this.confirmSendProductRemark = confirmSendProductRemark;
        return this;
    }

    public String getOtherRequirement() {
        return otherRequirement;
    }

    public Order setOtherRequirement(String otherRequirement) {
        this.otherRequirement = otherRequirement;
        return this;
    }

    public String getClosedComment() {
        return closedComment;
    }

    public Order setClosedComment(String closedComment) {
        this.closedComment = closedComment;
        return this;
    }

    public Integer getScore() {
        return score;
    }

    public Order setScore(Integer score) {
        this.score = score;
        return this;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", account=" + account +
                ", payType=" + payType +
                ", carry=" + carry +
                ", rebate=" + rebate +
                ", createdate=" + createdate +
                ", remak=" + remak +
                ", status=" + status +
                ", refundStatus=" + refundStatus +
                ", paystatus=" + paystatus +
                ", lowStocks=" + lowStocks +
                ", amount=" + amount +
                ", amountExchangeScore=" + amountExchangeScore +
                ", fee=" + fee +
                ", ptotal=" + ptotal +
                ", quantity=" + quantity +
                ", updateAmount=" + updateAmount +
                ", expressCode=" + expressCode +
                ", expressName=" + expressName +
                ", expressNo=" + expressNo +
                ", expressCompanyName=" + expressCompanyName +
                ", confirmSendProductRemark=" + confirmSendProductRemark +
                ", otherRequirement=" + otherRequirement +
                ", closedComment=" + closedComment +
                ", score=" + score +
                "}";
    }
}
