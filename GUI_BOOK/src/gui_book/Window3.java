package gui_book;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window3 extends JFrame{
    JButton miBoton;
    JLabel saludo;
    public Window3(){
        setSize(400,400);
        InitComponents();
    }
    public void InitComponents(){
        miBoton = new JButton();
        saludo = new JLabel();
        miBoton.setText("Aplastame");
        miBoton.setToolTipText("Haz click aqui");
        miBoton.setMnemonic('a');
        getContentPane().setLayout(null);
        getContentPane().add(miBoton);
        miBoton.setBounds(100,100,200,200);
        getContentPane().add(saludo);
        saludo.setBounds(100,10,100,100);
        miBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                respuestaBoton(evt);
            }
        });
        
        addWindowListener(new WindowAdapter(){
           @Override
            public void windowClosing(WindowEvent evt){
               System.exit(0);
           } 
        });
    }
    
    public void respuestaBoton(ActionEvent evt){
        float rojo = (float)Math.random();
        float verde =(float)Math.random();
        float azul =(float)Math.random();
        saludo.setForeground(new Color(rojo,verde,azul));
        saludo.setText("HOLA");
        saludo.setFont(new Font("Arial",1,18));
    }
}