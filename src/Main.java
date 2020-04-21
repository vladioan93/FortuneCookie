import Bags.*;
import surprize.Candy;
import surprize.FortuneCookie;
import surprize.ISurprise;
import surprize.MinionToy;

import static Bags.IBag.show;

public class Main {
    public static void main(String[] args) {
       /* ISurprise fortuneCookie = new FortuneCookie();
        fortuneCookie.generate();
        fortuneCookie.enjoy();

        ISurprise candy = new Candy();
        candy.generate();
        candy.enjoy();

        ISurprise minionToy = new MinionToy();
        minionToy.generate();
        minionToy.enjoy();

        IBag bag = bagFactory.makeBag("LIFO");
        bag.put(fortuneCookie);
        bag.put(candy);
        bag.put(minionToy);

        System.out.println("==========");
        System.out.println("==========");

        show(bag);
        System.out.println("==========");
        bag.takeOut().enjoy();
        bag.takeOut().enjoy();

        System.out.println(bag.size());
        bag.takeOut().enjoy();

        IBag bag2 = bagFactory.makeBag("FIFO");
*/
        BagFactory bagFactory = new BagFactory();

        IBag bag1 = bagFactory.makeBag("FIFO");
        IBag bag2 = bagFactory.makeBag("LIFO");
        IBag bag3 = bagFactory.makeBag("RANDOM");
        System.out.println("pana aici e bine");


    }
}
