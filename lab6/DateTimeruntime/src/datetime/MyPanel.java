/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datetime;

import java.awt.Color;
import java.awt.Graphics;
import java.lang.System.Logger.Level;
import java.util.Date;
import javax.swing.JPanel;
 import java.util.logging.Logger;

/**
 *
 * @author gt
 */
public class MyPanel extends JPanel implements Runnable {

    public MyPanel() {
        this.setBackground(Color.CYAN);
       Thread th = new Thread(this);
       th.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(new Date().toLocaleString(), 50, 50);
    }
    @Override
    public void run(){
        while(true){
            try {
                this.repaint();
                Thread.sleep(1000);
            }   catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
