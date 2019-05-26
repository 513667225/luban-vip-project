package com.modules.product.entity;

    import java.math.BigDecimal;
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
    public class Spec implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 唯一id
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 商品id
            */
        @TableField("productId")
    private String productId;

            /**
            * 尺寸
            */
        @TableField("specSize")
    private String specSize;

            /**
            * 此规格商品库存数
            */
        @TableField("specStock")
    private Integer specStock;

            /**
            * 此规格的商品价格
            */
        @TableField("specPrice")
    private BigDecimal specPrice;

            /**
            * 是否显示规格 y:显示  n:不显示
            */
        @TableField("specStatus")
    private String specStatus;

        public Integer getId() {
        return id;
        }

            public Spec setId(Integer id) {
        this.id = id;
            return this;
        }
        public String getProductId() {
        return productId;
        }

            public Spec setProductId(String productId) {
        this.productId = productId;
            return this;
        }
        public String getSpecSize() {
        return specSize;
        }

            public Spec setSpecSize(String specSize) {
        this.specSize = specSize;
            return this;
        }
        public Integer getSpecStock() {
        return specStock;
        }

            public Spec setSpecStock(Integer specStock) {
        this.specStock = specStock;
            return this;
        }
        public BigDecimal getSpecPrice() {
        return specPrice;
        }

            public Spec setSpecPrice(BigDecimal specPrice) {
        this.specPrice = specPrice;
            return this;
        }
        public String getSpecStatus() {
        return specStatus;
        }

            public Spec setSpecStatus(String specStatus) {
        this.specStatus = specStatus;
            return this;
        }

    @Override
    public String toString() {
    return "Spec{" +
            "id=" + id +
            ", productId=" + productId +
            ", specSize=" + specSize +
            ", specStock=" + specStock +
            ", specPrice=" + specPrice +
            ", specStatus=" + specStatus +
    "}";
    }
}
