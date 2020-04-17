public class whetherArrSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,1,2,3};
        System.out.println(isSort(arr));
    }

    public static boolean isSort(int arr[]) {
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
