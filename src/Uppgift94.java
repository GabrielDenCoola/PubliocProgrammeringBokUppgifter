import java.util.Scanner;
public class Uppgift94 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hur mycket pengar satte du på kontot?");
        int PengarSattPåKontot = scn.nextInt();
        System.out.println("Hur många år satt pengarna på kontot?");
        int AntalÅr = scn.nextInt();

        for (int i = 0; i < AntalÅr; i++) {
            System.out.println("År " + (2024 - AntalÅr + i + 1) + " Är pengar på kontot " + (PengarSattPåKontot + PengarSattPåKontot * 0.01 * i));
        }


    }
}
