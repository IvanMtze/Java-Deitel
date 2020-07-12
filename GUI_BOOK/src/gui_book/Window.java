
package gui_book;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Window extends JFrame{
    
    JLabel miEtiqueta;
    JButton miBoton;
    
    public Window(){
    setSize(300,200);
    setTitle("Aplication");
    initComponents();
    }
    
    public void initComponents(){
        getContentPane().setLayout(null);
        //JLabel
        this.miEtiqueta = new JLabel();
        miEtiqueta.setText("fas");
        miEtiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        miEtiqueta.setFont(new Font("Dialog",1,18));
        getContentPane().add(miEtiqueta);
        miEtiqueta.setBounds(42, 36, 200, 30);
        //Button
        miBoton = new JButton();
        miBoton.setText("Boton");
        miBoton.setToolTipText("Esto es un boton");
        miBoton.setMnemonic('c');
        getContentPane().add(miBoton);
        miBoton.setBounds(42,90,100,100);
        /**
         * EL boton necesita un actionListener para poder funcionar con eventos
         * para eso se usa el metodo addActionListener al cual le pasamos como parametro
         * un objeto action listener
         */
        //Eventos
        addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent evt){
               exitForm(evt);
           } 
           public void windowOpened(WindowEvent evt){
               JOptionPane.showMessageDialog(null,"Abierto");
           }
        });
        //
    }
    private void exitForm(WindowEvent evt){
        System.exit(0);
    }
}
