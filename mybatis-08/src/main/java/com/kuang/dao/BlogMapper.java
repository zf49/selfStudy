package com.kuang.dao;

import com.kuang.pojo.Blog;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    
    Blog getBlog();



    int addBlog(Blog blog);


    List<Blog> queryBlogIf(Map map);

}
