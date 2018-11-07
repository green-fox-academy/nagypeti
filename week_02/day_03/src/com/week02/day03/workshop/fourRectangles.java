package com.week02.day03.workshop;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class fourRectangles {

    public static void mainDraw(Graphics graphics){
        for (int i = 0; i < 4; i++) {
            drawRectangle(graphics);
        }
    }

    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void drawRectangle (Graphics graphics){
        int xStartPos = 1 + (int)(Math.random() * 100);
        int yStartPos = 1 + (int)(Math.random() * 100);
        int width = 1 + (int)(Math.random() * 100);
        int length = 1 + (int)(Math.random() * 100);
        graphics.setColor(new Color(1 + (int)(Math.random() * 256),1 + (int)(Math.random() * 256), 1 + (int)(Math.random() * 256)));
        graphics.fillRect(xStartPos,yStartPos,width,length);
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