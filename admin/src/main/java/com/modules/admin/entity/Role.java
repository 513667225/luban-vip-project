package com.modules.admin.entity;

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
    public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 唯一id
            */
    private Integer id;

            /**
            * 角色名称
            */
    private String roleName;

            /**
            * 角色描述
            */
    private String roleDesc;

            /**
            * 数据库权限
            */
        @TableField("role_dbPrivilege")
    private String roleDbprivilege;

            /**
            * 角色状态 y:启用 n:禁用  默认y  如果角色被禁用 所有角色下的账号都不能使用
            */
    private String status;

        public Integer getId() {
        return id;
        }

            public Role setId(Integer id) {
        this.id = id;
            return this;
        }
        public String getRoleName() {
        return roleName;
        }

            public Role setRoleName(String roleName) {
        this.roleName = roleName;
            return this;
        }
        public String getRoleDesc() {
        return roleDesc;
        }

            public Role setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
            return this;
        }
        public String getRoleDbprivilege() {
        return roleDbprivilege;
        }

            public Role setRoleDbprivilege(String roleDbprivilege) {
        this.roleDbprivilege = roleDbprivilege;
            return this;
        }
        public String getStatus() {
        return status;
        }

            public Role setStatus(String status) {
        this.status = status;
            return this;
        }

    @Override
    public String toString() {
    return "Role{" +
            "id=" + id +
            ", roleName=" + roleName +
            ", roleDesc=" + roleDesc +
            ", roleDbprivilege=" + roleDbprivilege +
            ", status=" + status +
    "}";
    }
}
