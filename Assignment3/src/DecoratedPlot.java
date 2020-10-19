import java.awt.*;

public abstract class DecoratedPlot extends Drawable {
    protected Drawable drawable;

    public void add(Drawable d) {
        drawable = d;
    }

    @Override
    public void setValue(int v) {
        drawable.setValue(v);
    }

    @Override
    public void draw(Graphics g) {
        drawable.draw(g);
    }
}
