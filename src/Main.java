import Bags.IBag;
import Bags.RandomBag;
import surprize.Candy;
import surprize.FortuneCookie;
import surprize.ISurprise;
import surprize.MinionToy;

public class Main {
    public static void main(String[] args) {
        ISurprise fortuneCookie = new FortuneCookie();
        fortuneCookie.generate();

        fortuneCookie.enjoy();

        ISurprise candy = new Candy();
        candy.generate();
        candy.enjoy();

        ISurprise minionToy = new MinionToy();
        minionToy.generate();
        minionToy.enjoy();

        IBag randomBag = new RandomBag();
        randomBag.put(fortuneCookie);
        randomBag.put(candy);
        randomBag.put(minionToy);

        System.out.println("==========");
        randomBag.takeOut().enjoy();
        System.out.println("==========");
        randomBag.takeOut().enjoy();
        System.out.println("==========");
        randomBag.takeOut().enjoy();

        System.out.println(randomBag.size());
    }
}
