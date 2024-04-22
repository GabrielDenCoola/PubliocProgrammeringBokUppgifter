import java.util.Scanner;
import java.lang.Math;
public class Yatzy30 {
    public static void main(String[] args) {
        //En Array som fungerar som 6 tärningar
        //När jag rullar tärningarna har jag en metod som använder sig av en fori loop och använder Math.Random för att slumpa tärningarnas sidor.
        //Jag kommer att försöka att låsa tärningars sidor med att göra så att dem tärningar jag sparat flyttas längts bak i arrayen så att jag kan använda en mindre for lopp för resten av tärningarna
        //En int för varje spelares hp
        //När man har mer än 30 får man välja vem man ska attackera efter att koden visat hur mycket liv varje spelare har kvar
        //En String[] för spelarna samt4
        //Efter varje runda så ökas en int

        Scanner scn = new Scanner(System.in);
        System.out.println("Hur många spelare kommer att spela?");
        int SpelarMängd = scn.nextInt();
        String[] Spelare = new String[SpelarMängd];
        int[] SpelarPoäng = new int[SpelarMängd];
        int[] Tärning = new int[6];
        int LåstaTärningar = 0;
        int[] LåstTärning = new int[6];
        int Spel = 1;
        String temp;
        //Ger spelarna sina namn
        for (int i = 0; i < (SpelarMängd); i++) {
            System.out.println("Vad heter spelare " + (i+1) + "?");
            Spelare[i] = scn.next();
        }
        //Ger alla spelare sina poäng
        for (int i = 0; i < SpelarMängd; i++) {
            SpelarPoäng[i] = 30;
        }
        //Kastar tärningarna för varje spelare
        while(Spel == 1) {
            for (LåstaTärningar = 0; LåstaTärningar < 6; LåstaTärningar++) {
                System.out.println("Vill spelare du kasta Tärning? Skriv ja och klicka på enter för att göra det!");
                temp = scn.next();
                rollDice(Tärning, LåstaTärningar);
                for (int i = 0; i < 6; i++) {
                    System.out.println(Tärning[i]);
                }
                lockDice(Tärning, LåstTärning);
            }
        }
    }

    public static int[] rollDice(int[] Tärning, int LåstaTärningar){

        for (int i = 0; i < (6 - LåstaTärningar); i++) {
            Tärning[i] = (int) ((Math.random() *6) +1);
            if(Tärning[i] == 0){
                Tärning[i] = 1;
            }

        }
        return(Tärning);
    }
    public static int[] lockDice(int[] Tärning, int[] LåstTärning){
        for (int i = 0; i < 1;) {
            System.out.println("Skriv vilka tärningar du vill spara! Skriv inget mellanrum utan om du vil spara 3 skriv ett hundratal ex. 655 om det går");
        }
        return(LåstTärning);
    }

}

