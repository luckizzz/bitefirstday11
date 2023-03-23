package com.hh.dao.Impl;

import com.hh.dao.OlympicInformationMapper;
import com.hh.pojo.OlympicInformation;
import com.hh.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * ClassName: OlympicInformationImpl
 * Package: com.hh.dao.Impl
 * Description:
 *
 * @Author 何欢
 * @Create 2023/3/8 11:42
 * @Version 1.0
 */
public class OlympicInformationImpl implements OlympicInformationMapper {
    @Override
    public int insertOlympic() {
        return 0;
    }

    @Override
    public void updateOlympic() {

    }

    @Override
    public void deleteOlympic() {

    }

    @Override
    public OlympicInformation getOlympicById() {
        return null;
    }

    @Override
    public List<OlympicInformation> getAllOlympic() {
        return null;
    }

    /*@Override
    public List<OlympicInformation> findByArry(Integer[] array) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        return sqlSession.selectList("com.hh.dao"
                +".OlympicInformationMapper.findByArry",array);
    }*/
}
