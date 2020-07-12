/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap15.pkg3;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author wuser
 */
public class Cap153 {
    private static Scanner entrada;
    public static void main(String[] args){
        abrirArchivo();
        leerRegistros();
        cerrarArchivo();
    }
    public static void abrirArchivo(){
        try{
            entrada = new Scanner(Paths.get("clientes.txt"));
        }catch(IOException e){
            System.err.println("Error al abrir el archivo");
            System.exit(1);
        }
    }
    
    public static void leerRegistros(){
    System.out.printf("%-10s%-12s%-12s%10s%n", "Cuenta",
    "Primer nombre", "Apellido paterno", "Saldo");
        try{
            while(entrada.hasNext()){
                System.out.printf("%-10d%-12s%-12s%10.2f%n",entrada.nextInt(),
                entrada.next(), entrada.next(), entrada.nextDouble());
            }
            
        }catch(NoSuchElementException e){
            System.err.println("El archivo no esta bien formado. Terminando");
        }catch(IllegalStateException e){
            System.err.println("Error al leer el del archivo. Terminando");
        }
    }
    
    public static void cerrarArchivo(){
        if(entrada != null)
            entrada.close();
    }
}
