/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edukacja.programming.lab1;

import java.util.ArrayList;
import pl.edukacja.programming.lab1.files.EquationFactors;

/**
 *
 * @author p.grobelny
 */
public class Zadanie4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // przykład zasosowanie metody statycznej
        ArrayList abcList = EquationFactors.getFactors("2,4,5");
        System.out.println("a: "+abcList.get(0));
        System.out.println("b: "+abcList.get(1));
        System.out.println("c: "+abcList.get(2));
    }
}
