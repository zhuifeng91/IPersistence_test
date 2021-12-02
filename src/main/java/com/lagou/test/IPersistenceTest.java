package com.lagou.test;

import com.lagou.dao.IUserDao;
import com.lagou.io.Resources;
import com.lagou.pojo.User;
import com.lagou.sqlSession.SqlSession;
import com.lagou.sqlSession.SqlSessionFactory;
import com.lagou.sqlSession.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


public class IPersistenceTest {

    @Test
    public void test() throws Exception {
        InputStream resourceAsSteam = Resources.getResourceAsSteam("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsSteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //调用
        User user = new User();
        user.setId(2);
        user.setUsername("tom");


       /* User user2 = sqlSession.selectOne("User.findByCondition", user);

        System.out.println(user2);*/

      /*  List<User> users = sqlSession.selectList("User.selectList");
        for (User user1 : users) {
            System.out.println(user1);
        }*/
/*
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        List<User> all = userDao.findAll();
        for (User user1 : all) {
            System.out.println(user1);
        }*/

/*
        User user1=userDao.findByCondition(user);
        System.out.println(user1);
*/

//        update
//        sqlSession.update("User.update",user);

        //delete
        sqlSession.delete("User.insert",user);

    }



}
