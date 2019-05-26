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
    public class User implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 用户名
            */
    private String username;

            /**
            * 密码
            */
    private String password;

            /**
            * 用户创建时间
            */
    private Date createtime;

            /**
            * 创建人
            */
        @TableField("createAccount")
    private String createAccount;

            /**
            * 最后修改时间
            */
        @TableField("updateTime")
    private Date updateTime;

            /**
            * 最后修改人
            */
        @TableField("updateAccount")
    private String updateAccount;

            /**
            * 状态 y:启用 n:禁用 默认y
            */
    private String status;

            /**
            * 角色表id
            */
    private Integer rid;

            /**
            * 昵称
            */
    private String nickname;

            /**
            * 邮箱
            */
    private String email;

        public Integer getId() {
        return id;
        }

            public User setId(Integer id) {
        this.id = id;
            return this;
        }
        public String getUsername() {
        return username;
        }

            public User setUsername(String username) {
        this.username = username;
            return this;
        }
        public String getPassword() {
        return password;
        }

            public User setPassword(String password) {
        this.password = password;
            return this;
        }
        public Date getCreatetime() {
        return createtime;
        }

            public User setCreatetime(Date createtime) {
        this.createtime = createtime;
            return this;
        }
        public String getCreateAccount() {
        return createAccount;
        }

            public User setCreateAccount(String createAccount) {
        this.createAccount = createAccount;
            return this;
        }
        public Date getUpdateTime() {
        return updateTime;
        }

            public User setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
            return this;
        }
        public String getUpdateAccount() {
        return updateAccount;
        }

            public User setUpdateAccount(String updateAccount) {
        this.updateAccount = updateAccount;
            return this;
        }
        public String getStatus() {
        return status;
        }

            public User setStatus(String status) {
        this.status = status;
            return this;
        }
        public Integer getRid() {
        return rid;
        }

            public User setRid(Integer rid) {
        this.rid = rid;
            return this;
        }
        public String getNickname() {
        return nickname;
        }

            public User setNickname(String nickname) {
        this.nickname = nickname;
            return this;
        }
        public String getEmail() {
        return email;
        }

            public User setEmail(String email) {
        this.email = email;
            return this;
        }

    @Override
    public String toString() {
    return "User{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", createtime=" + createtime +
            ", createAccount=" + createAccount +
            ", updateTime=" + updateTime +
            ", updateAccount=" + updateAccount +
            ", status=" + status +
            ", rid=" + rid +
            ", nickname=" + nickname +
            ", email=" + email +
    "}";
    }
}
