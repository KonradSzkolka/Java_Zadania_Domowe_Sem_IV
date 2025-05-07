import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Wzory Matematyczne");
        System.out.print("Podaj długość boku kwadratu aby wyliczyć pole: ");
        Scanner sc = new Scanner(System.in); //zatrzymuje działanie programu i czeka na interakcję użytkownika
        int sideLength = sc.nextInt(); //przypisujemy wartość "zeskanowaną do zmiennej"
        System.out.println("Podałes wartość: " + sideLength + " pole kwadratu = " + (sideLength * sideLength));
        //scaner podajemy raz
        System.out.print("Podaj długość 1 boku prostokąta aby wyliczyć pole: ");
        int sideLengthsProstokont = sc.nextInt();
        System.out.print("Podaj długość 2 boku prostokąta aby wyliczyć pole: ");
        int sideLengthsProstokont2 = sc.nextInt();
        System.out.print("podaleś 1 bok " + sideLengthsProstokont + " podałeś 2 bok " + sideLengthsProstokont2 + "pole prostokonta = " + (sideLengthsProstokont2 * sideLengthsProstokont));

    }
}