package com.week02.day03.workshop;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class horizontalLines {
    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < 3; i++) {
            drawFiftyPixelLine(graphics,1 + (int)(Math.random() * 321),1 + (int)(Math.random() * 321));
        }
    }

    public static void drawFiftyPixelLine (Graphics graphics, int xPosition, int yPosition) {
        if (xPosition >= 270) {
            graphics.drawLine(xPosition, yPosition, xPosition - 50, yPosition);
        } else {
            graphics.drawLine(xPosition, yPosition, xPosition + 50, yPosition);
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