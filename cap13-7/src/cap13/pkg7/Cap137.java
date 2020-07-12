/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap13.pkg7;

import java.awt.Graphics;
import java.awt.Polygon;
import javafx.scene.shape.Polyline;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author wuser
 */
public class Cap137 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.add(new Poligonos());
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        marco.setSize(280,270);
    }
    
}
class Poligonos extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int[] valoresX = {20,40,50,30,20,15};
        int[] valoresY = {50,50,60,80,80,60};
        Polygon poligono1 = new Polygon(valoresX,valoresY,6);
        g.drawPolygon(poligono1);
        
        int[] valoresX2 = {70,90,100,80,70,65,60};
        int[] valoresY2 = {100,100,110,110,130,110,90};
        g.drawPolyline(valoresX2,valoresY2,7);
        
        int[] valoresX3 = {120,140,150,190};
        int[] valoresY3 = {40,70,80,60};
        g.fillPolygon(valoresX3,valoresY3,4);
        
    }
}