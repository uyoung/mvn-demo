package me.young.demo.mvn.eo;

import java.util.Date;

/**
 * 用户信息
 * Created by flybe on 2018/11/14.
 */
public class User {
    private String name;
    private Date birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
