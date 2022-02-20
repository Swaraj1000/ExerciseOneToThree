import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketballTeamTest extends Main{

    @Test
    public void getTeamName() {
        BasketballTeam basketballTeam1 = new BasketballTeam("Los Angeles Lakers",8);
        assertEquals("Los Angeles Lakers",basketballTeam1.getTeamName());
        System.out.println("Name of the team is " + basketballTeam1.getTeamName());
        BasketballTeam basketballTeam2 = new BasketballTeam("Cleveland Cavaliers",10);
        assertEquals("Cleveland Cavaliers",basketballTeam2.getTeamName());
        System.out.println("Name of the team is " + basketballTeam2.getTeamName());
        BasketballTeam basketballTeam3 = new BasketballTeam("Boston Celtics",12);
        assertEquals("Boston Celtics",basketballTeam3.getTeamName());
        System.out.println("Name of the team is " + basketballTeam3.getTeamName());
    }
    @Test
    public void getPoints() {
        BasketballTeam basketballTeam1 = new BasketballTeam("Los Angeles Lakers",8);
        assertEquals(8,basketballTeam1.getPoints());
        System.out.println("Current points of the team Los Angeles Lakers is " + basketballTeam1.getPoints());
        BasketballTeam basketballTeam2 = new BasketballTeam("Cleveland Cavaliers",10);
        assertEquals(10,basketballTeam2.getPoints());
        System.out.println("Current points of the team Los Cleveland Cavaliers is " + basketballTeam1.getPoints());
        BasketballTeam basketballTeam3 = new BasketballTeam("Boston Celtics",12);
        assertEquals(12,basketballTeam3.getPoints());
        System.out.println("Current points of the team Los Boston Celtics is " + basketballTeam1.getPoints());

    }
}





