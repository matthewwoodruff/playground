import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(context.getBeanDefinitionCount());

        for(String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }

        MyService myService = context.getBean("myService", MyService.class);

        System.out.println(myService.getName());
        System.out.println(myService.getTeams());

        // Have to call this for pre destroy annotations to work
        context.close();
    }

}
