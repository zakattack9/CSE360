/**
 * Zak Sakata
 * CSE360 Assignment 3
 * BarPlot is a concrete decorator adding bars to the plot graph
 */

import java.awt.*;

public class BarPlot extends DecoratedPlot {
    /**
     * Adds a plot of the points as bars on top of the concrete component plot
     *
     * @param Graphics containing the graph
     */
    @Override
    public void draw(Graphics g) {
        for (int i = 0; i < values.size(); i++) {
            g.setColor(Color.GRAY);
            g.fillRect(i * 25 - 5, 250 - values.get(i), 10, values.get(i));
        }
        super.draw(g);
    }
}
