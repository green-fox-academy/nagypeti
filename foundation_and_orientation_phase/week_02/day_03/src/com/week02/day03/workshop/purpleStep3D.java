package com.week02.day03.workshop;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class purpleStep3D {

    public static void mainDraw(Graphics graphics) {
        int startPos = 10;
        int startSize = 10;
        for (int i = 0; i < 10; i++) {
            drawPurpleSquare(graphics, startPos,startSize);
            startPos += startSize;
            startSize += startSize / 2;
        }
    }

    public static void drawPurpleSquare (Graphics graphics, int xyPos, int size){
        graphics.setColor(new Color(176, 78, 240));
        graphics.fillRect(xyPos,xyPos,size,size);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(xyPos,xyPos,size,size);
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