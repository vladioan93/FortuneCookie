public class GiveSurpriseAndSing extends AbstractGiveSurprises {
    public GiveSurpriseAndSing(int waitTime, String bag) {
        super(waitTime, bag);
    }

    @Override
    void giveWithPassion() {
        System.out.println("Singing a nice song, full of joy and genuine excitement…");
    }
}
