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
    public class Ordership implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 唯一id
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 订单表id
            */
        @TableField("orderId")
    private Integer orderId;

            /**
            * 收货人姓名
            */
    private String shipname;

            /**
            * 收货人详细地址
            */
    private String shipaddress;

            /**
            * 省份代码
            */
        @TableField("provinceCode")
    private String provinceCode;

            /**
            * 省份
            */
    private String province;

            /**
            * 城市代码
            */
        @TableField("cityCode")
    private String cityCode;

            /**
            * 城市
            */
    private String city;

            /**
            * 区域代码
            */
        @TableField("areaCode")
    private String areaCode;

            /**
            * 区域
            */
    private String area;

            /**
            * 手机
            */
    private String phone;

            /**
            * 座机
            */
    private String tel;

            /**
            * 邮编
            */
    private String zip;

            /**
            * 性别
            */
    private String sex;

            /**
            * 备注
            */
    private String remark;

        public Integer getId() {
        return id;
        }

            public Ordership setId(Integer id) {
        this.id = id;
            return this;
        }
        public Integer getOrderId() {
        return orderId;
        }

            public Ordership setOrderId(Integer orderId) {
        this.orderId = orderId;
            return this;
        }
        public String getShipname() {
        return shipname;
        }

            public Ordership setShipname(String shipname) {
        this.shipname = shipname;
            return this;
        }
        public String getShipaddress() {
        return shipaddress;
        }

            public Ordership setShipaddress(String shipaddress) {
        this.shipaddress = shipaddress;
            return this;
        }
        public String getProvinceCode() {
        return provinceCode;
        }

            public Ordership setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
            return this;
        }
        public String getProvince() {
        return province;
        }

            public Ordership setProvince(String province) {
        this.province = province;
            return this;
        }
        public String getCityCode() {
        return cityCode;
        }

            public Ordership setCityCode(String cityCode) {
        this.cityCode = cityCode;
            return this;
        }
        public String getCity() {
        return city;
        }

            public Ordership setCity(String city) {
        this.city = city;
            return this;
        }
        public String getAreaCode() {
        return areaCode;
        }

            public Ordership setAreaCode(String areaCode) {
        this.areaCode = areaCode;
            return this;
        }
        public String getArea() {
        return area;
        }

            public Ordership setArea(String area) {
        this.area = area;
            return this;
        }
        public String getPhone() {
        return phone;
        }

            public Ordership setPhone(String phone) {
        this.phone = phone;
            return this;
        }
        public String getTel() {
        return tel;
        }

            public Ordership setTel(String tel) {
        this.tel = tel;
            return this;
        }
        public String getZip() {
        return zip;
        }

            public Ordership setZip(String zip) {
        this.zip = zip;
            return this;
        }
        public String getSex() {
        return sex;
        }

            public Ordership setSex(String sex) {
        this.sex = sex;
            return this;
        }
        public String getRemark() {
        return remark;
        }

            public Ordership setRemark(String remark) {
        this.remark = remark;
            return this;
        }

    @Override
    public String toString() {
    return "Ordership{" +
            "id=" + id +
            ", orderId=" + orderId +
            ", shipname=" + shipname +
            ", shipaddress=" + shipaddress +
            ", provinceCode=" + provinceCode +
            ", province=" + province +
            ", cityCode=" + cityCode +
            ", city=" + city +
            ", areaCode=" + areaCode +
            ", area=" + area +
            ", phone=" + phone +
            ", tel=" + tel +
            ", zip=" + zip +
            ", sex=" + sex +
            ", remark=" + remark +
    "}";
    }
}
