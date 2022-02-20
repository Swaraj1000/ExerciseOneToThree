import java.util.Comparator;
import java.util.Objects;


public class FootballTeam implements ITeam, Comparator<FootballTeam> {
    public String teamName;
    public int points;
    public String sponsor;

    public FootballTeam(String teamName, int points, String sponsor) {
        this.teamName = teamName;
        this.points = points;
        this.sponsor = sponsor;
    }

    public FootballTeam() {

    }

    @Override
    public void updatePoints(String result) {
        if (Objects.equals(result, "Win")) {
            this.points += 3;
        } else if (Objects.equals(result, "Drawn")) {
            this.points += 1;
        } else if (Objects.equals(result, "Lose")) {
//            this.points = this.points;
//        System.out.println("Points has been updated for Fotball team " + this.points);
        }
    }
    @Override
    public String getTeamName() {
        return teamName;
    }

    @Override
    public int getPoints() {
        return this.points;
    }

    public String getSponsor() {
        return teamName;
    }

    @Override
    public int compare(FootballTeam o1, FootballTeam o2) {
        return o1.getPoints() - o2.getPoints();
    }
}
