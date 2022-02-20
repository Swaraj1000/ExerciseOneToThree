import java.util.Comparator;
import java.util.Objects;

public class BasketballTeam implements ITeam, Comparator<BasketballTeam> {
    public String teamName;
    public int points;

    public BasketballTeam() {
        String teamName = "";
        int points = 0;
    }

    public BasketballTeam(String teamName, int points) {
        this.teamName = teamName;
        this.points = points;
    }

    @Override
    public void updatePoints(String result) {
        if (Objects.equals(result, "Win")){
            this.points +=2;
        }else if (Objects.equals(result, "Lose")) {
            this.points = this.points;
        }
    }
    @Override
    public String getTeamName() {
        return this.teamName;
    }

    @Override
    public int getPoints() {
        return this.points;
    }

    @Override
    public int compare(BasketballTeam o1, BasketballTeam o2) {
        return o1.getPoints() - o2.getPoints();
    }
}
