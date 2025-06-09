package Zadania;

public class ZLab01 {
    public static void main(String[] args) {
        for (int i = 48; i <= 124; i++) {
            System.out.println(i + " = " + (char)i);
        }
        // Wyświetlenie dowolnego napisu z kodów znaków
        char[] tekst = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
        for (char c : tekst) System.out.print(c);
        System.out.println();
    }
}
