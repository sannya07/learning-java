public class Removeduplicatesfromasortedarray {
    public static void main(String[] args) {
        // brute force -> using sets
        // tc-> O(log N)

        int[] arr={1,1,2,2,2,3,3};
        // optimal solution -> 2 pointers
        int a=remove(arr);
        System.out.println(a);
    }
    static int remove(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
}
