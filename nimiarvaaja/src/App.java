import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner kysy = new Scanner(System.in);
        int arvaukset =0;
        
        while (true) {
            
            System.out.println("Guess my name (type stop to exit))");

            arvaukset ++;

            String arvaus = kysy.nextLine();
            
            if (arvaus.equals("Emma")) {
                System.out.println("Congratulations!");
                System.out.println("You guessed "+arvaukset+" times");
                break;

            }
            if (arvaus.equals("stop")){
                break;
            }
            
            
        }
        kysy.close();
    }
}