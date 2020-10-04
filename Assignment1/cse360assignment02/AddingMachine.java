package cse360assignment02;

import java.util.ArrayList;

/**
 * This class adds and subtracts values from a sum.
 * CSE360 Assignment 1
 * Zak Sakata
 */

public class AddingMachine {
    private int total;
    private ArrayList<String> history = new ArrayList<>();

    /* AddingMachine Constructor */
    public AddingMachine () {
        total = 0;
        history.add("0");
    }

    /**
     * Returns the current sum of then numbers added or subtracted
     *
     * @return current total
     */
    public int getTotal () {
        return total;
    }

    /**
     * Adds a number to the current sum
     *
     * @param integer to add
     */
    public void add (int value) {
        total += value;
        history.add(" + " + value);
    }

    /**
     * Subtracts a number from the current sum
     *
     * @param integer to subtract
     */
    public void subtract (int value) {
        total -= value;
        history.add(" - " + value);
    }

    /**
     * Returns the history of all operations performed on the current total
     *
     * @return string containing the history of operations
     */
    public String toString () {
        return String.join("", history);
    }

    /* Resets the total and clears the current history of operations */
    public void clear() {
        total = 0;
        history.clear();
    }
}

