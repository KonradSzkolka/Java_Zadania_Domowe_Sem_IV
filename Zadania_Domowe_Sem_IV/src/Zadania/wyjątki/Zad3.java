package Zadania.wyjątki;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, count = 0;
        System.out.println("Wprowadź 5 liczb całkowitych:");
        while (count < 5) {
            if (input.hasNextInt()) {
                int n = input.nextInt();
                sum += n;
                count++;
            } else {
                String token = input.next();
                System.out.println("Pominięto: " + token);
            }
        }
        System.out.println("Suma: " + sum);
    }
}