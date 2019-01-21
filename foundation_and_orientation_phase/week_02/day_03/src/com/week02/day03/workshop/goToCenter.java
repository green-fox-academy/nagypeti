package com.week02.day03.workshop;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class goToCenter {

    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < 3; i++) {
            drawLineToCenter(graphics,1 + (int)(Math.random() * 321),1 + (int)(Math.random() * 321));
        }
    }

    public static void drawLineToCenter(Graphics graphics, int xPosition, int yPosition){
        graphics.setColor(Color.BLUE);
        graphics.drawLine(xPosition,yPosition,WIDTH/2,HEIGHT/2);
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