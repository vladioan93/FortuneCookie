package Bags;

import surprize.ISurprise;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBag implements IBag {

    Random random = new Random();

    private List<ISurprise> bag = new ArrayList<ISurprise>();

    @Override
    public void put(ISurprise newSurprise) {
        bag.add(bag.size() == 0 ? 0 : random.nextInt(bag.size()), newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while(!bagOfSurprises.isEmpty()){
            put(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        if(bag.isEmpty())
            return null;
        int nr = random.nextInt(bag.size());
        ISurprise copyOfSurprise = bag.get(nr);
        bag.remove(nr);
        return copyOfSurprise;
    }

    @Override
    public boolean isEmpty() {
        return bag.isEmpty();
    }

    @Override
    public int size() {
        return bag.size();
    }
}
