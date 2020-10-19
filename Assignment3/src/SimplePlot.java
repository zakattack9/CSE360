/**
 * Zak Sakata
 * CSE360 Assignment 3
 * SimplePlot is the concrete component of Drawable and acts as the base of all attached decorators
 * Graphs simple line plots
 */

import java.awt.*;

public class SimplePlot extends Drawable {
    /**
     * Draws simple line plot of all values
     *
     * @param Graphics containing the graph
     */
    @Override
    public void draw(Graphics g) {
        int oldValue = 0;
        for (int i = 0; i < values.size(); i++) {
            g.drawLine((i - 1) * 25, 250 - oldValue, i * 25, 250 - values.get(i));
            oldValue = values.get(i);
        }
    }
}
