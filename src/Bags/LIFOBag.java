package Bags;

import surprize.ISurprise;

import java.util.ArrayList;
import java.util.List;

public class LIFOBag implements IBag {

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
        ISurprise copyOfSurprise = bag.get(bag.size()-1);
        bag.remove(bag.size()-1);
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

    @Override
    public ISurprise get(int n) {
        return bag.get(n);
    }
}
