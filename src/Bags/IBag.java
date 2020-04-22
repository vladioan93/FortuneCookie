package Bags;

import surprises.ISurprise;

import java.util.ArrayList;

public interface IBag {

    // adds a surprise in the bag
    void put(ISurprise newSurprise);

    // adds all the surprises from another IBag
    //   -> the 'bagOfSurprises' will be empty() afterwards
    void put(IBag bagOfSurprises);

    default void put(ArrayList<ISurprise> arrayList){

    }

    // removes a surprise from the bag and returns it
    ISurprise takeOut();

    // Checks if the bag is empty or not
    boolean isEmpty();

    // Returns the number of surprises
    int size();

    static void show(IBag bag){
        System.out.println("This bag contains: ");
        for (int i = 0; i < bag.size(); i++) {
            System.out.print("\t\n(" + (i + 1) + ") ");
            bag.get(i).show();
        }
    };

    ISurprise get(int n);
}
