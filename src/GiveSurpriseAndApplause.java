public class GiveSurpriseAndApplause extends AbstractGiveSurprises {
    public GiveSurpriseAndApplause(String bag, int waitTime) {
        super(waitTime, bag);
    }

    @Override
    void giveWithPassion() {
        System.out.println("Loud applause to you… For it is in giving that we receive.");
    }
}
