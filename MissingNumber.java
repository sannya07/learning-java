public class MissingNumber {
    public static void main(String[] args) {
        // arr[] -> 1 2 4 5
        // brute force - double loop
        // better sol - hashing
        // optimal sol- xor ^ 
        // a^a=0
        // a^0=a
        // 0^0=0

        int[] arr={1,2,4,5};
        int xor1=0;
        int xor2=0;
        int n=arr.length+1;
        for(int i=1 ;i<=n;i++){
            xor1=xor1^i; //4 is included

        }
        for (int i = 0; i < arr.length; i++) {
            xor2=xor2^arr[i]; //4 is not included
        }
        int ans= xor1^ xor2;
        System.out.print(ans);
    }
}
