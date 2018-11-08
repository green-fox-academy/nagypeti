package com.week02.day03.linePlay;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class linePlay {

  public static void mainDraw(Graphics g){
    curveFromLines(g);
  }

  public static void curveFromLines (Graphics g){
    int step = 10;
    int constantX = 0;
    int constantY = HEIGHT;
    int incrementingXy= 0;
    for (int i = 1; i < HEIGHT/step; i++) {
      g.setColor(Color.GREEN);
      g.drawLine(constantX,incrementingXy,incrementingXy,constantY);
      incrementingXy += step;
    }
    for (int i = WIDTH; i > 0; i--) {
      constantX = WIDTH;
      constantY = 0;
      g.setColor(Color.MAGENTA);
      g.drawLine(incrementingXy,constantY,constantX,incrementingXy);
      incrementingXy -= step;
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
