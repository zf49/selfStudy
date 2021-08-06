package com.kuang.dao;

import com.kuang.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    
    Blog getBlog();



    int addBlog(Blog blog);

    // 查询博客
    List<Blog> queryBlogIf(Map map);


    List<Blog> queryBlogChoose(Map map);


    int queryBlogupdate(Map map);


//    查询第1，2，3个blog
      List<Blog> checkBlog(Map map);
    



}
