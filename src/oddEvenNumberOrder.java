/**
 * 奇数位于偶数之前
 * 调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
 */

import java.util.Arrays;

public class oddEvenNumberOrder {
//    public static void fun(int[] a) {
//        int longa=a.length;
//        int[] b=new int[longa];
//        int count=0;
//        //找到奇数的个数
//        for(int i=0;i<=longa-1;i++){
//            if(a[i]%2!=0){count++;}
//        }
//        //奇数写到新数组
//        for(int i=0;i<=longa-1;i++){
//                if(a[i]%2!=0){
//                   for(int j=0;j<=count-1;j++){
//                        b[j]=a[i];
//                    }
//                }
//        }
//        for(int i=0;i<=longa-1;i++){
//            if(a[i]%2==0){
//                for(int j=count-1;j<=longa-1;j++){
//                    b[j]=a[i];
//                }
//            }
//        }
//        for (int x:b) {
//            System.out.print(x+" ");
//        }
//    }
//    public static void main(String[] args) {
//        int[] a={1,3,4,5,6,12,4,5,6,7};
//        fun(a);
//    }
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    fun(arr);
    System.out.println(Arrays.toString(arr));
}


    private static void fun(int[] arr) {
        int front = 0,end = arr.length-1;//设置两个指针，一个指向头部，一个指向尾部
        if (arr.length == 0){//数组长度为0则返回
            return;
        }

        while (front < end){
            while (front < arr.length && arr[front]%2 == 1){//从前往后找偶数
                front++;
            }
            while (end >= 0 && arr[end]%2 == 0){//从后往前找奇数
                end--;
            }
            if (front < end){//将前面的偶数与后面奇数交换位置
                int temp = arr[front];
                arr[front] = arr[end];
                arr[end] = temp;
            }
        }
    }

}
