package Zadania.wyjątki;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, count = 0;
        System.out.println("Wprowadź 5 liczb całkowitych:");
        while (count < 5) {
            String s = input.next();
            try {
                int n = Integer.parseInt(s);
                sum += n;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Pominięto: " + s);
            }
        }
        System.out.println("Suma: " + sum);
    }
}