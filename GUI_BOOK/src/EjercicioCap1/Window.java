package EjercicioCap1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame{
    JLabel miEtiqueta = new JLabel();
    JButton miBoton = new JButton();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    
    public Window(){
        InitComponents();
        InitPanels();
        this.setTitle("Saludo");
        this.setSize(400,400); 
        setLayout(new GridLayout(2,1,100,100));
        add(panel1);
        add(panel2);
    }
    
    public void InitComponents(){
        //Etiqueta
        miEtiqueta.setText("HOLAA!");
        miEtiqueta.setVisible(false);
        miEtiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        //Escucha de boton
        miBoton.addActionListener(new ActionListener(){
               @Override
                public void actionPerformed(ActionEvent evt){
                   miEtiqueta.setVisible(true);
               }
        });
        
        addWindowListener(new WindowAdapter(){
               @Override
               public void windowClosing(WindowEvent evt){
                   System.exit(0);
               }
        });
    }

    public void InitPanels(){
        panel1.setLayout(new GridLayout(1,1));
        panel1.add(miEtiqueta);
        panel2.setLayout(new GridLayout(1,1));
        panel2.add(miBoton);
        miBoton.setBounds(40,40,40,40);
        panel2.setSize(100,100);
    }
    
}
