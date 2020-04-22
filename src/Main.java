import Bags.*;

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

        bag3.put(GatherSurprises.gather());
        bag3.put(GatherSurprises.gather());
        bag3.put(GatherSurprises.gather());
        bag3.put(GatherSurprises.gather());
        bag3.put(GatherSurprises.gather());
        bag3.put(GatherSurprises.gather());

        System.out.println("urmeaza primul bag===============");
        show(bag3);


        GatherSurprises.gather(5);

        bag1.put(bag3);
        bag1.put(GatherSurprises.gather());
        bag1.put(GatherSurprises.gather());
        bag1.put(GatherSurprises.gather());
        bag1.put(GatherSurprises.gather());

        System.out.println("urmeaza al doilea bag===========");

        show(bag1);

        System.out.println("primul bag ar trebui sa fie gol=======");
        show(bag3);

        System.out.println("Adaugam din bag 1 in bag 2(din fifo)");
        bag2.put(bag1);
        show(bag2);
        System.out.println("===============================");
        bag1.put(bag2);
        show(bag1);

        System.out.println("\n\npana aici e bine");
        GiveSurpriseAndApplause giveSurpriseAndApplause = new GiveSurpriseAndApplause("FIFO", 4);


    }
}
