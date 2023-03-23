package com.hh.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * ClassName: MybatisUtil
 * Package: com.hh.util
 * Description:
 *
 * @Author 何欢
 * @Create 2023/3/8 11:43
 * @Version 1.0
 */
public class MybatisUtil {
    public static SqlSessionFactory sqlSessionFactory = null;
    static {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = builder.build(reader);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession(true);
    }
}
