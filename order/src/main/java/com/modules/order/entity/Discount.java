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
    public class Discount implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 折扣额度 比如 8.5折
            */
    private Double discount;

            /**
            * 折扣宣传文
            */
    private String name;

        public Integer getId() {
        return id;
        }

            public Discount setId(Integer id) {
        this.id = id;
            return this;
        }
        public Double getDiscount() {
        return discount;
        }

            public Discount setDiscount(Double discount) {
        this.discount = discount;
            return this;
        }
        public String getName() {
        return name;
        }

            public Discount setName(String name) {
        this.name = name;
            return this;
        }

    @Override
    public String toString() {
    return "Discount{" +
            "id=" + id +
            ", discount=" + discount +
            ", name=" + name +
    "}";
    }
}
