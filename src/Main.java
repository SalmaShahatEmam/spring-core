import interfaces.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shapes.Circule;
import shapes.Square;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Circule circuleBean = container.getBean("circle" , Circule.class);
        Square squareeBean = container.getBean("square" , Square.class);

        circuleBean.getArea();
        squareeBean.getArea();
    }
}