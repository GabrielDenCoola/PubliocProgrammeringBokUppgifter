import java.io.StringReader;
import java.util.Scanner;
public class Upg96 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Skriv något");
        String Skrivgrejen = scn.nextLine();

        int tecken = Skrivgrejen.length();
        int Mellanslag = 0;

        for (int i = 0; i < tecken; i++) {
            if(Skrivgrejen.charAt(i) == ' '){
                Mellanslag += 1;
            }
        }


        System.out.println("Antal rader: 1 \n Antal ord: " + (Mellanslag + 1) +"\n Antal tecken: " + tecken );
    }
}
