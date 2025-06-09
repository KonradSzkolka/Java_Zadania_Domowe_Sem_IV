package Zadania;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) throws IOException {
        File f = new File("dane.txt");
        Scanner input = new Scanner(f);
        while (input.hasNext()) {
            String imie = input.next();
            String nazwisko = input.next();
            int godziny = input.nextInt();
            double stawka = input.nextDouble();
            System.out.printf("%s %s %.2f\n", nazwisko, imie, godziny * stawka);
        }
        input.close();
    }
}
