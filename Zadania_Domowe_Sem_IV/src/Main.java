import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Wzory Matematyczne");
        System.out.println("wybierz wzór 1 dla pola kwadratu, lub 2 dla pola prostokąta");
        Scanner sc = new Scanner(System.in); //zatrzymuje działanie programu i czeka na interakcję użytkownika
        int wybor;
        wybor = sc.nextInt();
        if(wybor == 1)
        {
            System.out.print("Podaj długość boku kwadratu aby wyliczyć pole: ");
            //Scanner sc = new Scanner(System.in); //zatrzymuje działanie programu i czeka na interakcję użytkownika(tego już nie musi być a nawet nie powinno bo jest wyżej)
            int sideLength = sc.nextInt(); //przypisujemy wartość "zeskanowaną do zmiennej"
            System.out.println("Podałes wartość: " + sideLength + " pole kwadratu = " + (sideLength * sideLength));
            //scaner podajemy raz
        }
        else if (wybor == 2)
        {
            System.out.print("Podaj długość 1 boku prostokąta aby wyliczyć pole: ");
            int sideLengthsProstokont = sc.nextInt();
            System.out.print("Podaj długość 2 boku prostokąta aby wyliczyć pole: ");
            int sideLengthsProstokont2 = sc.nextInt();
            System.out.print("podaleś 1 bok " + sideLengthsProstokont + " podałeś 2 bok " + sideLengthsProstokont2 + "pole prostokonta = " + (sideLengthsProstokont2 * sideLengthsProstokont));
        }
        else
            System.out.println("dokonano błędnego wyboru"); //if jednolinijkowy immo nieczytelne ale ok w filmiku było

        // wersja na switch case
        System.out.println("wybierz wzór 1lub5 dla pola kwadratu, lub 2 dla pola prostokąta");
        int wyborSwitch;
        wyborSwitch = sc.nextInt();
        switch(wyborSwitch)
        {
            case 5: //dodatkowy case który odpali nam pierwszy case bo są zgrupowane
            case 1:{
                System.out.print("Podaj długość boku kwadratu aby wyliczyć pole: ");
                //Scanner sc = new Scanner(System.in); //zatrzymuje działanie programu i czeka na interakcję użytkownika(tego już nie musi być a nawet nie powinno bo jest wyżej)
                int sideLength = sc.nextInt(); //przypisujemy wartość "zeskanowaną do zmiennej"
                System.out.println("Podałes wartość: " + sideLength + " pole kwadratu = " + (sideLength * sideLength));
                //scaner podajemy raz
                break;
            }
            case 2:{
                System.out.print("Podaj długość 1 boku prostokąta aby wyliczyć pole: ");
                int sideLengthsProstokont = sc.nextInt();
                System.out.print("Podaj długość 2 boku prostokąta aby wyliczyć pole: ");
                int sideLengthsProstokont2 = sc.nextInt();
                System.out.print("podaleś 1 bok " + sideLengthsProstokont + " podałeś 2 bok " + sideLengthsProstokont2 + "pole prostokonta = " + (sideLengthsProstokont2 * sideLengthsProstokont));
                break;
            }
            default: {
                System.out.println("dokonano błędnego wyboru"); //if jednolinijkowy immo nieczytelne ale ok w filmiku było
                break;
            }
        }
    }
}