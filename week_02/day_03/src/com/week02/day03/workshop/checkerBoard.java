package com.week02.day03.workshop;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class checkerBoard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int startPosX = 0;
        int startSize = 30;
        int stepSize = startSize;

        for (int i = 0; i < 10 ; i++) {
            int startPosY2 = 0;
            for (int j = 0; j < 10; j++){
                if (i % 2 == 0) {
                    if (j % 2 != 0) {
                        graphics.setColor(Color.BLACK);
                        graphics.fillRect(startPosX, startPosY2, startSize, startSize);
                    } else {
                        graphics.setColor(Color.WHITE);
                        graphics.fillRect(startPosX, startPosY2, startSize, startSize);
                    }
                } else {
                    if (j % 2 == 0) {
                        graphics.setColor(Color.BLACK);
                        graphics.fillRect(startPosX, startPosY2, startSize, startSize);
                    } else {
                        graphics.setColor(Color.WHITE);
                        graphics.fillRect(startPosX, startPosY2, startSize, startSize);
                    }
                }
                startPosY2 += stepSize;
            }
            startPosX += stepSize;
        }
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