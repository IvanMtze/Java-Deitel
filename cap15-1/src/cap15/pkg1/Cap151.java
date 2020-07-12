/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap15.pkg1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author wuser
 */
public class Cap151 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        Path ruta = Paths.get(entrada.nextLine());
        if(Files.exists(ruta)){
            System.out.printf("%n%s existe%n", ruta.getFileName());
            System.out.printf("%s un directorio%n",Files.isDirectory(ruta)? "Es":"No es");
            System.out.printf("%s una ruta absoluta%n",ruta.isAbsolute()? "Es":"No es");
            System.out.println("Fecha de ultima modificacion"+Files.getLastModifiedTime(ruta));
        }
    }
    
}
