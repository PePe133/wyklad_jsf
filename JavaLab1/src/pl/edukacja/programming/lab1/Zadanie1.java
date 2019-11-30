/*
 * Na podstawie Kubiak M.: Java. Zadania z programowania z przykładowymi rozwiązaniami. Helion 2011
 */
package pl.edukacja.programming.lab1;

import java.io.*;

/**
 *
 * @author p.grobelny
 */
public class Zadanie1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        double a, b, pole;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program oblicza pole prostokąta.");
        System.out.println("Podaj bok a.");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj bok b.");
        b = Double.parseDouble(br.readLine());
        pole = a * b;

        System.out.print("Pole prostokąta o boku a = " + a + " i boku b = " + b);
        System.out.println(" wynosi " + pole + ".");
                
    }
}
