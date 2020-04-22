package surprises;

import java.util.Scanner;

public class MinionToy implements ISurprise {
    Scanner scanner = new Scanner(System.in);

    private String minionName;


    @Override
    public void enjoy() {
        System.out.println("You just got a minion toy!");
        System.out.println("Name the minion: ");
        minionName = scanner.nextLine();
    }

    @Override
    public void generate() {

    }

    @Override
    public void show() {
        System.out.print("Minion toy");
    }
}
