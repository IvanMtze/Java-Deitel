/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap13.pkg9;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author wuser
 */
public class Cap139 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.add(new Estrella());
        marco.setSize(400,400);
        marco.setVisible(true);
    }    
}
class Estrella extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        SecureRandom aleatorio = new SecureRandom();
        
        int[] puntosX = {55,67,109,73,83,55,27,37,1,43};
        int[] puntosY = {0,36,36,54,96,72,96,54,36,36};
        
        Graphics2D g2d = (Graphics2D)g;
        GeneralPath estrella = new GeneralPath();
        
        estrella.moveTo(puntosX[0], puntosY[0]);
        for(int i = 1; i < puntosX.length; i++)
            estrella.lineTo(puntosX[i], puntosY[i]);
        
        estrella.closePath();
        g2d.translate(200, 200);
        
        for(int i = 1; i <= 20; i++){
            g2d.rotate(Math.PI/10.0);
            g2d.setColor(new Color(aleatorio.nextInt(256),aleatorio.nextInt(256),aleatorio.nextInt(256)));
            g2d.fill(estrella);
        }
    }
}


