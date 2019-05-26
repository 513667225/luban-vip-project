package com.modules.account.entity;

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
    public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 会员id
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 昵称
            */
    private String nickname;

            /**
            * 用户名
            */
    private String account;

            /**
            * 密码
            */
    private String password;

            /**
            * 会员类型
            */
        @TableField("accountType")
    private String accountType;

            /**
            * 真实姓名
            */
        @TableField("trueName")
    private String trueName;

            /**
            * 性别
            */
    private String sex;

            /**
            * 出生年月
            */
    private Date birthday;

            /**
            * 省份
            */
    private String province;

            /**
            * 所在城市
            */
    private String city;

            /**
            * 联系地址
            */
    private String address;

            /**
            * 邮政编码
            */
    private String postcode;

            /**
            * 证件号码
            */
        @TableField("cardNo")
    private String cardNo;

            /**
            * 证件类型
            */
        @TableField("cardType")
    private String cardType;

            /**
            * 等级
            */
    private Integer grade;

            /**
            * 消费额
            */
    private Double amount;

            /**
            * 邮箱地址
            */
    private String email;

            /**
            * 邮箱是否已激活 y:已激活,n:未激活 默认n
            */
        @TableField("emailIsActive")
    private String emailIsActive;

            /**
            * 是否冻结 y:已冻结,n:未冻结 默认n
            */
    private String freeze;

            /**
            * 冻结开始日期
            */
        @TableField("freezeStartdate")
    private Date freezeStartdate;

            /**
            * 冻结结束日期
            */
        @TableField("freezeEnddate")
    private Date freezeEnddate;

            /**
            * 最后登录时间
            */
        @TableField("lastLoginTime")
    private Date lastLoginTime;

            /**
            * 最后登录IP
            */
        @TableField("lastLoginIp")
    private String lastLoginIp;

            /**
            * 最后登录地点
            */
        @TableField("lastLoginArea")
    private String lastLoginArea;

            /**
            * 是否异地登录 y:是  n:否
            */
        @TableField("diffAreaLogin")
    private String diffAreaLogin;

            /**
            * 注册日期
            */
        @TableField("regeistDate")
    private String regeistDate;

            /**
            * 配送信息ID
            */
        @TableField("addressID")
    private String addressID;

            /**
            * qq登录返回openId
            */
        @TableField("openId")
    private String openId;

            /**
            * qq登录返回Token
            */
        @TableField("accessToken")
    private String accessToken;

            /**
            * 支付宝快登录返回用户ID
            */
        @TableField("alipayUseId")
    private String alipayUseId;

            /**
            * 新浪微博登录返回用户ID
            */
        @TableField("sinaWeiboID")
    private String sinaWeiboID;

            /**
            * 会员等级
            */
    private String rank;

            /**
            * 会员积分
            */
    private Integer score;

        public Integer getId() {
        return id;
        }

            public Account setId(Integer id) {
        this.id = id;
            return this;
        }
        public String getNickname() {
        return nickname;
        }

            public Account setNickname(String nickname) {
        this.nickname = nickname;
            return this;
        }
        public String getAccount() {
        return account;
        }

            public Account setAccount(String account) {
        this.account = account;
            return this;
        }
        public String getPassword() {
        return password;
        }

            public Account setPassword(String password) {
        this.password = password;
            return this;
        }
        public String getAccountType() {
        return accountType;
        }

            public Account setAccountType(String accountType) {
        this.accountType = accountType;
            return this;
        }
        public String getTrueName() {
        return trueName;
        }

            public Account setTrueName(String trueName) {
        this.trueName = trueName;
            return this;
        }
        public String getSex() {
        return sex;
        }

            public Account setSex(String sex) {
        this.sex = sex;
            return this;
        }
        public Date getBirthday() {
        return birthday;
        }

            public Account setBirthday(Date birthday) {
        this.birthday = birthday;
            return this;
        }
        public String getProvince() {
        return province;
        }

            public Account setProvince(String province) {
        this.province = province;
            return this;
        }
        public String getCity() {
        return city;
        }

            public Account setCity(String city) {
        this.city = city;
            return this;
        }
        public String getAddress() {
        return address;
        }

            public Account setAddress(String address) {
        this.address = address;
            return this;
        }
        public String getPostcode() {
        return postcode;
        }

            public Account setPostcode(String postcode) {
        this.postcode = postcode;
            return this;
        }
        public String getCardNo() {
        return cardNo;
        }

            public Account setCardNo(String cardNo) {
        this.cardNo = cardNo;
            return this;
        }
        public String getCardType() {
        return cardType;
        }

            public Account setCardType(String cardType) {
        this.cardType = cardType;
            return this;
        }
        public Integer getGrade() {
        return grade;
        }

            public Account setGrade(Integer grade) {
        this.grade = grade;
            return this;
        }
        public Double getAmount() {
        return amount;
        }

            public Account setAmount(Double amount) {
        this.amount = amount;
            return this;
        }
        public String getEmail() {
        return email;
        }

            public Account setEmail(String email) {
        this.email = email;
            return this;
        }
        public String getEmailIsActive() {
        return emailIsActive;
        }

            public Account setEmailIsActive(String emailIsActive) {
        this.emailIsActive = emailIsActive;
            return this;
        }
        public String getFreeze() {
        return freeze;
        }

            public Account setFreeze(String freeze) {
        this.freeze = freeze;
            return this;
        }
        public Date getFreezeStartdate() {
        return freezeStartdate;
        }

            public Account setFreezeStartdate(Date freezeStartdate) {
        this.freezeStartdate = freezeStartdate;
            return this;
        }
        public Date getFreezeEnddate() {
        return freezeEnddate;
        }

            public Account setFreezeEnddate(Date freezeEnddate) {
        this.freezeEnddate = freezeEnddate;
            return this;
        }
        public Date getLastLoginTime() {
        return lastLoginTime;
        }

            public Account setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
            return this;
        }
        public String getLastLoginIp() {
        return lastLoginIp;
        }

            public Account setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
            return this;
        }
        public String getLastLoginArea() {
        return lastLoginArea;
        }

            public Account setLastLoginArea(String lastLoginArea) {
        this.lastLoginArea = lastLoginArea;
            return this;
        }
        public String getDiffAreaLogin() {
        return diffAreaLogin;
        }

            public Account setDiffAreaLogin(String diffAreaLogin) {
        this.diffAreaLogin = diffAreaLogin;
            return this;
        }
        public String getRegeistDate() {
        return regeistDate;
        }

            public Account setRegeistDate(String regeistDate) {
        this.regeistDate = regeistDate;
            return this;
        }
        public String getAddressID() {
        return addressID;
        }

            public Account setAddressID(String addressID) {
        this.addressID = addressID;
            return this;
        }
        public String getOpenId() {
        return openId;
        }

            public Account setOpenId(String openId) {
        this.openId = openId;
            return this;
        }
        public String getAccessToken() {
        return accessToken;
        }

            public Account setAccessToken(String accessToken) {
        this.accessToken = accessToken;
            return this;
        }
        public String getAlipayUseId() {
        return alipayUseId;
        }

            public Account setAlipayUseId(String alipayUseId) {
        this.alipayUseId = alipayUseId;
            return this;
        }
        public String getSinaWeiboID() {
        return sinaWeiboID;
        }

            public Account setSinaWeiboID(String sinaWeiboID) {
        this.sinaWeiboID = sinaWeiboID;
            return this;
        }
        public String getRank() {
        return rank;
        }

            public Account setRank(String rank) {
        this.rank = rank;
            return this;
        }
        public Integer getScore() {
        return score;
        }

            public Account setScore(Integer score) {
        this.score = score;
            return this;
        }

    @Override
    public String toString() {
    return "Account{" +
            "id=" + id +
            ", nickname=" + nickname +
            ", account=" + account +
            ", password=" + password +
            ", accountType=" + accountType +
            ", trueName=" + trueName +
            ", sex=" + sex +
            ", birthday=" + birthday +
            ", province=" + province +
            ", city=" + city +
            ", address=" + address +
            ", postcode=" + postcode +
            ", cardNo=" + cardNo +
            ", cardType=" + cardType +
            ", grade=" + grade +
            ", amount=" + amount +
            ", email=" + email +
            ", emailIsActive=" + emailIsActive +
            ", freeze=" + freeze +
            ", freezeStartdate=" + freezeStartdate +
            ", freezeEnddate=" + freezeEnddate +
            ", lastLoginTime=" + lastLoginTime +
            ", lastLoginIp=" + lastLoginIp +
            ", lastLoginArea=" + lastLoginArea +
            ", diffAreaLogin=" + diffAreaLogin +
            ", regeistDate=" + regeistDate +
            ", addressID=" + addressID +
            ", openId=" + openId +
            ", accessToken=" + accessToken +
            ", alipayUseId=" + alipayUseId +
            ", sinaWeiboID=" + sinaWeiboID +
            ", rank=" + rank +
            ", score=" + score +
    "}";
    }
}
