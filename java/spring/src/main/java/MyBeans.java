import org.springframework.context.annotation.Bean;

public class MyBeans {

    @Bean
    public Team getTeamA() {
        return new Team("A");
    }

    @Bean
    public Team getTeamB() {
        return new Team("B");
    }

}
