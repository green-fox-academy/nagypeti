package com.week02.day03.workshop;

import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class starryNight {

    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0,WIDTH,HEIGHT);

        int size = 5;
        for (int i = 0; i < 60; i++) {
            starryNightGenerator(graphics, size);
        }
    }

     public static void starryNightGenerator (Graphics graphics, int size) {
         int color = 1 + (int) (Math.random() * 255);
        graphics.setColor(new Color(color, color, color));
        graphics.fillRect(1 + (int) (Math.random() * WIDTH), 1 + (int) (Math.random() * HEIGHT), size, size);
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