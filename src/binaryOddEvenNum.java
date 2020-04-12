import java.util.Scanner;

public class binaryOddEvenNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入数字：");
        int value=scan.nextInt();
        System.out.println("偶数序列：");
        for(int i=31;i>0;i-=2){
            System.out.print((value>>i)&1);
        }
        System.out.println("");
        System.out.println("奇数序列：");
        for(int i=30;i>=0;i-=2){
            System.out.print((value>>i)&1);
        }
    }
}
