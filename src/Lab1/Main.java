package Lab1;

//import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);*/
        UserIntrface ui = new Interface();
        UserIntrface uit = new TopicGenerator();
        UserIntrface uis = new Section();
        UserIntrface uif = new Footer();

        ui.Developers();
        ui.Entroduction();

        int i = ui.AskUser();
        int[] n = ui.Frame(i);
        uit.GenerateTopic();
        uis.GenerateSection(i, n);
        uif.GenerateFoot();
    }
}
