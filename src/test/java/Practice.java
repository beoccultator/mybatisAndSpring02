import com.test.bean.Student;
import com.test.dao.StudentDao;
import com.test.dao.impl.StudentDaoImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Practice {


    @Test
    public void test(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-dao.xml");
        StudentDao studentDaoImpl = classPathXmlApplicationContext.getBean("studentDao", StudentDao.class);
        List<Student> students = studentDaoImpl.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }




}
