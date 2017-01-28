import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Team {
    private final String id;

    public Team(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @PostConstruct
    public void doThisAfterCreatingABean() {
        System.out.println("Post constructing stuff");
    }

    @PreDestroy
    public void doThisBeforeDestroying() {
        System.out.println("Pre destroy stuff");
    }
}
