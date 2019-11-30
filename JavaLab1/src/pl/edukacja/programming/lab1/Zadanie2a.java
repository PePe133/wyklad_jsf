/*
 * Na podstawie Kubiak M.: Java. Zadania z programowania z przykładowymi rozwiązaniami. Helion 2011
 */
package pl.edukacja.programming.lab1;

/**
 *
 * @author grupa laboratoryjna
 */
import java.io.*;

public class Zadanie2a {

    public static void main(String[] args)
            throws IOException {
        double a, b, c, delta, x1, x2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program oblicza pierwiastki równania ax^2+bx+c = 0.");
        System.out.println("Podaj a.");
        a = Double.parseDouble(br.readLine());

        if (a == 0) {
            System.out.println("Niedozwolona wartość współczynnika a.");
        } else {
            System.out.println("Podaj b.");
            b = Double.parseDouble(br.readLine());
            System.out.println("Podaj c.");
            c = Double.parseDouble(br.readLine());

            delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Brak pierwiastków rzeczywistych.");
            } else {
                if (delta == 0) {
                    x1 = -b / (2 * a);
                    System.out.printf("Dla a = " + "%4.2f,", a);
                    System.out.printf(" b = " + "%4.2f,", b);
                    System.out.printf(" c = " + "%4.2f\n", c);
                    System.out.print("trójmian ma jeden pierwiastek podwójny x1 = ");
                    System.out.printf("%4.2f.", x1);
                } else {
                    x1 = (-b - Math.sqrt(delta)) / (2 * a);
                    x2 = (-b + Math.sqrt(delta)) / (2 * a);
                    System.out.printf("Dla a = " + "%4.2f,", a);
                    System.out.printf(" b = " + "%4.2f,", b);
                    System.out.printf(" c = " + "%4.2f\n", c);
                    System.out.println("trójmian ma dwa pierwiastki:");
                    System.out.print("x1 = ");
                    System.out.printf("%4.2f,", x1);
                    System.out.print(" x2 = ");
                    System.out.printf("%4.2f.\n", x2);
                }
            }
        }
    }
}
