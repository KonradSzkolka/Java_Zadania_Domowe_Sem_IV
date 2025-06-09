import java.util.*;

public class LambdaExample3 {
    public static void main(String[] args) {
        String[] friends = { "Piotr", "Alojzy", "Marysia" };
        Arrays.sort(friends, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(Arrays.toString(friends));

        ArrayList<String> enemies = new ArrayList<>(Arrays.asList(null, "Krzysztof", "Józef", "Anna", null));

        // Usuwanie wszystkich wartości null
        enemies.removeIf(e -> e == null);

        System.out.println(enemies); // [Krzysztof, Józef, Anna]
    }
}