/*数组的拷贝
实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.*/
import java.util.Arrays;
public class copyArr {
    public static void main(String[] args) {
        int[] arr={1,5,6,4,7,8,9,10};
        int[] ret=copyOf(arr);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] copyOf(int arr[]){
        int[]ret=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ret[i]=arr[i];
        }
        return ret;
    }
}
