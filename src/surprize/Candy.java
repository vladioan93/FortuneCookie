package surprize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Candy implements ISurprise {
    Random random = new Random();

    private final List<String> type =
            new ArrayList<String>(Arrays.asList("chocolate", "jelly", "fruits", "vanilla"));
    private String candyType;
    private int numberOfCandies;

    @Override
    public void enjoy() {
        System.out.println(numberOfCandies + " " + candyType + " cookies ");
    }

    @Override
    public void generate() {
        numberOfCandies = random.nextInt(50);
        candyType = type.get(random.nextInt(type.size()));
    }
}
