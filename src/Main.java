import surprize.FortuneCookie;
import surprize.ISurprise;

public class Main {
    public static void main(String[] args) {
        ISurprise firstSurprize = new FortuneCookie();
        firstSurprize.generate();
    }
}
