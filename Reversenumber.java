import java.util.Scanner;
public class Reversenumber {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int output=0;
        while(n>0){
            int rem=n%10; //last digit
            output=output*10+rem;
            n=n/10;
        }
        System.out.println(output);
    }
}
