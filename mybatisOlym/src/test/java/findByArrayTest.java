import com.hh.pojo.OlympicInformation;
import com.hh.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

/**
 * ClassName: findByArrayTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 何欢
 * @Create 2023/3/15 10:29
 * @Version 1.0
 */
public class findByArrayTest {
    public static void main(String[] args) {
        SqlSession session= MybatisUtil.getSqlSession();
        Integer[] roleIds={2,3};
        List<OlympicInformation> olympicInformations=session.selectList("com.hh.dao"
                +".OlympicInformationMapper.findByArry",roleIds);

        for(OlympicInformation olympicInformation : olympicInformations){
            System.out.println(olympicInformation);
        }
        session.close();
    }


}
