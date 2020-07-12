/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap13.pkg3;

import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author wuser
 */
public class FontPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);    
        g.setFont(new Font("Serif",Font.BOLD,12));
        g.drawString("Serif 12 puntos bold",20,50);
        
        g.setFont(new Font("Monospaced",Font.BOLD,12));
        g.drawString("Serif 12 puntos bold",20,70);
        
        g.setFont(new Font("SandsSerif",Font.BOLD,12));
        g.drawString("Serif 12 puntos bold",20,90);
        
        g.setFont(new Font("Serif",Font.BOLD +  Font.ITALIC,12));
        g.drawString("Serif 12 puntos bold",20,110);
    }
}
