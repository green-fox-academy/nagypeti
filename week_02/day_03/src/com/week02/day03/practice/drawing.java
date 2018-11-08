package com.week02.day03.practice;

import java.awt.*;

import javax.swing.*;

public class drawing extends JPanel {

    public void paintComponent (Graphics graphics){

        super.paintComponent(graphics);
        this.setBackground(Color.WHITE);

        graphics.setColor(Color.BLUE);
        graphics.fillRect(25, 25,100,30);

        graphics.setColor(new Color(190, 81, 215));
        graphics.fillRect(25,65,100,30);

        graphics.setColor(Color.RED);
        graphics.drawString("This is some MiGHTy TeXT!",25, 120);

        int [] xPoints = {10, 110, 110, 10};
        int [] yPoints = {10, 10, 110, 110};
        graphics.drawPolygon(xPoints, yPoints, 4);   // Draw a polygon (with 'n' number edge points),
                                                            // Always going to be a closed object

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("This is the title! :)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawing draw = new drawing();
        frame.add(draw);
        frame.setSize(400,250);
        frame.setVisible(true);

    }
}

//  Immediate mode vs. Retained mode
//      - immediate:
//      - retained:

