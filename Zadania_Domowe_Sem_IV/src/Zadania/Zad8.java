package Zadania;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj długość pierwszej przyprostokątnej: ");
        double a = input.nextDouble();
        System.out.print("Podaj długość drugiej przyprostokątnej: ");
        double b = input.nextDouble();
        double c = Math.sqrt(a*a + b*b);
        System.out.printf("Długość przeciwprostokątnej: %.3f\n", c);
        input.close();
    }
}
