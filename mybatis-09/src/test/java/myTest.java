import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class myTest {

     @Test
    public void testQueryUserByID(){

         SqlSession sqlSession = MybatisUtils.getSqlSession();
          SqlSession sqlSession2 = MybatisUtils.getSqlSession();

          UserMapper mapper = sqlSession.getMapper(UserMapper.class);

          User user = mapper.queryUserById(2);
          System.out.println(user);

          sqlSession.close();


          
          UserMapper mapper2= sqlSession2.getMapper(UserMapper.class);
          User user1 = mapper2.queryUserById(2);
          System.out.println(user1);

          sqlSession2.close();


     }



}
