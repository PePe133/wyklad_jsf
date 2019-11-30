/*
 * Na podstawie Kubiak M.: Java. Zadania z programowania z przykładowymi rozwiązaniami. Helion 2011
 */
package pl.edukacja.programming.lab1.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author p.grobelny
 */
public class FileHandler {

    String data, data1;

    public void readDataFromConsole()
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj imię i nazwisko.");
        data = (br.readLine());
    }

    public void saveDataToFile()
            throws IOException {
        System.out.println("Zapisujemy dane do pliku dane.txt.");

        FileWriter fw = new FileWriter("c:/tmp/dane.txt");
        fw.write(data);
        fw.close(); // zamknięcie pliku
    }

    public void readDataFromFile()
            throws IOException {
        System.out.println("Odczytujemy dane z pliku dane.txt.");
        System.out.println();
        FileReader fr = new FileReader("c:/tmp/dane.txt");
        BufferedReader br = new BufferedReader(fr);

        while ((data1 = br.readLine()) != null) // pętla odczytuje dane z pliku
        {
            System.out.println(data1);
        }
        fr.close(); // zamknięcie pliku
                
    }
}
