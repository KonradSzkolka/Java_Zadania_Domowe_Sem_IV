package Zadania;

import java.util.Scanner;

public class Zad11 {
    public static final String[] days = {
        "niedziela", "poniedziałek", "wtorek", "środa",
        "czwartek", "piątek", "sobota"
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj datę w formacie dd.mm.rrrr: ");
        String date = input.nextLine();
        int d = Integer.parseInt(date.substring(0, 2));
        int m = Integer.parseInt(date.substring(3, 5));
        int y = Integer.parseInt(date.substring(6));
        int z = (m < 3) ? y - 1 : y;
        int c = (m < 3) ? 0 : 2;
        int dt = (23 * m / 9 + d + 4 + y + z / 4 - z / 100 + z / 400 - c) % 7;
        System.out.println("To jest: " + days[dt]);
        input.close();
    }
}
