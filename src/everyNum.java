import java.util.Scanner;

/**
 * 使用递归打印输入数的每一位
 */

public class everyNum {
    public static void fun(int n){
    if(n>9){
        fun(n/10);
    }
        System.out.println(n%10);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        fun(num);
    }
}
