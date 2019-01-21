package com.week02.day03.workshop;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class fourRectanglesHourGlass {

    public static void mainDraw(Graphics graphics){
        for (int i = 0; i < 4; i++) {
            drawRectangle(graphics);
        }
    }

    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void drawRectangle (Graphics graphics){
        int xStartPos = 1 + (int)(Math.random() * 280);
        int xNextPos = 1 + (int)(Math.random() * 50);
        int [] xPosition = {xStartPos, xStartPos + xNextPos, xStartPos, xStartPos + xNextPos};
        int yStartPos = 1 + (int)(Math.random() * 280);
        int yNextPos = 1 + (int)(Math.random() * 50);
        int [] yPosition = {yStartPos, yStartPos, yStartPos + yNextPos, yStartPos + yNextPos};
        graphics.setColor(new Color(1 + (int)(Math.random() * 256),1 + (int)(Math.random() * 256), 1 + (int)(Math.random() * 256)));
        graphics.fillPolygon(xPosition,yPosition,4);
    }

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