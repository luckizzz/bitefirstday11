import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName: OlympicInformationTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 何欢
 * @Create 2023/3/14 14:59
 * @Version 1.0
 */
public class OlympicInformationTest {
    public static void main(String[] args) throws IOException {
        //1.获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        //2.获取SqlSessionFactory对象
        //InputStream inputStream=new InputStream("mybatis-config.xml文件的路径")
        InputStream is= Resources.getResourceAsStream("mybatis-config.xml");//Resources.getResourceAsStream就是从类的根路径下开始查找
        //InputStream is= Resources.getResourceAsStream("com/mybatis.xml");
        //InputStream is=new FileInputStream("d:\\mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(is);//流指向核心配置文件，sqlSessionFactoryBuilder再利用build
        //一般情况都是一个数据库对应一个SqlSessionFactory对象
        //3.获取SqlSession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();//不支持自动提交
        //4.执行SQL语句
        //int count=sqlSession.insert("SQL语句的id");
        int count=sqlSession.insert("insertOlympicInformation");
        System.out.println("插入了几条记录："+count);
        //5.手动提交
        sqlSession.commit();
    }
}
