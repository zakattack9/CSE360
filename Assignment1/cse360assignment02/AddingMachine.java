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

    public AddingMachine () {
        total = 0;
        history.add("0");
    }

    public int getTotal () {
        return total;
    }

    public void add (int value) {
        total += value;
        history.add(" + " + value);
    }

    public void subtract (int value) {
        total -= value;
        history.add(" - " + value);
    }

    public String toString () {
        return String.join("", history);
    }

    public void clear() {
        total = 0;
        history.clear();
    }
}

