import java.awt.*;

public class BarPlot extends DecoratedPlot {
    @Override
    public void draw(Graphics g) {
        for (int i = 0; i < values.size(); i++) {
            g.setColor(Color.GRAY);
            g.fillRect(i * 25 - 5, 250 - values.get(i), 10, values.get(i));
        }
        super.draw(g);
    }
}
