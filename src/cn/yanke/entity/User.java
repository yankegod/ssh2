package cn.yanke.entity;

import org.springframework.orm.hibernate5.HibernateTransactionManager;

/**
 * Created by yanke on 2016/12/12.
 */
public class User {
    private Integer uid;
    private String username;

    private String password;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {

        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
