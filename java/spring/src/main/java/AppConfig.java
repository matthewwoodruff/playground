import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Import(MyBeans.class)
public class AppConfig {

    @Autowired
    public List<Team> teams;

    // Spring subclasses this config file and calls super.myService() to get the
    // bean if it doesn't exist so calls to myService() in this class will use
    // the subclassed version, the one managed by spring.
    @Bean
    public MyService myService() {
        return new MyService(teams);
    }

    // By default, beans are singletons unless specified otherwise by the scope
    // annotation.
    // Possible value for scope are "singleton", "prototype", "request", and "session"
    // "request" and "session" are for spring mvc
    // "prototype" instantiates a new bean everytime
    @Bean
    @Scope("prototype")
    @Qualifier("awesomeService")
    public MyService myService2() {
        return new MyService(teams);
    }

}
