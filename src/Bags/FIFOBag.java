package Bags;

import surprize.ISurprise;
import java.util.ArrayList;
import java.util.List;

public class FIFOBag implements IBag {

    private List<ISurprise> bag = new ArrayList<ISurprise>();

    @Override
    public void put(ISurprise newSurprise) {
        bag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while (!bagOfSurprises.isEmpty()) {
            put(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        if (bag.isEmpty())
            return null;
        ISurprise copyOfSurprize = bag.get(0);
        bag.remove(0);
        return copyOfSurprize;
    }

    @Override
    public boolean isEmpty() {
        return bag.isEmpty();
    }

    @Override
    public int size() {
        return bag.size();
    }


    @Override
    public ISurprise get(int n) {
        return bag.get(n);
    }
}
