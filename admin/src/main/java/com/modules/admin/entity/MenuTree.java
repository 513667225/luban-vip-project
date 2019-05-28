package com.modules.admin.entity;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class MenuTree {

    private String id;
    private String name;
    private int type;
    private String href;

    private List<MenuTree> children;


    public void initChild(){
        if (this.children==null) {
            this.children = new ArrayList<>();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<MenuTree> getChildren() {
        return children;
    }

    public void setChildren(List<MenuTree> children) {
        this.children = children;
    }
}
