package triangles;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Practice {


    public static void mainDraw(Graphics graphics){

      drawCircle(graphics,0, 0, WIDTH);
      drawCircle(graphics,0, 0, WIDTH);
      drawCircle(graphics,0, 0, WIDTH);

    }

    public static void drawCircle(Graphics g, int x, int y, int size) {

      if (size < 3) {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, size, size);
      }

      if (size > 30) {
        g.drawOval(x, y, size, size);
        g.setColor(Color.BLUE);
        drawCircle(g, x + size /4, y, size / 2);
//        g.setColor(Color.GREEN);
//        drawCircle(g, x + size, y + size, size / 2);
//        g.setColor(Color.BLACK);
//        drawCircle(g, x + size, y - size, size / 2);
//        g.setColor(Color.RED);
//        drawCircle(g, x - size, y + size, size / 2);
      }
    }

    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

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

