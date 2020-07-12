/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap13.pkg3;

import java.util.Locale;
import javax.swing.JFrame;

/**
 *
 * @author wuser
 */
public class Cap133 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FontPanel panel = new FontPanel();
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,180);
    }
    
}
