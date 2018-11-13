package me.young.demo.mvn.eo;

/**
 * 用户扩展类
 * Created by flybe on 2018/11/14.
 */
public class UserExt extends User {
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
