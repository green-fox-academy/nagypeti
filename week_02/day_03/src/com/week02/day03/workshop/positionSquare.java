package com.week02.day03.workshop;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class positionSquare {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.

        for (int i = 0; i < 3; i++) {
            drawSquare(graphics, 1 + (int)(Math.random() * 271),1 + (int)(Math.random() * 271));
        }
    }

    public static void drawSquare (Graphics graphics, int xPos, int yPos) {

        int [] xPositions = {xPos, xPos + 50, xPos + 50, xPos};
        int [] yPositions = {yPos, yPos, yPos + 50, yPos + 50};

        graphics.drawPolygon(xPositions,yPositions,4);

    }

    // Don't touch the code below
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