/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datetime;

import javax.swing.JFrame;

/**
 *
 * @author gt
 */
public class DateTimeLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame jf = new JFrame();
        jf.setTitle("date and time");
        MyPanel m1 = new MyPanel();
        jf.setContentPane(m1);
        jf.setSize(400, 400);
        jf.setVisible(true);
    }
    
}
