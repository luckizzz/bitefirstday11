package com.hh.dao;

import com.hh.pojo.OlympicInformation;

import java.util.List;

/**
 * ClassName: OlympicInformationMapper
 * Package: com.hh.dao
 * Description:
 *
 * @Author 何欢
 * @Create 2023/3/8 11:41
 * @Version 1.0
 */
public interface OlympicInformationMapper {
    /*
    *Mybatis面向接口编程的两个一致
    * 1.映射文件的namespace要和mapper接口的的全类名保持一致
    * 2.映射文件的SQL语句的id要和mapper接口的方法名一致
    *
    * 表--实体类--映射文件--mapper接口
    *
    * */
    /*
    * 添加信息
    * */
    int insertOlympic();
    /*
    * 修改信息
    * */
    void updateOlympic();
    /*
    * 删除信息
    * */
    void deleteOlympic();
    /**
     *根据id查询信息
     */
    OlympicInformation getOlympicById();
    /**
     * 查询所有信息
     */
    List<OlympicInformation> getAllOlympic();
}
