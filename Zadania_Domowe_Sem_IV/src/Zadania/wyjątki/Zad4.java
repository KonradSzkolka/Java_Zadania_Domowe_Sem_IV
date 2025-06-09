package Zadania.wyjątki;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        String s = input.next();
        try {
            int n = Integer.parseInt(s);
            if (n == 0) {
                throw new ArithmeticException("Nie istnieje odwrotność liczby 0.");
            }
            double inverse = 1.0 / n;
            System.out.println("Odwrotność: " + inverse);
        } catch (NumberFormatException e) {
            System.out.println("To nie jest liczba całkowita: " + s);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}