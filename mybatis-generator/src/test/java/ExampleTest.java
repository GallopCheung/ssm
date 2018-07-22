import com.zhangchi.entity.Student;
import com.zhangchi.entity.StudentExample;
import com.zhangchi.mapper.StudentMapper;
import com.zhangchi.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 10:02 2018/7/13
 * @Modified By:
 */

public class ExampleTest {

    Logger logger = LoggerFactory.getLogger(ExampleTest.class);
    private SqlSession sqlSession;
    private StudentMapper studentMapper;

    @Before
    public void before(){

        sqlSession = MybatisUtils.getSqlSession();
        studentMapper = sqlSession.getMapper(StudentMapper.class);

    }

    @After
    public void after(){

        sqlSession.close();

    }

    @Test
    public void testInsert(){

        Student student = new Student();
        student.setStuName("王小花");
       /* student.setAddress("郑州");*/
        student.setSchoolId(3);
        // selecttive 有选择性的  如果数据库设置not null  则不能不插入数据
        studentMapper.insertSelective(student);

        sqlSession.commit();
    }

    @Test
    public void testExample(){

        StudentExample studentExample = new StudentExample();

        studentExample.createCriteria().andSchoolIdEqualTo(1).andStuNameLike("%孙万%");
        List<Student> studentList = studentMapper.selectByExample(studentExample);

        for(Student student : studentList) {
            System.out.println(student);
        }

    }


}
