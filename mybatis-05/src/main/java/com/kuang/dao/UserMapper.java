package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from mybatis.user")
    List<User> getUserList();

    //方法存在多个参数
    @Select("select * from mybatis.user where id = #{id} and name = #{name}")
    User getUserById(@Param("id") int id,@Param("name")String name);

     @Insert("insert into mybatis.user (id,name,pwd) values(#{id},#{name},#{password})")
     int addUser(User user);

     @Update("update mybatis.user set name = #{name},pwd=#{password} where id=#{id}" )
     int updateUser(User user);

     @Delete("delete from mybatis.user where id =#{uid}")
      int deleteUser (@Param("uid") int id);
    
}
