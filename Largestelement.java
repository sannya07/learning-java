public class Largestelement {
    public static void main(String[] args) {
        int[] arr1={2,5,1,3,0};
        int largestelement=findlargest(arr1);
        System.out.println(largestelement);
    }
    static int findlargest(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
// brute force: sorting -> O(N log N)
// OPTIMAL -> O(N)