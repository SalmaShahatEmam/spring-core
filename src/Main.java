import DB.DatabaseOperations;
import interfaces.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shapes.Circule;
import shapes.Square;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        container.getBean("dbOperation");

        ((ConfigurableApplicationContext) container).close(); // ✅
    }
}