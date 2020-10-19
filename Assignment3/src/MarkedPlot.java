/**
 * Zak Sakata
 * CSE360 Assignment 3
 * MarketPlot is a concrete decorator adding points to the plot graph
 */

import java.awt.*;

public class MarkedPlot extends DecoratedPlot {
    /**
     * Adds a plot of all points on top of the concrete component plot
     *
     * @param Graphics containing the graph
     */
    @Override
    public void draw(Graphics g) {
        for (int i = 0; i < values.size(); i++) {
            g.setColor(Color.BLACK);
            g.fillRect(i * 25 - 5, 250 - values.get(i) - 5, 10, 10);
        }
        super.draw(g);
    }
}
