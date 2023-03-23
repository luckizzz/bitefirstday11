import com.hh.dao.OlympicInformationMapper;
import com.hh.pojo.OlympicInformation;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName: MybatisTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 何欢
 * @Create 2023/3/17 23:37
 * @Version 1.0
 */
public class MybatisTest {
    /*增删改的返回值都是固定的int或者void，即受影响的行数*/
    @Test
    public void testInsert() throws IOException {
        //加载核心配置文件
        InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(is);
        //获取SqlSessionFactory对象
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        //获取mapper接口对象
        OlympicInformationMapper mapper=sqlSession.getMapper(OlympicInformationMapper.class);
        //测试功能
        int result=mapper.insertOlympic();
        //提交事务,未使用提交，id也被占用
        /*sqlSession.commit();*/
        System.out.println("result:"+result);
    }
    @Test
    public void testUpdate() throws IOException {
        InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        OlympicInformationMapper mapper=sqlSession.getMapper(OlympicInformationMapper.class);
        mapper.updateOlympic();
        //sqlSession.commit();
    }
    @Test
    public void testDelete() throws IOException {
        InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        OlympicInformationMapper mapper=sqlSession.getMapper(OlympicInformationMapper.class);
        mapper.deleteOlympic();
    }
    /*查*/
    @Test
    public void testSelect() throws IOException {
        InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        OlympicInformationMapper mapper=sqlSession.getMapper(OlympicInformationMapper.class);
        /*OlympicInformation olympicInformation=om.getOlympicById();
        System.out.println(olympicInformation);*/
        List<OlympicInformation> list=mapper.getAllOlympic();
        //System.out.println(list);
        list.forEach(OlympicInformation->System.out.println(OlympicInformation));
    }
}
