package com.modules.admin.entity;

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
    public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 唯一id
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 父id
            */
    private Integer pid;

            /**
            * 资源
            */
    private String url;

            /**
            * 资源名称
            */
    private String name;

            /**
            * 序号
            */
        @TableField("orderNum")
    private Integer orderNum;

            /**
            * 功能类型  module : 模块  page:页面  button:功能
            */
    private String type;

        public Integer getId() {
        return id;
        }

            public Menu setId(Integer id) {
        this.id = id;
            return this;
        }
        public Integer getPid() {
        return pid;
        }

            public Menu setPid(Integer pid) {
        this.pid = pid;
            return this;
        }
        public String getUrl() {
        return url;
        }

            public Menu setUrl(String url) {
        this.url = url;
            return this;
        }
        public String getName() {
        return name;
        }

            public Menu setName(String name) {
        this.name = name;
            return this;
        }
        public Integer getOrderNum() {
        return orderNum;
        }

            public Menu setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
            return this;
        }
        public String getType() {
        return type;
        }

            public Menu setType(String type) {
        this.type = type;
            return this;
        }

    @Override
    public String toString() {
    return "Menu{" +
            "id=" + id +
            ", pid=" + pid +
            ", url=" + url +
            ", name=" + name +
            ", orderNum=" + orderNum +
            ", type=" + type +
    "}";
    }
}
