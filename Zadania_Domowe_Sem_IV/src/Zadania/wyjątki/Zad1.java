package Zadania.wyjątki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number;
        while (true) {
            System.out.print("Podaj liczbę zmiennoprzecinkową: ");
            try {
                number = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("To nie jest poprawna liczba zmiennoprzecinkowa!");
                input.next(); // usuń błędny token
            }
        }
        System.out.println("Wprowadzona liczba: " + number);
    }
}