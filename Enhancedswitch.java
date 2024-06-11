package DAY3;
import java.util.Scanner;
public class Enhancedswitch {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int day= input.nextInt();
        switch(day){
            case 1-> System.out.println("monday");
            case 2-> System.out.println("tuesday");
            case 3-> System.out.println("wednesdady");
            case 4-> System.out.println("thursday");
            case 5-> System.out.println("friday");
            case 6-> System.out.println("saturday");
            case 7-> System.out.println("sunday");
        }
    }
}
