import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat bean2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean2.getMessage());

        HelloWorld bean3 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean3.getMessage());


        System.out.println(bean.equals(bean2));
        System.out.println(bean.equals(bean3));

    }
}