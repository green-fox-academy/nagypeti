package com.week02.day03.workshop;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class functionToCenter {

    public static void mainDraw(Graphics graphics) {
        int stepSize = 20;
        for (int i = 0; i <= WIDTH; i += stepSize) {
            for (int j = 0; j <= HEIGHT; j += stepSize) {
                drawLinetoCenter(graphics, i, 0);
                drawLinetoCenter(graphics, 0, j);
                drawLinetoCenter(graphics, WIDTH, j);
                drawLinetoCenter(graphics, i, HEIGHT);
            }
        }
    }

    public static void drawLinetoCenter (Graphics graphics, int xPos, int yPos){
        graphics.setColor(Color.BLUE);
        graphics.drawLine(xPos,yPos,WIDTH/2,HEIGHT/2);
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