import com.kuang.dao.BlogMapper;
import com.kuang.pojo.Blog;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mytestFile {



    @Test
    public void testIf(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap<>();
//        map.put("title","Spring so easy ");
        map.put("author","狂神说2222222");
//                map.put("id","05ee467c43c044c6b28fb1dfd45e8e82");

        List<Blog> blogs =  mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
//         map.put("views",9999);
//
//        List<Blog> blogs = mapper.queryBlogChoose(map);
//        for (Blog blog : blogs) {
//            System.out.println(blog);
//        }

//        int i = mapper.queryBlogupdate(map);
        


        sqlSession.close();
    }

     @Test
    public void testquery(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
         BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

         Map map = new HashMap<>();

         ArrayList<Integer> ids = new ArrayList<>();
         map.put("ids",ids);
         
           ids.add(1);
//           ids.add(2);
//           ids.add(3);



         List<Blog> blogs = mapper.checkBlog(map);




         for (Blog blog : blogs) {
             System.out.println(blog);
         }

         sqlSession.close();
    }



}
