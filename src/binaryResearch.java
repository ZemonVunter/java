/*二分查找*/
public class binaryResearch {
    public static void main(String[] args) {
        int[] arr={1,5,8,66,99,118,188};
        System.out.println(binaryResearch(arr,99));
    }

    public static int binaryResearch(int[] arr,int k){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(k<arr[mid]){
                end=mid-1;
            }
            else if(k>arr[mid]){
                start=mid-1;
            }
            else return mid;
        }
        return -1;
    }
}
