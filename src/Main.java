//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");
                info = game.getScore();
        System.out.println(info);
    }
}