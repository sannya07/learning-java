import java.util.Scanner;
public class Fibbonacci {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=0;
        int b=1;
        int i=2;
        while(i<=n){
            int temp=b;
            b=a+b;
            a=temp;
            i++;
        }
        System.out.println(b);
    }
}
