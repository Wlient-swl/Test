import com.swl.Service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wlient
 * @date 2020/9/20 1:49
 */
public class Spring_Test {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        EmployeeService employeeService = (EmployeeService) applicationContext.getBean("employeeService");
        employeeService.finadAll();
    }
}
