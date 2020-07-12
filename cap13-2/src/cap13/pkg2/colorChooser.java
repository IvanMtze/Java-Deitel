/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap13.pkg2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author wuser
 */
public class colorChooser extends JFrame{
    private final JButton cambiarBoton;
    private Color color = Color.LIGHT_GRAY;
    private final JPanel colorPanel;
    
    public colorChooser(){
        super();
        colorPanel = new JPanel();
        colorPanel.setBackground(color);
        cambiarBoton = new JButton("Cambia color");
        cambiarBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                color = JColorChooser.showDialog(colorChooser.this, "selecciona color", color);
                if(color == null)
                      color = Color.LIGHT_GRAY;
                colorPanel.setBackground(color);
            }
        });
        
        add(colorPanel,BorderLayout.CENTER);
        add(cambiarBoton,BorderLayout.SOUTH);
        setSize(400,130);
        setVisible(true);
    }
    
}