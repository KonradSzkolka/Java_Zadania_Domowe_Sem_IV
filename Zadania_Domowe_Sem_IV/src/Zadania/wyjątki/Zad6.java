package Zadania.wyjątki;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Podaj pierwszą liczbę całkowitą: ");
            int m = Integer.parseInt(input.next());
            System.out.print("Podaj drugą liczbę całkowitą: ");
            int n = Integer.parseInt(input.next());

            if (n == 0) {
                throw new ArithmeticException("Dzielenie przez 0");
            }

            System.out.printf("%d:%d = %d r. %d\n", m, n, m / n, m % n);
        } catch (NumberFormatException e) {
            System.out.println("To nie jest liczba całkowita.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}