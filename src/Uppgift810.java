import javax.swing.JOptionPane;
public class Uppgift810 {
    public static void main(String[] args){
        String text = JOptionPane.showInputDialog("Skriv något ballt");
        int numb;
        numb = Integer.parseInt(JOptionPane.showInputDialog("Skriv heltal",JOptionPane.INFORMATION_MESSAGE));
        method(numb, text);
    }

    static void method(int number, String text){
       int textLength = text.length();
        String textAdd = "";
        if(number < textLength){
            text = text.substring(0,textLength-number);
        }
        int i = 0;


        if(number > textLength){
            int L = number - textLength;

        }else

        System.out.println(textAdd + text);





    }

}
