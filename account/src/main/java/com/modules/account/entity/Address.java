package com.modules.account.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.io.Serializable;

/**
* <p>
    * 
    * </p>
*
* @author 
* @since 2019-05-23
*/
    public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 唯一id
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 会员账号
            */
    private String account;

            /**
            * 收货人姓名
            */
    private String name;

            /**
            * 省份
            */
    private String province;

            /**
            * 城市
            */
    private String city;

            /**
            * 区域
            */
    private String area;

            /**
            * 省市区的地址中文合并
            */
    private String pcadetail;

        public Integer getId() {
        return id;
        }

            public Address setId(Integer id) {
        this.id = id;
            return this;
        }
        public String getAccount() {
        return account;
        }

            public Address setAccount(String account) {
        this.account = account;
            return this;
        }
        public String getName() {
        return name;
        }

            public Address setName(String name) {
        this.name = name;
            return this;
        }
        public String getProvince() {
        return province;
        }

            public Address setProvince(String province) {
        this.province = province;
            return this;
        }
        public String getCity() {
        return city;
        }

            public Address setCity(String city) {
        this.city = city;
            return this;
        }
        public String getArea() {
        return area;
        }

            public Address setArea(String area) {
        this.area = area;
            return this;
        }
        public String getPcadetail() {
        return pcadetail;
        }

            public Address setPcadetail(String pcadetail) {
        this.pcadetail = pcadetail;
            return this;
        }

    @Override
    public String toString() {
    return "Address{" +
            "id=" + id +
            ", account=" + account +
            ", name=" + name +
            ", province=" + province +
            ", city=" + city +
            ", area=" + area +
            ", pcadetail=" + pcadetail +
    "}";
    }
}
