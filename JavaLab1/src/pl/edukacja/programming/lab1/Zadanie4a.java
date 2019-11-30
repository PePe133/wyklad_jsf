/*
 * Na podstawie Kubiak M.: Java. Zadania z programowania z przykładowymi rozwiązaniami. Helion 2011
 */
package pl.edukacja.programming.lab1;

import java.io.IOException;
import pl.edukacja.programming.lab1.files.FileHandler;

/**
 *
 * @author p.grobelny
 */
public class Zadanie4a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
       FileHandler fileHandler = new FileHandler(); 
        // deklaracja zmiennej, utworzenie obiektu i przypisanie go do zmiennej
     
        fileHandler.readDataFromConsole(); 
        fileHandler.saveDataToFile(); 
        fileHandler.readDataFromFile(); 
        
    }
}
