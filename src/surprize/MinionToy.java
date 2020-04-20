package surprize;

import java.util.Scanner;

public class MinionToy implements ISurprise {
    Scanner scanner = new Scanner(System.in);

    private String minionName;


    @Override
    public void enjoy() {
        System.out.println("You just got a minion toy, and you named it " + minionName);
    }

    @Override
    public void generate() {
        System.out.println("Name the minion: ");
        minionName = scanner.nextLine();
    }
}
