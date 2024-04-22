import java.util.Scanner;

public class Uppgift111 {

    /*
    Skriv ett program osm läser in ett antal heltal (högst 1000 st) från kommandofönstret
    och som skriver ut dem i samma ordning som de lästes in.
    Inlästningen avslutas med att användaren skriver teckenkombinationen för end-of-file (ctrl-Z o Windows).
    Vid utskriften skall ett visst tal bara skrivas ut en gång om talet skrivits ut tidigare skall det alltså inte skrivas igen.
    Om t.ex. följande tal läses in:
    45 77 -22 3 45 0 21 -1 3
    så skall programmet ge utskriften:
    45 77 -22 3 0 21 -1
     */
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Hur många tal idk?");
        int idk = scn.nextInt();

        int[] knas = new int[idk];
        int numberCheck = 0;
        int[] calculatedKnas = new int[idk];

        for (int i = 0; i < idk; i++) {
            System.out.println("Skriv tal");
            knas[i] = scn.nextInt();
        }
        for (int i = 0; i < idk; i++) {
            for (int j = 0; j < i; j++) {
                if (knas[numberCheck] != knas[j]) {
                    calculatedKnas[numberCheck] = knas[i];
                }else {
                    calculatedKnas[numberCheck] = 0;
                }
            }
            numberCheck += 1;
        }
        for (int i = 0; i < idk; i++) {
            System.out.println(calculatedKnas[i]);
        }
    }
}
