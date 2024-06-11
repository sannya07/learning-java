package DAY4;

import java.util.Scanner;

public class F {
    // take input of 2 numbers and print the sum
    public static void main(String[] args) {
        greeting();
        sum();
        int ans=sum2();
        System.out.println(ans);
        String message=greet();
        System.out.println(message);
    }
    // return the value
    static int sum2(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first num");
        int num1= input.nextInt();
        System.out.println("enter the second num");
        int num2= input.nextInt();
        int sum=num1+num2;
        return sum;
        // nothing executes after returning 
    }
    static String greet(){
        return "hello";
    }
    static void sum(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first num");
        int num1= input.nextInt();
        System.out.println("enter the second num");
        int num2= input.nextInt();
        int sum=num1+num2;
        System.out.println(sum);
    }
    static void greeting(){
        System.out.println("heeehaw");
    }
}
