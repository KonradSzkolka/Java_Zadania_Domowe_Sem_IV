import java.util.*;

public class LambdaExample2 {
    public static void main(String[] args) {
        String[] friends = { "Piotr", "Alojzy", "Marysia" };

        // Sortowanie wg długości łańcuchów znaków za pomocą lambdy
        Arrays.sort(friends, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(Arrays.toString(friends)); // [Piotr, Alojzy, Marysia]
    }
}