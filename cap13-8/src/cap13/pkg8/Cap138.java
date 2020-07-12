/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap13.pkg8;

import com.sun.xml.internal.ws.api.pipe.Fiber;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author wuser
 */
public class Cap138 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.add(new Figuras2D());
        marco.setSize(425,200);
        marco.setVisible(true);
    }
    
}

class Figuras2D extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);  
        
        Graphics2D g2d = (Graphics2D) g;
        //Dibuja una elipse en 2D, rellena con gradiente color azul-amarillo
        g2d.setPaint(new GradientPaint(5,30,Color.blue,35,100,Color.YELLOW,true));
        g2d.fill( new Ellipse2D.Double(5,30,65,100));
        
        //dibuja rectangulo en 2D de color rojo
        g2d.setPaint(Color.red);
        g2d.setStroke(new BasicStroke(10.0f));
        g2d.draw(new Rectangle2D.Double(80,30,65,100));
        
        //dibuja rectangulo delimitador en 2D, con fondo con bufer
        BufferedImage imageBuf = new BufferedImage(10,10,BufferedImage .TYPE_INT_RGB);
        
        Graphics2D gg = imageBuf.createGraphics();
        
        gg.setColor(Color.YELLOW);
        gg.fillRect(0,0,10,10);
        gg.setColor(Color.black);
        gg.drawRect(1,1,6,6);
        gg.setColor(Color.blue);
        gg.fillRect(1,1,3,3);
        gg.setColor(Color.red);
        gg.fillRect(4,4,3,3);//dibuna un rectangulo relleno
        
        //pinta a imagenBuf en el objeto JFrame
        g2d.setPaint(new TexturePaint(imageBuf,new Rectangle(10,10)));
        g2d.fill(new RoundRectangle2D.Double(155,30,75,100,50,50));
        
        //dibuja arco en forma de pastel en 2D, de color blanco
        g2d.setPaint(Color.white);
        g2d.setStroke(new BasicStroke(6.0f));
        g2d.draw(new Arc2D.Double(240,30,75,100,0,270,Arc2D.PIE));
        
        //dibuja lineas 2D en verde y amarillo
        g2d.setPaint(Color.GREEN);
        g2d.draw(new Line2D.Double(395,30,320,150));
        
        //dibuja lineas 2D en verde y amarillo
        float[] guiones = {10};
        g2d.setPaint(Color.YELLOW);
        g2d.setStroke(new BasicStroke(4,BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND,10,guiones,0));
        g2d.draw(new Line2D.Double(320,30,395,150));
    }
}

