
import java.util.Scanner;
public class AAAAAAAA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
     /*    System.out.println("Skriv siffra");
        int number1 = scn.nextInt();
        System.out.println("Skriv siffra");
        int number2 = scn.nextInt();
        System.out.println("Skriv siffra");
        int number3 = scn.nextInt();
        System.out.println("the smallest number is " + small(number1, number2, number3) +"\n" + "hehehehea");


        }
        public static int small(int number1, int number2, int number3){
            return Math.min(Math.min(number1,number2),number3);
           }*/
        System.out.println("Srive siffre 1");
        double averageNumber1 = scn.nextInt();
        System.out.println("Srive siffre 2");
        double averageNumber2 = scn.nextInt();
        System.out.println("Srive siffre 3");
        double averageNumber3 = scn.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println("Medelvärdet är " + medel(averageNumber1, averageNumber2, averageNumber3)*i);
        }

    }
    public static double medel(double averageNumber1, double averageNumber2, double averageNumber3) {
    return (averageNumber1 + averageNumber2 + averageNumber3) / 3;
    }
}


