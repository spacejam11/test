package com.example.demo;

import lombok.Data;
import org.seasar.doma.Table;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Column;


@Table(name = "users")
@Entity
public class UserData {

    @Id
    private Integer id;

    private Integer age;

    private String name;

    private String address;

    private String tel;
    
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
}
