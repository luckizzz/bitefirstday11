import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * ClassName: OlympicInformationCompleteTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 何欢
 * @Create 2023/3/15 7:02
 * @Version 1.0
 */
public class OlympicInformationCompleteTest {
    public static void main(String[] args) {
        SqlSession sqlSession=null;
        try {
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
            //开启会话（底层会开启事物）
            sqlSession=sqlSessionFactory.openSession();
            //执行SQL语句，处理相关业务
            int count=sqlSession.insert("insertOlympicInformation");
            System.out.println("插入了几条记录："+count);
            //执行到这里，没有发生任何异常，提交事物，终止事物
            sqlSession.commit();
        } catch (IOException e) {
            //以防异常，最好回滚事物
            if (sqlSession!=null){
                sqlSession.rollback();
            }
            throw new RuntimeException(e);
        }finally {
            //关闭会话（释放资源）
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }
}
