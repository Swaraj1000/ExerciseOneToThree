import static org.junit.Assert.assertEquals;

public class FootballTeamTest {


    @org.junit.Test
    public void getTeamName() {
        FootballTeam FootballTeam1 = new FootballTeam("Chelsea",34,"Happy Foot");
        assertEquals("Chelsea",FootballTeam1.getTeamName());
        System.out.println("Name of the team is " + FootballTeam1.getTeamName());
        FootballTeam FootballTeam2 = new FootballTeam("Manchester United",41,"Bet Company");
        assertEquals("Manchester United",FootballTeam2.getTeamName());
        System.out.println("Name of the team is " + FootballTeam2.getTeamName());
        FootballTeam FootballTeam3 = new FootballTeam("Liverpool",47,"Nice Stadium");
        assertEquals("Liverpool",FootballTeam3.getTeamName());
        System.out.println("Name of the team is " + FootballTeam3.getTeamName());
        
    }

    @org.junit.Test
    public void getPoints() {
        FootballTeam footballTeam1 = new FootballTeam("Chelsea",34,"Happy Foot");
        assertEquals(34,footballTeam1.getPoints());
        System.out.println("Current points of the team Chelsea is " + footballTeam1.getPoints());
        FootballTeam footballTeam2 = new FootballTeam("Manchester United",41,"Bet Company");
        assertEquals(41,footballTeam2.getPoints());
        System.out.println("Current points of the team Manchester United is " + footballTeam2.getPoints());
        FootballTeam footballTeam3 = new FootballTeam("Liverpool",47,"Nice Stadium");
        assertEquals(47,footballTeam3.getPoints());
        System.out.println("Current points of the team Liverpool is " + footballTeam3.getPoints());

    }

}