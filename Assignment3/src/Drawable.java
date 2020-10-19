import java.awt.*;
import java.util.LinkedList;

public abstract class Drawable {
    protected LinkedList<Integer> values = new LinkedList<Integer>();

    public void setValue(int v) {
        if (values.size() == 20) values.removeFirst();
        values.add(v);
        System.out.println("VALUE: " + v);
    }

    public void draw(Graphics g) {}
}
