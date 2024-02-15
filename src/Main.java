
import javax.swing.JOptionPane;
import  java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class Main {

    public static void main(String[] args) {
       /*
            Uppgift 8.1
       String a = null;
        a = JOptionPane.showInputDialog("skriv en siffra",a);

        if(Integer.parseInt(a)<0)
        {
            System.out.println("-1");
        }
        else
    {
        if(Integer.parseInt(a)>0){
            System.out.println("1");
        }
        else {System.out.println("0");}
    }
*/

       /*
             Uppgift 8.7
       DateTimeFormatter ftime = DateTimeFormatter.ofPattern("HH:mm.ss");

        LocalTime time = LocalTime.now();
        String fotime = time.format(ftime);
        System.out.println(fotime);




           // 8.8
  int L = 5;


  if(L<8) {
      LocalDate date = LocalDate.now();
      DateTimeFormatter fdate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
      String fodate = date.format(fdate);
      System.out.println(fodate);

      String månad = fodate.substring(5, 7);
      System.out.println("Månad:" + månad);
  }

  /*
                    DET FUNGERAR ICKE
     public static void main(String[] args) {
        String text = JOptionPane.showInputDialog(null,"SKRIV NÅGOT JÄVLA FETTO");
        TextFix(text);
        System.out.println(text);

    }

    static void TextFix(String text){
        return text = text.replace( " ","");

    }

*/
}}