import Bags.BagFactory;
import Bags.IBag;
import surprize.ISurprise;

import java.time.chrono.IsoChronology;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
    private int waitTime;
    private IBag bag;
    private BagFactory bagFactory;

    public AbstractGiveSurprises(int waitTime, String bag) {
        this.waitTime = waitTime;
        this.bag = bagFactory.makeBag(bag);
    }

    public void put(ISurprise newSurprise){
        this.bag.put(newSurprise);
    }

    public void put(IBag surprises){
        this.bag.put(surprises);
    }

    public void give(){
        this.bag.takeOut();
        giveWithPassion();
    }

    public void giveAll(){
        while(!this.bag.isEmpty()){
            try {
                TimeUnit.SECONDS.sleep(waitTime);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            this.bag.takeOut();
        }
        giveWithPassion();
    }

    public boolean isEmpty(){
        return bag.isEmpty();
    }

    abstract void giveWithPassion();
}
