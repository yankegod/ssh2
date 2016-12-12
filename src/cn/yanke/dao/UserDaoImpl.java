package cn.yanke.dao;

import cn.yanke.entity.User;
import org.springframework.orm.hibernate5.HibernateTemplate;

/**
 * Created by yanke on 2016/12/12.
 */
public class UserDaoImpl implements UserDao {

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void add() {
        User user = new User();
        user.setUid(1);
        user.setUsername("yanke");
        user.setPassword("12345");

        hibernateTemplate.save(user);

        System.out.println("userDaoImpl");
    }
}
