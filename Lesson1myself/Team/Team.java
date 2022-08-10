package Lesson1.Lesson1myself.Team;

public class Team {
    public String nameTeam;
    public int power;

    //
    public String namePlayer;
    public Player[] players;


    public Team(String nameTeam, Player... players) {
        this.nameTeam = nameTeam;
        this.players = players;
    }

    public void ShowPlayersInfo() {
        System.out.println(nameTeam);
        System.out.println(namePlayer + power);
    }

}
