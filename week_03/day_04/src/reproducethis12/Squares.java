package reproducethis12;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {

  public static void mainDraw(Graphics graphics){

    drawCircle(graphics,0, 0, WIDTH/2);
    drawCircle(graphics,WIDTH/2, HEIGHT/2, WIDTH/2);

  }

  public static void drawCircle(Graphics g, int x, int y, int size) {

//    g.drawOval(x,y,size,size);
//
//    if (size > 10) {
//      drawCircle(g, x +size , y-size, size / 2);
//      drawCircle(g, x -size , y-size, size / 2);
//      drawCircle(g, x -size , y+size, size / 2);
//      drawCircle(g, x +size , y+size, size / 2);
//
//    }
//
    g.drawRect(x,y,size,size);

    if (size > 20) {
        drawCircle(g, x +size , y-size, size / 2);
        drawCircle(g, x -size , y-size, size / 2);
        drawCircle(g, x -size , y+size, size / 2);
        drawCircle(g, x +size , y+size, size / 2);
    }


  }

  // Don't touch the code below
  static int WIDTH = 500;
  static int HEIGHT = 500;

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
