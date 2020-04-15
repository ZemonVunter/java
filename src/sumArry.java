/*数组所有元素之和
实现一个方法 sum, 以数组为参数, 求数组所有元素之和.*/
public class sumArry {
    public static int sumarr(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
            int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumarr(arr));
    }
}
