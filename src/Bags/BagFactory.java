package Bags;

public class BagFactory implements IBagFactory{
    @Override
    public IBag makeBag(String type) {
        if (type == null){
            throw new IllegalArgumentException();
        }
        switch (type){
            case "RANDOM":
                return new RandomBag();
            case "LIFO":
                return new LIFOBag();
            case "FIFO":
                return new FIFOBag();
        }
        throw new UnsupportedOperationException();
    }
}
