/**
 * Zak Sakata
 * CSE360 Assignment 3
 * DecoratedPlot is a decorator that adds onto SimplePlot
 */

import java.awt.*;

public abstract class DecoratedPlot extends Drawable {
    protected Drawable drawable;

    /**
     * Sets concrete decorator
     *
     * @param Drawable concrete component of graph to be decorated
     */
    public void add(Drawable d) {
        drawable = d;
    }

    /**
     * Graphs the concrete decorator's plot onto concrete component
     *
     * @param Graphics containing the graph
     */
    @Override
    public void draw(Graphics g) {
        drawable.draw(g);
    }
}
