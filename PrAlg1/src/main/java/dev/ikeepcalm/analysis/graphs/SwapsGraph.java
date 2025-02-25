package dev.ikeepcalm.analysis.graphs;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

public class SwapsGraph extends BaseGraph {

    @Override
    public JFreeChart createChart(XYSeriesCollection dataset) {
        return ChartFactory.createXYLineChart(
                "Sorting Algorithm " + "Swaps",
                "Array Size",
                "Swaps",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
    }

}
