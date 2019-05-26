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
    public class Orderlog implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 唯一id
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 订单ID
            */
        @TableField("orderId")
    private Integer orderId;

            /**
            * 操作人
            */
    private String account;

            /**
            * 记录时间
            */
    private Date createdate;

            /**
            * 日志内容
            */
    private String content;

            /**
            * w:会员;m:后台管理人员;p:第三方支付系统异步通知
            */
        @TableField("accountType")
    private String accountType;

        public Integer getId() {
        return id;
        }

            public Orderlog setId(Integer id) {
        this.id = id;
            return this;
        }
        public Integer getOrderId() {
        return orderId;
        }

            public Orderlog setOrderId(Integer orderId) {
        this.orderId = orderId;
            return this;
        }
        public String getAccount() {
        return account;
        }

            public Orderlog setAccount(String account) {
        this.account = account;
            return this;
        }
        public Date getCreatedate() {
        return createdate;
        }

            public Orderlog setCreatedate(Date createdate) {
        this.createdate = createdate;
            return this;
        }
        public String getContent() {
        return content;
        }

            public Orderlog setContent(String content) {
        this.content = content;
            return this;
        }
        public String getAccountType() {
        return accountType;
        }

            public Orderlog setAccountType(String accountType) {
        this.accountType = accountType;
            return this;
        }

    @Override
    public String toString() {
    return "Orderlog{" +
            "id=" + id +
            ", orderId=" + orderId +
            ", account=" + account +
            ", createdate=" + createdate +
            ", content=" + content +
            ", accountType=" + accountType +
    "}";
    }
}
