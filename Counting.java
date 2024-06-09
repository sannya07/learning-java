public class Counting {
    public static void main(String[] args){
       int n=435536; 
       int count=0;
       while (n>0) {
        int rem=n%10; //last digit
        if(rem==3){
            count++;
        }
        n=n/10;
       }
       System.out.println(count);
    }
}
