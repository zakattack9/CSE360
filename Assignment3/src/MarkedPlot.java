import java.awt.*;

public class MarkedPlot extends DecoratedPlot {
    @Override
    public void draw(Graphics g) {
        for (int i = 0; i < values.size(); i++) {
            g.setColor(Color.BLACK);
            g.fillRect(i * 25 - 5, 250 - values.get(i) - 5, 10, 10);
        }
        super.draw(g);
    }
}
