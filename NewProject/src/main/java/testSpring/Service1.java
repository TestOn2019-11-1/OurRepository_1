package testSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Source;

public class Service1 {
    public static void main(String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"});
        Source source = (Source) context.getBean("source");
        source.setFruit("苹果");
        System.out.println(source.getFruit());

    }
}
