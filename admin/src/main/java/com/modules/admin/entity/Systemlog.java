package com.modules.admin.entity;

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
    public class Systemlog implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * id
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 日志标题
            */
    private String title;

            /**
            * 日志内容
            */
    private String content;

            /**
            * 日志类型 1:登录日志 2:旧版本日志
            */
    private String type;

            /**
            * 日志产生时间
            */
        @TableField("createDate")
    private Date createDate;

            /**
            * 操作人
            */
    private String account;

            /**
            * 登录人IP地址
            */
        @TableField("loginIP")
    private String loginIP;

            /**
            * 登录时间
            */
        @TableField("loginTime")
    private Date loginTime;

            /**
            * 登录区域
            */
        @TableField("loginArea")
    private String loginArea;

            /**
            * 是否异地登录 y:是 n:否
            */
        @TableField("diffAreaLogin")
    private String diffAreaLogin;

        public Integer getId() {
        return id;
        }

            public Systemlog setId(Integer id) {
        this.id = id;
            return this;
        }
        public String getTitle() {
        return title;
        }

            public Systemlog setTitle(String title) {
        this.title = title;
            return this;
        }
        public String getContent() {
        return content;
        }

            public Systemlog setContent(String content) {
        this.content = content;
            return this;
        }
        public String getType() {
        return type;
        }

            public Systemlog setType(String type) {
        this.type = type;
            return this;
        }
        public Date getCreateDate() {
        return createDate;
        }

            public Systemlog setCreateDate(Date createDate) {
        this.createDate = createDate;
            return this;
        }
        public String getAccount() {
        return account;
        }

            public Systemlog setAccount(String account) {
        this.account = account;
            return this;
        }
        public String getLoginIP() {
        return loginIP;
        }

            public Systemlog setLoginIP(String loginIP) {
        this.loginIP = loginIP;
            return this;
        }
        public Date getLoginTime() {
        return loginTime;
        }

            public Systemlog setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
            return this;
        }
        public String getLoginArea() {
        return loginArea;
        }

            public Systemlog setLoginArea(String loginArea) {
        this.loginArea = loginArea;
            return this;
        }
        public String getDiffAreaLogin() {
        return diffAreaLogin;
        }

            public Systemlog setDiffAreaLogin(String diffAreaLogin) {
        this.diffAreaLogin = diffAreaLogin;
            return this;
        }

    @Override
    public String toString() {
    return "Systemlog{" +
            "id=" + id +
            ", title=" + title +
            ", content=" + content +
            ", type=" + type +
            ", createDate=" + createDate +
            ", account=" + account +
            ", loginIP=" + loginIP +
            ", loginTime=" + loginTime +
            ", loginArea=" + loginArea +
            ", diffAreaLogin=" + diffAreaLogin +
    "}";
    }
}
