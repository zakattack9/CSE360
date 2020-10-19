import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class World extends JFrame implements ActionListener {
    Source source;

    public World() {
        SimplePlot simplePlot = new SimplePlot();
        MarkedPlot markedPlot = new MarkedPlot();
        BarPlot barPlot = new BarPlot();

        markedPlot.add(simplePlot);
        barPlot.add(markedPlot);

        PlotPanel simplePlotPanel = new PlotPanel(simplePlot);
        PlotPanel markedPlotPanel = new PlotPanel(markedPlot);
        PlotPanel barPlotPanel = new PlotPanel(barPlot);

        this.source = new Source();
        this.source.addObserver(simplePlotPanel);
        this.source.addObserver(markedPlotPanel);
        this.source.addObserver(barPlotPanel);

        setLayout(new GridLayout(4, 1));
        add(simplePlotPanel);
        add(markedPlotPanel);
        add(barPlotPanel);

        JButton addBtn = new JButton("Add Point");
        addBtn.addActionListener(this);
        add(addBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.source.create();
    }

    public static void main(String[] args) {
        World world = new World();
        world.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        world.setSize(500,1000);
        world.setVisible(true);
    }
}
