/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap13.pkg6;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author wuser
 */
public class Cap136 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame marco = new JFrame("arcos");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        marco.add(new Arc());
        marco.setSize(300,210);
        marco.setVisible(true);
    }
    
}
class Arc extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.RED);
        g.drawRect(15, 35, 80, 80);
        g.setColor(Color.black);
        g.drawArc(15, 35, 80, 80, 0, 360);
        
        g.setColor(Color.RED);
        g.drawRect(100, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(100, 35, 80, 80, 0, 110);
        
        g.setColor(Color.RED);
        g.drawRect(185, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(185, 35, 80, 80, 0, -270);
        
        g.fillArc(15, 120, 80, 40, 0, 360);
        
        g.fillArc(100, 120, 80, 40, 270, -90);
        
        g.fillArc(185,120,80,40,0,-270);
        
    }
}