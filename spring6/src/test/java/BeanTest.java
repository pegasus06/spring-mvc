import com.atguigu.spring6.event.EmailEvent;
import com.atguigu.spring6.pojo.Person;
import com.atguigu.spring6.service.Chinese;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    @Test
    public void testBean(){
        //创建spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //获取bean
        Person person = applicationContext.getBean("person", Person.class);
        person.useAxe();

    }
    @Test
    public void testApplicationListener(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        EmailEvent emailEvent = new EmailEvent("test", "spring-test", "this is a test");
        //发布容器事件
        classPathXmlApplicationContext.publishEvent(emailEvent);
    }
    @Test
    public void testSingletonAndPrototype(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person bean = (Person) classPathXmlApplicationContext.getBean("p1");
        Person bean2 = (Person) classPathXmlApplicationContext.getBean("p1");
        Person bean1 = (Person) classPathXmlApplicationContext.getBean("p2");
        Person bean3 = (Person) classPathXmlApplicationContext.getBean("p2");
        System.out.println(bean==bean2);
        System.out.println(bean1==bean3);

    }
    @Test
    public void testSpring(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Chinese bean = context.getBean("chinese", Chinese.class);
        bean.info();
    }
}
