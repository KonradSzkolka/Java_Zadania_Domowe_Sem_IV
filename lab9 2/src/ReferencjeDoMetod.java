import java.util.*;

public class ReferencjeDoMetod {
    public static void main(String[] args) {
        // 1. Sortowanie z ignorowaniem wielkości liter
        String[] strings1 = { "Ala", "ma", "Małego", "białego", "kotka", null };
        String[] strings2 = Arrays.copyOf(strings1, strings1.length);

        // Usuwamy null przed sortowaniem
        strings1 = Arrays.stream(strings1).filter(Objects::nonNull).toArray(String[]::new);
        strings2 = Arrays.stream(strings2).filter(s -> s != null).toArray(String[]::new);

        // a) Wyrażenie lambda
        Arrays.sort(strings1, (x, y) -> x.compareToIgnoreCase(y));
        System.out.println("Sortowanie (lambda): " + Arrays.toString(strings1));

        // b) Referencja do metody
        Arrays.sort(strings2, String::compareToIgnoreCase);
        System.out.println("Sortowanie (referencja): " + Arrays.toString(strings2));

        // 2. Usuwanie null z listy
        List<String> list1 = new ArrayList<>(Arrays.asList("Ala", null, "ma", null, "kota"));
        List<String> list2 = new ArrayList<>(list1);

        // a) Wyrażenie lambda
        list1.removeIf(x -> x == null);
        System.out.println("Usuwanie null (lambda): " + list1);

        // b) Referencja do metody
        list2.removeIf(Objects::isNull);
        System.out.println("Usuwanie null (referencja): " + list2);

        // 3. Wyświetlanie elementów listy
        System.out.println("Wyświetlanie (lambda):");
        list1.forEach(x -> System.out.println(x));

        System.out.println("Wyświetlanie (referencja):");
        list2.forEach(System.out::println);
    }
}