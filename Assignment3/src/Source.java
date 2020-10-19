/**
 * Zak Sakata
 * CSE360 Assignment 3
 * Source is an Observable that notifies its Observers when a new value is created
 */

import java.util.Observable;

public class Source extends Observable {
    private int value;

    /**
     * Generates a random integer between 0 to 250 and notifies observers
     */
    public void create() {
        value = (int) (Math.random() * 250) + 1;
        setChanged();
        notifyObservers();
    }

    /**
     * Returns the latest generated value
     *
     * @return generated value
     */
    public int getValue() {
        return value;
    }
}
