import com.zhangchi.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 15:26 2018/7/18
 * @Modified By:
 */

public class springtest {

    @Test
    public void savetest(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        userDao.save();

    }


}
