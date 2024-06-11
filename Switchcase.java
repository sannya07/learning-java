package DAY3;
import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String fruit=input.next();
        switch (fruit) {
            case "mango":
                System.out.println("KING OF FRUITS");
                break;
            case "grapes":
                System.out.println("smol fruit");
                break;
            default:
                System.out.println("please enter a valid fruit");
        }
    }
}