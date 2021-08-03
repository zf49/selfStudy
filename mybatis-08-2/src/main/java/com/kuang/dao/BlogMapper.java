package com.kuang.dao;

import com.kuang.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    
    Blog getBlog();



    int addBlog(Blog blog);


    List<Blog> queryBlogIf(Map map);

}
