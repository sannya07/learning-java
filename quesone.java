package RECURSION;



public class quesone {
    public static void main(String[] args) {
        printn(1);
    }
    static void printn(int n){
        if(n==5){
            System.out.println(5);
            return ;
        }
        System.out.println(n);
        printn(n+1);
    //  tail recursion
    }
}
