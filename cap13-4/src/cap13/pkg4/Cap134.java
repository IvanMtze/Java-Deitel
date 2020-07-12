/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap13.pkg4;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.PopupMenu;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author wuser
 */
public class Cap134 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Metrica met = new Metrica();
        frame.add(met);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
    }
    
}

class Metrica extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setFont(new Font("SansSerif",Font.BOLD,12));
        FontMetrics metrics = g.getFontMetrics();
        
        g.drawString("HOLA "+ g.getFont(),10,40);
        g.drawString("Ascendente: " + metrics.getAscent(), 10, 55);
    }
}