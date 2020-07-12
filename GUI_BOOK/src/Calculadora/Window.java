package Calculadora;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.*;

public class Window extends JFrame{
    private JButton dig0;
    private JButton dig1;
    private JButton dig2;
    private JButton dig3;
    private JButton dig4;
    private JButton digCinco;
    private JButton dig6;
    private JButton dig7;
    private JButton dig8;
    private JButton dig9;
    private JButton puntoDecimal;
    private JButton signoSuma;
    private JButton signoResta;
    private JButton tantoPorCiento;
    private JButton signoDivision;
    private JButton signoMultiplicacion;
    private JButton ceroTotal;
    private JButton ceroUltimaEntrada;
    
    private JTextField display;
    
    
    
    public Window(){
        setSize(222,222);
        setTitle("Calculadora");
        initComponents();
    }
    /**
     * Carga de componentes
     * Metodo : InitComponents()
     */
    private void initComponents(){
       //diseño y configuracion de ventana 
       getContentPane().setLayout(null);
       this.setResizable(false);
       //Escucha de ventana
       addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent evt){
               System.exit(0);
           }
       });
       
       
//Numeros
       dig0 = new JButton();
       dig0.setText("0");
       dig0.setMargin(new Insets(2,2,2,2));
       getContentPane().add(dig0);
       dig0.setBounds(8,164,68,28);
       
       dig1 = new JButton();
       dig1.setText("1");
       dig1.setMargin(new Insets(2,2,2,2));
       getContentPane().add(dig1);
       dig1.setBounds(8,124,28,28);
       
       dig2 = new JButton();
       dig2.setText("2");
       dig2.setMargin(new Insets(2,2,2,2));
       getContentPane().add(dig2);
       dig2.setBounds(48,124,28,28);
       
       dig3 = new JButton();
       dig3.setText("3");
       dig3.setMargin(new Insets(2,2,2,2));
       getContentPane().add(dig3);
       dig3.setBounds(88,124,28,28);
       
       dig4 = new JButton();
       dig4.setText("4");
       dig4.setMargin(new Insets(2,2,2,2));
       getContentPane().add(dig4);
       dig4.setBounds(8,84,28,28);
       
       digCinco = new JButton();
       digCinco.setText("0");
       digCinco.setMargin(new Insets(2,2,2,2));
       getContentPane().add(digCinco);
       digCinco.setBounds(48,84,28,28);
       
       dig6 = new JButton();
       dig6.setText("6");
       dig6.setMargin(new Insets(2,2,2,2));
       getContentPane().add(dig6);
       dig6.setBounds(88,84,28,28);
       
       dig7 = new JButton();
       dig7.setText("7");
       dig7.setMargin(new Insets(2,2,2,2));
       getContentPane().add(dig7);
       dig7.setBounds(8,44,28,28);
       
       dig8 = new JButton();
       dig8.setText("8");
       dig8.setMargin(new Insets(2,2,2,2));
       getContentPane().add(dig8);
       dig8.setBounds(48,44,28,28);
       
       dig9 = new JButton();
       dig9.setText("9");
       dig9.setMargin(new Insets(2,2,2,2));
       getContentPane().add(dig9);
       dig9.setBounds(88,44,28,28); 
       
       puntoDecimal = new JButton();
       puntoDecimal.setText(".");
       puntoDecimal.setMargin(new Insets(2,2,2,2));
       getContentPane().add(puntoDecimal);
       puntoDecimal.setBounds(88,164,28,28);
       
       //operaciones
       
       ceroTotal = new JButton();
       ceroTotal.setText("C");
       ceroTotal.setMargin(new Insets(2,2,2,2));
       getContentPane().add(ceroTotal);
       ceroTotal.setBounds(140,44,28,28);
       
       ceroUltimaEntrada = new JButton();
       ceroUltimaEntrada.setText("CE");
       ceroUltimaEntrada.setMargin(new Insets(2,2,2,2));
       getContentPane().add(ceroUltimaEntrada);
       ceroUltimaEntrada.setBounds(140,44,28,28);
       
       signoDivision = new JButton();
       signoDivision.setText("/");
       signoDivision.setMargin(new Insets(2,2,2,2));
       getContentPane().add(signoDivision);
       signoDivision.setBounds(140,44,28,28);
       
       signoSuma = new JButton();
       signoSuma.setText("+");
       signoSuma.setMargin(new Insets(2,2,2,2));
       getContentPane().add(signoSuma);
       signoSuma.setBounds(140,44,28,28);
       
       signoSuma = new JButton();
       signoSuma.setText("+");
       signoSuma.setMargin(new Insets(2,2,2,2));
       getContentPane().add(signoSuma);
       signoSuma.setBounds(140,44,28,28);
       
       //Pantalla 
       display = new JTextField();
       display.setEditable(false);
       display.setBackground(new Color(249,249,102));
       display.setFont(new Font("SansSerif",1,14));
       display.setHorizontalAlignment(SwingConstants.RIGHT);
       getContentPane().add(display);
       display.setBounds(8,8,200,24);
       //
    }
}
