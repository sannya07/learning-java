package DAY4;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        // when we dont know how many inputs are given
        fun(2, 3, 4 ,7);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}


// function overloading means having 2 functions with the same name
