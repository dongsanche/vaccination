package com.hospital.bean;

public class hospitalBean {
    private Integer id;
    private String name;
    private String addressDesc;
    public hospitalBean(){
    }
    public hospitalBean(Integer id, String name, String addressDesc) {
        this.id = id;
        this.name = name;
        this.addressDesc = addressDesc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }

    public String getAddressDesc() {
        return addressDesc;
    }


    public void setAddressDesc(String addressDesc) {
        this.addressDesc = addressDesc;
    }
}
