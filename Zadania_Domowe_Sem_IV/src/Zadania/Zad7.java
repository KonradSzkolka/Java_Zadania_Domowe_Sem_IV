package Zadania;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj temperaturę w °C: ");
        double c = input.nextDouble();
        double f = c * 1.8 + 32;
        System.out.printf("%.1f °C = %.1f °F\n", c, f);
        input.close();
    }
}
