import java.util.List;

public class MyService {

    private final List<Team> teams;

    public MyService(List<Team> teams) {
        this.teams = teams;
    }

    public String getName() {
        return "Fred";
    }

    public List<Team> getTeams() {
        return teams;
    }
}
