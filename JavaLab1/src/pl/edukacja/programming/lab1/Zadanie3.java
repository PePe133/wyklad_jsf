/*
 * Na podstawie Kubiak M.: Java. Zadania z programowania z przykładowymi rozwiązaniami. Helion 2011
 */
package pl.edukacja.programming.lab1;

import pl.edukacja.programming.lab1.iterations.FunctionSolver;

/**
 *
 * @author p.grobelny
 */
public class Zadanie3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i = 5;
        
        System.out.println("Program oblicza wartość funkcji y = 3x");
        System.out.println("dla x zmieniającego się od 0 do " + i + ".");
        
        System.out.println("Petla for");
        FunctionSolver fs = new FunctionSolver();
        fs.testInstructionFor(i);
                
        System.out.println("Petla do ... while");
        fs.testInstructionDoWhile(i);
        
        System.out.println("Petla while");
        fs.testInstructionWhile(i);
        
    }
}
