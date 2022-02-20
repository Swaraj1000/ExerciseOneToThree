import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        String line;
        ArrayList<FootballTeam> ft1 = new ArrayList<>();
        ArrayList<BasketballTeam> bt1 = new ArrayList<>();

        BasketballTeam basketballTeam;
        FootballTeam footballTeam;

        //Load Teams.csv
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\teams.csv"));
            while ((line = br.readLine()) != null) {
                String[] TeamRecord = line.split(",");
                if (TeamRecord[0].equals("Basketball")) {
                    basketballTeam = new BasketballTeam(TeamRecord[1], Integer.parseInt(TeamRecord[2]));
                    bt1.add(basketballTeam);

                }
                if (TeamRecord[0].equals("Football")) {
                    footballTeam = new FootballTeam(TeamRecord[1], Integer.parseInt(TeamRecord[2]), TeamRecord[3]);
                    ft1.add(footballTeam);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Sorted Record of Football Team
        System.out.println("Standing of Football teams = ");
        ft1.sort(new FootballTeam());
        for (FootballTeam item : ft1) {
            System.out.println("Team Name = " + item.getTeamName() + " , " + " Points = " + item.getPoints());
        }

        System.out.println("************************");

        //Sorted Record of BasketBall Team
        System.out.println("Standing of Basketball teams = ");
        bt1.sort(new BasketballTeam());
        for (BasketballTeam value : bt1) {
            System.out.println("Team Name = " + value.getTeamName() + " , " + " Points = " + value.getPoints());
        }


        ArrayList<String[]> ResultArray = new ArrayList<>();
        //Load Result.csv
        try {

            BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\results.csv"));
            while ((line = br.readLine()) != null) {

                String[] resultRecord = line.split(",");
                ResultArray.add(resultRecord);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        for (String[] strings : ResultArray) {
            for (FootballTeam team : ft1) {
                if (team.getTeamName().equals(strings[0])) {
                    team.updatePoints(strings[1]);
                }
            }
        }
        for (String[] strings : ResultArray) {
            for (BasketballTeam team : bt1) {
                if (team.getTeamName().equals(strings[0])) {
                    team.updatePoints(strings[1]);
                }
            }
        }
        System.out.println("************************");
        //Sorted Record of Football Team after adding points
        System.out.println("Standing of After Updating Football teams Score= ");
        ft1.sort(new FootballTeam());
        for (FootballTeam team : ft1) {
            System.out.println("Team Name = " + team.getTeamName() + " , " + " Points = " + team.getPoints());
        }

        System.out.println("************************");

        //Sorted Record of Basketball Team after adding points
        System.out.println("Standing of  After Updating Basketball teams Score= ");
        bt1.sort(new BasketballTeam());
        for (BasketballTeam team : bt1) {
            System.out.println("Team Name = " + team.getTeamName() + " , " + " Points = " + team.getPoints());

        }

    }
}