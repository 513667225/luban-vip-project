package com.modules.account.entity;

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
    public class Accountrank implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * id
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 级别编码:
R1：普通会员 0-499
R2：铜牌会员 500-999
R3： 银牌会员 1000-1999
R4： 金牌会员 2000-4000
R5：钻石会员 大于4000

            */
    private String code;

            /**
            * 级别名称
            */
    private String name;

            /**
            * 最小积分
            */
        @TableField("minScore")
    private Integer minScore;

            /**
            * 最大积分
            */
        @TableField("maxScore")
    private Integer maxScore;

            /**
            * 备注
            */
    private String remark;

        public Integer getId() {
        return id;
        }

            public Accountrank setId(Integer id) {
        this.id = id;
            return this;
        }
        public String getCode() {
        return code;
        }

            public Accountrank setCode(String code) {
        this.code = code;
            return this;
        }
        public String getName() {
        return name;
        }

            public Accountrank setName(String name) {
        this.name = name;
            return this;
        }
        public Integer getMinScore() {
        return minScore;
        }

            public Accountrank setMinScore(Integer minScore) {
        this.minScore = minScore;
            return this;
        }
        public Integer getMaxScore() {
        return maxScore;
        }

            public Accountrank setMaxScore(Integer maxScore) {
        this.maxScore = maxScore;
            return this;
        }
        public String getRemark() {
        return remark;
        }

            public Accountrank setRemark(String remark) {
        this.remark = remark;
            return this;
        }

    @Override
    public String toString() {
    return "Accountrank{" +
            "id=" + id +
            ", code=" + code +
            ", name=" + name +
            ", minScore=" + minScore +
            ", maxScore=" + maxScore +
            ", remark=" + remark +
    "}";
    }
}
