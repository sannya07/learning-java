package DAY4;

public class Swap {
    public static void main(String[] args){
        
        int a=10;
        int b=7;
        swap(a, b);
        System.out.println("orignal value: ");
        System.out.println(a+" "+b);
    }
    // for primitives ->passing value 
    // for objects and array stuff-> passes value and reference
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        // change, swap in this case is only valid in function scope
        // thats why we have to print it here itself
        System.out.println("swapped value: ");
        System.out.println(a+" "+b);
    }
}

// there are block scope and loop scopes as well

// values initialized inside a block { } cannot be used outside the block

// already initialised value outside the block in the same method cannot be initialized again

// however it can be changed inside the block and it will remain changed outside as well


