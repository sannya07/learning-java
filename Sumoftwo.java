package DAY1;
import java.util.Scanner;
public class Sumoftwo {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("sum is : "+sum);
        // destination type should be greater than source type in auto matic typecasting
        // eg int(dest) from float(source) is possible
        // but float(dest) from int(source) is possible

        // type casting
        int num=(int)(54.677f);
        System.out.println(num);

        // automatic type promotion in expression
        int a=257;
        // max byte that can be saved is 256
        byte b=(byte)(a);
        System.out.println(b); //257%256

    }

}
