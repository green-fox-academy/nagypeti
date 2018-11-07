package com.week02.day03.workshop;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class rainbowBoxFunction {

    public static void mainDraw(Graphics graphics) {
        int maxSize = 320;
        for (int i = maxSize; i > 0; i--) {
            int ranColor = 1 + (int) (Math.random() * 255);
            drawSquare(graphics, maxSize, ranColor);
            maxSize -= 5;
        }
    }

    public static void drawSquare (Graphics graphics, int size, int color) {
        graphics.setColor(new Color(color, 1 + (int) (Math.random() * 255), 1 + (int) (Math.random() * 255)));
        graphics.fillRect((WIDTH - size) / 2, (HEIGHT - size) / 2, size, size);
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