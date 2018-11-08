package com.week02.day03.linePlay;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class envelopeStarFirstTry {

  public static void mainDraw(Graphics g){
    star(g);
  }

  public static void star (Graphics g){
    int step = 10;
    g.setColor(Color.GREEN);
    //  Left-upper corner
    int x1 = WIDTH/2;
    int y1 = 0;
    for (int i = 0; i <= HEIGHT/(step * 2); i++) {
      g.drawLine(WIDTH/2,y1,x1,HEIGHT/2);
      y1 += step;
      x1 -= step;
    }
    //  Left-down corner
    int x2 = 0;
    int y2 = HEIGHT/2;
    for (int i = 0; i <= HEIGHT/(step * 2); i++) {
      g.drawLine(x2,HEIGHT/2,WIDTH/2,y2);
      y2 += step;
      x2 += step;
    }
    //  Right-down corner
    int x3 = WIDTH;
    int y3 = HEIGHT/2;
    for (int i = 0; i <= HEIGHT/(step * 2); i++) {
      g.drawLine(WIDTH/2,y3,x3,HEIGHT/2);
      y3 += step;
      x3 -= step;
    }
    // Right-upper corner
    int x4 = WIDTH/2;
    int y4 = 0;
    for (int i = 0; i <= HEIGHT/(step * 2); i++) {
      g.drawLine(WIDTH/2,y4,x4,HEIGHT/2);
      y4 += step;
      x4 += step;
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