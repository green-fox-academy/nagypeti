package com.week02.day03.workshop;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class connectTheDots {

    public static void mainDraw(Graphics graphics) {
        int [][] boxCoordinates = { {10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int [][] shapeCoordinates = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        drawLine(graphics, boxCoordinates);
        drawLine(graphics, shapeCoordinates);
    }

    public static void drawLine (Graphics graphics, int [][] coordinates){
        graphics.setColor(Color.GREEN);
        for(int i = 0; i < coordinates.length - 1; i++) {
            graphics.drawLine(coordinates[i][0], coordinates[i][1], coordinates[i+1][0], coordinates[i+1][1]);
        }
    }

    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
