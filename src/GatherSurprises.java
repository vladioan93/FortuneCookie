import surprises.Candy;
import surprises.FortuneCookie;
import surprises.ISurprise;
import surprises.MinionToy;

import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {

    private static Random random = new Random();

    private GatherSurprises() {
    }

    public static ISurprise gather() {
        ISurprise surprise;
        int nr = random.nextInt(3);

        switch (nr) {
            case 0:
                surprise = new FortuneCookie();
                surprise.generate();
                return surprise;
            case 1:
                surprise = new Candy();
                surprise.generate();
                return surprise;
            case 2:
                surprise = new MinionToy();
                surprise.generate();
                return surprise;
        }
        return null;
    }

    public static ArrayList<ISurprise> gather(int n) {
        ArrayList<ISurprise> iSurprise = new ArrayList<ISurprise>();
        for (int i = 0; i < n; i++) {
            iSurprise.add(gather());
        }
        return iSurprise;
    }
}
