package com.week02.day03.linePlay;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class envelopeStarSecondTry {

  public static void mainDraw(Graphics g){
    int step = 10;
    star(g, step);
  }

  public static void star (Graphics g, int stepSize){
    for (int i = 0; i <= HEIGHT/2; i += stepSize) {
      g.setColor(new Color(randomRgbColor(), randomRgbColor(), randomRgbColor()));
      g.drawLine(WIDTH/2,      i ,            (WIDTH/2) - i, HEIGHT/2);
      g.drawLine(WIDTH/2,  (HEIGHT/2) + i,    i,             HEIGHT/2);
      g.drawLine(WIDTH/2,  (HEIGHT/2) + i, WIDTH - i,    HEIGHT/2);
      g.drawLine(WIDTH/2,      i,             (WIDTH/2) + i, HEIGHT/2);
    }
  }

  public static int randomRgbColor () {
    int randomColor = 1 + (int) (Math.random() * 255);
    return randomColor;
  }

  static int WIDTH = 640;
  static int HEIGHT = 640;

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