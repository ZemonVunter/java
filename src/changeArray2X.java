/*改变原有数组元素的值
实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}*/
public class changeArray2X {

    public static void transform(int a[]){
        for(int i=0;i<a.length;i++){
            a[i]=2*a[i];
        }
    }



    public static void main(String[] args) {
        int[] arr={1,2,3};
        transform(arr);
        for (int x:arr
             ) {
            System.out.print(x+" ");
        }
    }
}
