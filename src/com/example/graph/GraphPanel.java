package com.example.graph;

import javax.swing.*;
import java.awt.*;

public class GraphPanel extends JPanel {

    public GraphPanel() {
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.drawLine(100, 100, 200, 200);
        g.fillOval(95, 95, 10, 10);
        g.fillOval(195, 195, 10, 10);
    }
}