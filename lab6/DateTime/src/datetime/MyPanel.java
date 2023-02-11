/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datetime;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author gt
 */
public class MyPanel extends JPanel {

    public MyPanel() {
        this.setBackground(Color.CYAN);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(new Date().toLocaleString(), 50, 50);
    }
}
