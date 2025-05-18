package com.example.graph;

import javax.swing.*;
import java.awt.*;

public class GraphVisualizer extends JFrame {

    public GraphVisualizer() {
        setTitle("Dijkstra Visualizer");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        GraphPanel graphPanel = new GraphPanel();
        add(graphPanel, BorderLayout.CENTER);

        JButton runButton = new JButton("Run Dijkstra");
        add(runButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GraphVisualizer::new);
    }
}