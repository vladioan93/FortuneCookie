package surprize;

public class FortuneCookie implements ISurprise {

    String[] FortuneCookieTexts = new String[20];

    @Override
    public void enjoy() {
        System.out.println("deschiderea surprizei");
    }

    @Override
    public void generate() {
        int nr = random.nextInt(20);
        System.out.println(nr);
    }
}
