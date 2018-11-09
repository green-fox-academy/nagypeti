package com.week02.day03.linePlay;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.CountDownLatch;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class linePlay_4_16_64 {

  public static void mainDraw(Graphics g){

    int divider = 16;
    curveFromLines(g, divider);

  }

  public static void curveFromLines (Graphics g, int divider){
    int countDiv = divider / 2;
    int stepBasic = 10;
    int step = stepBasic / countDiv;
    int incrementY = 0;
    int incrementY2 = (HEIGHT/countDiv);

    for (int i = 0; i < countDiv; i++) {
      int incrementX = WIDTH/ countDiv;
      int y1 = incrementY;
      for (int j = 0; j < countDiv; j++) {
        int x1 = incrementX;
        int x2 = incrementX;
        int y2 = incrementY2;
        for (int k = 0; k < WIDTH/stepBasic; k++) {
          g.setColor(Color.MAGENTA);
          g.drawLine(x1,y1,x2,y2);
          x1 -= step;
          y2 -= step;
        }
        incrementX += WIDTH/countDiv;
      }
      incrementY += HEIGHT/countDiv;
      incrementY2 += HEIGHT/countDiv;
    }
  }

  static int WIDTH = 800;
  static int HEIGHT = 800;

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
