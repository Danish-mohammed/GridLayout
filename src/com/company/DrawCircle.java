package com.company;


import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class DrawCircle extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new DrawCircle();
        canvas.setSize(600, 600);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawOval(120, 10, 100, 100);
        g.fillOval(10, 10, 100, 100);
        g.drawLine(300, 200, 200, 200);
        g.drawArc(240,10,100,100,0,180);
        g.drawArc(360,10,100,100,180,180);
    }
}