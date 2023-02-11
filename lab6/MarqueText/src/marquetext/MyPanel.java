
package marquetext;


import java.awt.Color;
import java.awt.Graphics;
import java.util.Date;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements Runnable {
    public int x = 0;
    
    public MyPanel() {
        this.setBackground(Color.CYAN);
       Thread th = new Thread(this);
       th.start();
       x=50;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(x>=this.getWidth()) x=0;
        g.drawString("mostafa", x, 50);
    }
    @Override
    public void run(){
        while(true){
            try {
                this.repaint();
                Thread.sleep(500);
                x+=20;
            }   catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
