package testSpring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Source;

public class TestSpring {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );
        Service1.main(null);
        //每次去容器拿去对象 都会重新注入属性
        //保证对象无状态
        //只会调用一次构造函数 保证内存只有一个单例的对象
        //默认的情况-->单例模式  配置-->原型模式
        Source source = (Source) context.getBean("source");
        System.out.println(source.getFruit());
        System.out.println(source.getSugar());
        System.out.println(source.getSize());
    }
}
