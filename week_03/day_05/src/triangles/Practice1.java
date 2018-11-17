package triangles;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Practice1 {

  public static void mainDraw(Graphics graphics){

    drawRect(graphics,0,0 , WIDTH, HEIGHT);
    drawRect(graphics,WIDTH/2, HEIGHT/2, WIDTH,HEIGHT);
    drawRect(graphics,WIDTH/2, 0, WIDTH,HEIGHT);
    drawRect(graphics,0, HEIGHT/2, WIDTH, HEIGHT);

  }

  public static void drawRect(Graphics g, int x, int y, int width, int height) {

   if (width > 8) {
     g.setColor(Color.BLUE);
     g.drawRect(x  + width/ 4,y + height/ 4 ,width / 4,height/ 4);
     drawRect(g, x , y, width/4, height/4);





    }
  }


  // Don't touch the code below
  static int WIDTH = 400;
  static int HEIGHT = 400;

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

