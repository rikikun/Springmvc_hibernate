package com.dtec.template.entity;

import javax.persistence.*;

/**
 * Created by rikikun on 2/16/2015.
 */
@Entity
@Table(name = "USERDETAIL")
public class UserDetail  {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "SURNAME")
    private String surName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
