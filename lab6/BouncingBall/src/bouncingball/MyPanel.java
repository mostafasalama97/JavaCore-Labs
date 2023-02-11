/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bouncingball;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Date;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements Runnable {

    public int x = 0;
    public int radius  = 10;
    public int y = 0;
    public int dx = 3;
    public int dy = 3;
    public double width = getWidth();
    public double height = getHeight();

    public MyPanel() {
        this.setBackground(Color.CYAN);
        Thread th = new Thread(this);
        th.start();
        x = 50;
        y = 100;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GRAY);
        g.fillOval((int)(x-radius), (int)(y-radius), 20, 20);
    }

    @Override
    public void run() {
        while (true) {
            width = getWidth();
            height = getHeight();
            x = x + dx;
            y = y + dy;
            
            if (x - radius < 0) {
                dx = -dx;
                x = radius;
            } else if (x + radius > width) {
                dx = -dx;
                x = (int) width - radius;
            }

            if (y - radius < 0) {
                dy = -dy;
                y = radius;
            } else if (y + radius > height) {
                dy = -dy;
                y = (int) height - radius;
            }
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }
}
