/**
 * Zak Sakata
 * CSE360 Assignment 3
 * PlotPanel is an Observer that redraws its graph with the newly created integer from Source
 */

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class PlotPanel extends JPanel implements Observer {
    Drawable drawable;

    /* PlotPanel constructor */
    PlotPanel(Drawable drawable) {
        this.drawable = drawable;
    }

    /**
     * Repaints JPanel when Observable is updated and calls all its Observers
     *
     * @param Observable that notifies this class
     * @param arguments from Observable
     */
    @Override
    public void update(Observable o, Object arg) {
        drawable.setValue(((Source)o).getValue());
        repaint();
    }

    /**
     * Redraws graph upon repainting of JPanel
     *
     * @param Graphics containing the graph
     */
    public void paintComponent(Graphics g) {
        if (drawable != null) drawable.draw(g);
    }
}
