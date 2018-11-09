package com.week02.day03.linePlay;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.CountDownLatch;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class linePlay_4_16_64 {

  public static void mainDraw(Graphics g){
    int divider = 4;
    curveFromLines(g, divider);
  }

  public static void curveFromLines (Graphics g, int divider){

    int countDiv = divider / 2;
    int stepBasic = 20;
    int step = stepBasic / countDiv;
    int incrementY = 0;
    int incrementY2 = (HEIGHT/countDiv);

    for (int i = 0; i < countDiv; i++) {
      int incrementX = WIDTH/countDiv;
      int y1 = incrementY;
      for (int j = 0; j < countDiv; j++) {
        int x1 = incrementX;
        int x2 = incrementX;
        int y2 = incrementY2;
        for (int k = 0; k < WIDTH/countDiv; k += step) {
          g.setColor(Color.MAGENTA);
          g.drawLine(x1 - k,y1,x2,y2 - k);
        }
        incrementX += WIDTH/countDiv;
      }
      incrementY += HEIGHT/countDiv;
      incrementY2 += HEIGHT/countDiv;
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
