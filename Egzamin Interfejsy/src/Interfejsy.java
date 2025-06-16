// src/Interfere.java
public class Interfejsy {
    public static double average(IntSequence seq, int n) {
        int sum = 0;
        int count = 0;
        while (seq.hasNext() && count < n) {
            sum += seq.next();
            count++;
        }
        return count > 0 ? (double) sum / count : 0.0;
    }

    public static void main(String[] args) {
        // Średnia pierwszych 100 kwadratów
        SquareSequence sq = new SquareSequence();
        double avgSq = average(sq, 100);
        System.out.println("Średnia pierwszych 100 kwadratów: " + avgSq);

        // Cyfry liczby 1729
        DigitSequence ds = new DigitSequence(1729);
        while (ds.hasNext()) {
            System.out.print(ds.next() + " ");
        }
        System.out.println();

        // Średnia cyfr liczby 1729
        ds = new DigitSequence(1729);
        double avgDigits = average(ds, 100); // 100 wystarczy, bo cyfr jest mniej
        System.out.println("Średnia cyfr: " + avgDigits);
    }
}