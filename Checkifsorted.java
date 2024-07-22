public class Checkifsorted {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,2};
        System.out.println(Checkifsorted(arr));
    }
    static boolean Checkifsorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>= arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
    }
}
// TIME COMPLEXITY-> O(N)