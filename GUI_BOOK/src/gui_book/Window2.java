package gui_book;
//Ventana con BorderLayout
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window2 extends JFrame{
    public Window2(){
        setSize(300,200);
        setTitle("SEGUNDA VENTANA");
        cargarBotones();
    }
    
    public void cargarBotones(){
        //Establecemos el layout que queramos
        //No queremos ninguno para movernos libremente
        getContentPane().setLayout(new BorderLayout());
        //boton
        JButton miBoton = new JButton();
        miBoton.setText("boton");
        miBoton.setMnemonic('a');
        //añadimos el manejador al boton1 
        miBoton.addActionListener(new manejadorBoton1());
        
        JButton miBoton2 = new JButton();
        miBoton2.setText("DO");
        miBoton2.setMnemonic('s');
        //Otra forma de añadir un manejador seria 
        ActionListener miManejador2= new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                JOptionPane.showMessageDialog(null,"MENSAJE 2");
            }
        };
        miBoton2.addActionListener(miManejador2);
        
        JButton miBoton3 = new JButton();
        miBoton3.setText("boton");
        miBoton3.setMnemonic('k');
        miBoton3.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent evt){
                   JOptionPane.showMessageDialog(null,"MENSAJE 3");
               }
        });
        getContentPane().add(miBoton3,BorderLayout.WEST);
        getContentPane().add(miBoton,BorderLayout.NORTH);
        getContentPane().add(miBoton2,BorderLayout.CENTER);
        
    }
    
}
