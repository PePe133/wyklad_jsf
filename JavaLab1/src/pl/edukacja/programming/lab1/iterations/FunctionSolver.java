/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edukacja.programming.lab1.iterations;

/**
 *
 * @author p.grobelny
 */
public class FunctionSolver {

    public void testInstructionFor(int i) {
        int x, y;

        for (x = 0; x <= i; x++) {
            y = 3 * x;
            System.out.println("x = " + x + '\t' + "y = " + y);
        }
    }
    
    public void testInstructionDoWhile(int i) {
        int x = 0 ,y;
        do
        {
            y = 3*x;
            System.out.println(" x = " + x + "\t" + " y = " + y);
            x++;
        }
        while (x <= i);
    }
    
    public void testInstructionWhile(int i) {
        int x = 0, y;     
        while (x <= i)
        {
            y = 3*x;
            System.out.println("x = " + x + '\t' + " y=" + y);
            x++;
        }
    }
    
}
