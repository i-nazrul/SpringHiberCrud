/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmvc.dao;

import springmvc.model.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public User loginUser(String email, String pass) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("SELECT u FROM User u WHERE u.email =:email and u.pass=:pass");

        query.setString("email", email);
        query.setString("pass", pass);

        List<User> cList = query.list();
        cList.toString();
        System.out.println(cList.size());
        System.out.println("Dao");
        return cList.size() > 0 ? cList.get(0) : null;
    }

}
