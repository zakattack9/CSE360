/**
 * Zak Sakata
 * CSE360 Assignment 3
 * This file includes driver code to run and initialize the program
 * World sets up the Swing GUI and holds all created graphs and buttons
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class World extends JFrame implements ActionListener {
    Source source;

    /* World constructor */
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

        JButton addBtn = new JButton("Run");
        addBtn.addActionListener(this);

        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        setLayout(gridBagLayout);

        simplePlotPanel.setBackground(Color.LIGHT_GRAY);
        barPlotPanel.setBackground(Color.WHITE);

        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        barPlotPanel.setPreferredSize(new Dimension(500, 250));
        add(barPlotPanel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        markedPlotPanel.setPreferredSize(new Dimension(500, 250));
        add(markedPlotPanel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        simplePlotPanel.setPreferredSize(new Dimension(500, 250));
        add(simplePlotPanel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        addBtn.setPreferredSize(new Dimension(500, 60));
        addBtn.setFont(new Font("Arial", Font.PLAIN, 35));
        add(addBtn, gridBagConstraints);
    }

    /**
     * Creates a new value in the Observable when triggered by an attached action
     *
     * @param event of the action that occurred
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        this.source.create();
    }

    public static void main(String[] args) {
        World world = new World();
        world.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        world.setSize(500,832);
        world.setVisible(true);
    }
}
