/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap15.pkg4;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author wuser
 */
public class Cap154 {

    /**
     * @param args the command line arguments
     */
    private final static OpcionMenu[] opciones = OpcionMenu.values();
    public static void main(String[] args) {
        OpcionMenu tipoCuenta = obtenerSolicitud();
        while (tipoCuenta != OpcionMenu.FIN){
            switch(tipoCuenta){
                case SALDO_CERO:
                    System.out.printf("%nCuentas con saldos de cero:%n");
                    break;
                case SALDO_CREDITO:
                    System.out.printf("%nCuentas con saldos con credito:%n");
                    break;
                case SALDO_DEBITO:
                    System.out.print("%nCuentas con saldos con debito:%n"); 
            }
            leerRegistros(tipoCuenta);
            tipoCuenta = obtenerSolicitud();
        }
    }
    
    private static OpcionMenu obtenerSolicitud(){
        int solicitud = 4;
        
            System.out.printf("%nEscriba solicitud%n%s%n%s%n%s%n%s%n",
            " 1 - Lista de cuentas con saldos de cero",
            " 2 - Lista de cuentas con saldos con credito",
            " 3 - Lista de cuentas con saldos con debito",
            " 4 - Terminar programa");
            
            try{
                Scanner entrada = new Scanner(System.in);
                do{
                    System.out.printf("%n?");
                    solicitud = entrada.nextInt();   
                }while((solicitud < 1) || solicitud > 4);
            }catch(NoSuchElementException e){
                System.err.println("Entrada invalida. Terminado");
            }
            return opciones[solicitud -1];
    }
    
    private static void leerRegistros(OpcionMenu tipoCuenta){
        try(Scanner entrada = new Scanner(Paths.get("clientes.txt"))){
            while(entrada.hasNext()){
                int numeroCuenta = entrada.nextInt();
                String primerNombre = entrada.next();
                String apellidoPaterno = entrada.next();
                double saldo = entrada.nextDouble();
                if(debeMostrar(tipoCuenta, saldo))
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", numeroCuenta,
                    primerNombre, apellidoPaterno, saldo);
                else
                    entrada.nextLine();
            }
        }
        catch(NoSuchElementException | IllegalStateException | IOException e){
            System.err.println("Error al procesar el archivo. Terminado");
            System.exit(1);
        }
    }
    
    private static boolean debeMostrar(OpcionMenu tipoCuenta, double saldo){
        if((tipoCuenta == OpcionMenu.SALDO_CREDITO) && (saldo < 0))
            return true;
        else if ((tipoCuenta == OpcionMenu.SALDO_DEBITO) && (saldo > 0))
            return true;
        else if((tipoCuenta == OpcionMenu.SALDO_CERO) && (saldo == 0))
            return true;
        
        return false;
    }
}
