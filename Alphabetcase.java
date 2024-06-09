import java.util.Scanner;
public class Alphabetcase {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String word="hello";
        System.out.println(word.charAt(0));
        // char at returns a char so it can be storeed as a char
        // trim eliminates spaces
        char ch= input.next().trim().charAt(0);
        System.out.println(ch);

        if(ch>'a' && ch<'z'){
            System.out.println("lowercase");
        }else{
            System.out.println("uppercase");
        }

    }
}
