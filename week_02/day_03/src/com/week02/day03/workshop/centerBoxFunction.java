package com.week02.day03.workshop;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class centerBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

        for (int i = 0; i < 3; i++) {
            drawSquare(graphics,1 + (int)(Math.random() * 100));
        }
    }

    public static void drawSquare (Graphics graphics, int size){

        graphics.setColor(new Color(1 + (int)(Math.random() * 256),1 + (int)(Math.random() * 256), 1 + (int)(Math.random() * 256)));
        graphics.drawRect((WIDTH - size) / 2, (HEIGHT - size) / 2, size, size);

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