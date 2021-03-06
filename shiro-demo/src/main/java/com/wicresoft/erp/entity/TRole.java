package com.wicresoft.erp.entity;

public class TRole {
    /**
     * 
     */
    private Long id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色类型
     */
    private String type;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 角色名称
     * @return name 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 角色名称
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 角色类型
     * @return type 角色类型
     */
    public String getType() {
        return type;
    }

    /**
     * 角色类型
     * @param type 角色类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}