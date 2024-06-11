package DAY4;

public class Shadowing {
    // shadowing is a practice of using 2 variables with same name
    // it is done within a scope that overlaps

    static int x; //this is overshadowed at line 12
    public static void main(String[] args) {
        x=7;
        System.out.println(x);
        fun();
        int x=7;
        System.out.println(x); //this prints 7
        fun(); //this prints 100 as line 12 scope is not valid in function scope
        
    }
    static void fun(){
        x=100;
        System.out.println(x);
    }
}
