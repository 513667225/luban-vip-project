package com.modules.order.entity;

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
    public class Express implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 唯一id
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 快递编码
            */
    private String code;

            /**
            * 快递名称
            */
    private String name;

            /**
            * 物流费用
            */
    private Double fee;

            /**
            * 排序
            */
    private Integer order1;

        public Integer getId() {
        return id;
        }

            public Express setId(Integer id) {
        this.id = id;
            return this;
        }
        public String getCode() {
        return code;
        }

            public Express setCode(String code) {
        this.code = code;
            return this;
        }
        public String getName() {
        return name;
        }

            public Express setName(String name) {
        this.name = name;
            return this;
        }
        public Double getFee() {
        return fee;
        }

            public Express setFee(Double fee) {
        this.fee = fee;
            return this;
        }
        public Integer getOrder1() {
        return order1;
        }

            public Express setOrder1(Integer order1) {
        this.order1 = order1;
            return this;
        }

    @Override
    public String toString() {
    return "Express{" +
            "id=" + id +
            ", code=" + code +
            ", name=" + name +
            ", fee=" + fee +
            ", order1=" + order1 +
    "}";
    }
}
