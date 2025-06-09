package Zadania.wyjątki;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź wyrażenie (np. 4 + 5): ");
        try {
            int a = input.nextInt();
            String op = input.next();
            int b = input.nextInt();
            int result = 0;
            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Dzielenie przez 0");
                        return;
                    }
                    result = a / b;
                    break;
                default:
                    System.out.println("Nieznana operacja: " + op);
                    return;
            }
            System.out.println("Wynik: " + result);
        } catch (Exception e) {
            System.out.println("Błąd danych wejściowych: " + e.getMessage());
        }
    }
}