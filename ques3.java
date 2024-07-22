package RECURSION;
public class ques3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7};
        System.out.println(search(arr, 6, 0, arr.length-1));
    }
    static int search(int arr[], int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if(arr[m]== target){
            return m;
        }
        if(target<m){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }
}
