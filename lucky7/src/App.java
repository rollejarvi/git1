import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lucky7");

        Scanner kysy = new Scanner(System.in);  // kysy.nextLine()

        Random noppa = new Random();  // noppa.nextInt(laitaluku)

        System.out.println("paljonko talletat");

        String talletus ="";
        talletus = kysy.nextLine();
        int saldo = Integer.parseInt(talletus);
        System.out.println("sinulla on "+saldo+ " saldoa." );

        do {
            int luku1 = noppa.nextInt(10)+1;
            int luku2 = noppa.nextInt(10)+1;
            int luku3 = noppa.nextInt(10)+1;

            System.out.println("jos haluat pelata (paina Enter) tai kirjoita ei");
            String jatketaanko = "";
            jatketaanko = kysy.nextLine();

            if (jatketaanko.equals("ei")){
                break;
            }

            saldo--;
            System.out.println(luku1 + " " + luku2 + " " + luku3);

            if (luku1 == 7 && luku2 == 7 && luku3 == 7)  {
                System.out.println("JACKPOT! voitit 10");
                saldo += 10;
            }
            else if (luku1 == 7 && luku2 == 7 || luku2 == 7 && luku3 == 7 || luku1 == 7 && luku3 ==7) {
                System.out.println("voitit 5");
                saldo +=5;
            }
            else if (luku1 == 7 || luku2 == 7 || luku3 == 7) {
                System.out.println("yksi oikein voitit 3");
                saldo += 3;
            }
            else {
                System.out.println("ei voittoa");
            }
            System.out.println("sinulla on " +saldo+ " saldoa.");

        } while (0<saldo);
    }
}
