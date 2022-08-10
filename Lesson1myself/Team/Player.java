package Lesson1.Lesson1myself.Team;



public class Player {
    public  String namePlayer;
    public int power;
    public Player (String namePlayer, int power) {
        this.namePlayer = namePlayer;
        this.power = power;
    }
    public void ShowPlayersInfo() {
        System.out.println(namePlayer + power);
    }
}
