import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Februar {
    public static void main(String[] args) {

        //Uppgift 9
        Scanner scn = new Scanner(System.in);
        System.out.println("Dagens mätarställning");
        double idagMil = scn.nextDouble();
        System.out.println("Förra årets mätarsättling");
        double Mil = scn.nextDouble();
        System.out.println("Antal liter förbrukad bensin?");
        double Bränsle = scn.nextDouble();

        DecimalFormat Formatör = new DecimalFormat("#.##");

        Formatör.format(Bränsle);

        System.out.println("Antal körda mil: "+ (idagMil -Mil) + "\n" + "Antal liter bensin: " + Bränsle + "\n" +  "Förbrukning per mil " + Formatör.format(Bränsle / (idagMil - Mil)));

    }
}
