import java.awt.*;

public class SimplePlot extends Drawable {
    @Override
    public void draw(Graphics g) {
        int oldValue = 0;
        for (int i = 0; i < values.size(); i++) {
            g.drawLine((i - 1) * 25, 250 - oldValue, i * 25, 250 - values.get(i));
            oldValue = values.get(i);
        }
    }
}
