package ejercicioCap2;
import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;


public class Window extends JFrame{
    //
    JLabel text1 = new JLabel();
    JLabel text2 = new JLabel();
    JTextField gradosCentigrados = new JTextField();
    JTextField gradosFarenheit = new JTextField();
    JButton botonAceptar = new JButton();
    private Object miEntrada;
    
    public Window(){
        setSize(360,200);
        setTitle("Conversion");
        initComponents();
        
    }
    
    WindowAdapter miAdaptadorVentana = new WindowAdapter(){
        public void windowClosing(WindowEvent evt){
            System.exit(0);
        }
        public void windowOpened(WindowEvent evt){
            gradosFarenheit.requestFocus();
        }
    };
    private void initComponents(){
        getContentPane().setLayout(null);
        addWindowListener(miAdaptadorVentana);
        
        //Components
        text1.setText("Grados Centrigrados");
        getContentPane().add(text1);
        text1.setBounds(12,28,200,16);

        text2.setText("Grados farenheit");
        getContentPane().add(text2);
        text2.setBounds(12,68,200,24);

        gradosCentigrados.setText("0.00");
        getContentPane().add(gradosCentigrados);
        gradosCentigrados.setHorizontalAlignment(SwingConstants.RIGHT);
        gradosCentigrados.setBounds(160,28,144,20);

        gradosFarenheit.setText("32.0");
        getContentPane().add(gradosFarenheit);
        gradosFarenheit.setBounds(160, 72, 144, 20);
        gradosFarenheit.setHorizontalAlignment(SwingConstants.RIGHT);

    //    botonAceptar.setText("Aceptar");
    //    getRootPane().setDefaultButton(botonAceptar);
    //    getContentPane().add(botonAceptar);
    //    botonAceptar.setBounds(160,120,144,20);
    //    botonAceptar.setMnemonic('a');


//        KeyAdapter myKeyAdapter = new KeyAdapter(){
//            public void keyTyped(KeyEvent evt){
//               miEntrada =  evt.getSource();
//               //JTextField temp = (JTextField) miEntrada;
//               convertir(evt);
//            }
//        };
//        
//        ActionListener miAccion = new ActionListener(){
//            public void actionPerformed(ActionEvent evt){
//                convertir(evt);
//            }
//        };

        KeyAdapter myAdaptadorTeclado = new KeyAdapter(){
            public void keyReleased(KeyEvent evt){
                GradosKeyReleased(evt);
            }
        };
        
        gradosFarenheit.addKeyListener(myAdaptadorTeclado);
        gradosCentigrados.addKeyListener(myAdaptadorTeclado);
        
        FocusAdapter miFocoEscuchador = new FocusAdapter(){
            public void focusGained (FocusEvent evt){
                JTextField textoEnfocado = (JTextField)evt.getSource();
                textoEnfocado.selectAll();            
            }
        };


        gradosFarenheit.addFocusListener(miFocoEscuchador);
        gradosCentigrados.addFocusListener(miFocoEscuchador);

        ActionListener escuchaBoton = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent miEvento){
                convertir(miEvento);
            }
        };
        
        gradosFarenheit.addActionListener(escuchaBoton);
        gradosCentigrados.addActionListener(escuchaBoton);
        
        
        //botonAceptar.addActionListener(escuchaBoton);
        
    
    }//fin de InitComponent
    
    private void  convertir(ActionEvent miEvento){
        try{
            miEntrada = miEvento.getSource();
            if (miEntrada == gradosFarenheit){
                gradosCentigrados.setText(String.format("%.2f",
                        (Double.parseDouble(gradosFarenheit.getText())-32)*(5.0/9.0))
                );
            }
            if (miEntrada == gradosCentigrados){
                gradosFarenheit.setText(String.format("%.2f",
                        Double.parseDouble(gradosCentigrados.getText()) * 1.8 + 32)
                );
            }
        }
        catch(NumberFormatException e){
            gradosCentigrados.setText("0.0");
            gradosFarenheit.setText("32.0");
        }        
    }//FIn de conversion
    
    private void GradosKeyReleased(KeyEvent evt){
        boolean error = false;
        JTextField temp = (JTextField)evt.getSource();
        String strTemp = temp.getText();
        char[] fuente = strTemp.toCharArray();
        char[] result = new char[fuente.length];
        int j = 0;
        for (int i = 0; i < fuente.length;i++){
            if(fuente[i] >= '0' && fuente[i]<='9' || fuente[i] == '.' || fuente[i] == '+'
                    || fuente[i] == '-')
                result[j++] = fuente[i];
            else{
                error = true;
                Toolkit.getDefaultToolkit().beep();
            }
        }
        if(error){
            temp.setText(new String(result,0,j));
        }
        System.out.println("Teclado");
        System.out.println(result);
    }//fin de keyReleased
    
}