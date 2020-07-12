/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap15.pkg2;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author wuser
 */
public class Cap152 {

    /**
     * @param args the command line arguments
     */
    private static Formatter salida;
    public static void main(String[] args) {
         abrirArchivo();
         agregarRegistro();
         cerrarArchivo();
    }
    
    private static void abrirArchivo(){
        try{
            salida = new Formatter("clientes.txt");
        }catch(SecurityException e){
            System.err.println("Permiso de escritura denegado");
            System.exit(1);
        }catch(FileNotFoundException e){
            System.err.println("Error al abrir el archivo. Terminando");
            System.exit(1);
        }
    }
    private static void agregarRegistro(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el numero de cuenta, nombre, apellido y saldo"+
                "\n Para terminar la entrada escriba el indicador de fin de archivo");
        
        while(entrada.hasNext()){
            try{
                salida.format("%d %s %s %.2f %n",entrada.nextInt(), 
                        entrada.next(), entrada.next(), entrada.nextDouble());
            }catch(FormatterClosedException e){
                System.err.println("Error al escribir el archivo");
                break;
            }catch(NoSuchElementException e){
                System.err.println("Entrada invalida");
                entrada.nextLine();
            }
        }
    }
    private static void cerrarArchivo(){
        if(salida != null)
            salida.close();
        System.out.println("fuera");
    }
}
