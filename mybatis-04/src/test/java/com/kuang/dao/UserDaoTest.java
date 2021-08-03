package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {

     static  Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void getUserList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    
      @Test
   public void getUserbyId(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
       UserMapper mapper = sqlSession.getMapper(UserMapper.class);
       User userById = mapper.getUserById(2);
       System.out.println(userById);
       sqlSession.close();
   }


   @Test
   public void testLog4j(){
        logger.info("jinrudao Test loj4j");
        logger.debug("debug: test");
       logger.debug("error: test");
   }


     @Test
   public void getListByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
         UserMapper mapper = sqlSession.getMapper(UserMapper.class);
         Map<String,Object> map = new HashMap<>();
         map.put("startIndex",0);
         map.put("pageSize",3);

         List<User> userByLimit = mapper.getUserByLimit(map);
         for (User user : userByLimit) {
             System.out.println(user);
         }

         sqlSession.close();
   }


     @Test
    public void getUserByRowBounds(){
         SqlSession sqlSession = MybatisUtils.getSqlSession();
         //RowBounds
         RowBounds rowBounds = new RowBounds(1,2);
         
         List<User> userList = sqlSession.selectList("com.kuang.dao.UserMapper.getUserByRowBounds",null,rowBounds);
         for (User user : userList) {
             System.out.println(user);
         }


         
         sqlSession.close();
    }



}
