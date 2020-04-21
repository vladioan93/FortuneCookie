public class GiveSurpriseAndHug extends AbstractGiveSurprises {
    public GiveSurpriseAndHug(int waitTime, String bag) {
        super(waitTime, bag);
    }

    @Override
    void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");
    }
}
