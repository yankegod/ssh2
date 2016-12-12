package cn.yanke.service;

import cn.yanke.dao.UserDao;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yanke on 2016/12/12.
 */

@Transactional
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        userDao.add();
        System.out.println("service=========");
    }
}
