/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edukacja.programming.lab1.files;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author p.grobelny
 */
public class EquationFactors {

    public static ArrayList getFactors(String str) {
        ArrayList list = new ArrayList();

        StringTokenizer st = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }

        return list;
    }
}
