import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Wzory Matematyczne");
        System.out.print("Podaj długość boku kwadratu aby wyliczyć objętość: ");
        Scanner sc = new Scanner(System.in); //zatrzymuje działanie programu i czeka na interakcję użytkownika
        int sideLengthsc = sc.nextInt(); //przypisujemy wartość "zeskanowaną do zmiennej"
        System.out.println("Podałes wartość: " + sideLengthsc + " Obwód kwadratu = " + (4 * sideLengthsc));

    }
}