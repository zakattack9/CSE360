/**
 * Zak Sakata
 * CSE360 Assignment 3
 * Drawable is an abstract class defining the decorator head of the plot graphs
 */

import java.awt.*;
import java.util.LinkedList;

public abstract class Drawable {
    protected LinkedList<Integer> values = new LinkedList<Integer>();

    /**
     * Adds to LinkedList of values preventing a total of no more than 20 values
     *
     * @param integer to be added to list of values
     */
    public void setValue(int v) {
        if (values.size() == 20) values.removeFirst();
        values.add(v);
    }

    /**
     * Draw graph and is to be overwritten by inherited decorator classes
     *
     * @param Graphics containing the graph
     */
    public void draw(Graphics g) {}
}
