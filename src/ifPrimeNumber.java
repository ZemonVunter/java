/**打印素数


 打印 1 - 100 之间所有的素数

 以及判断素数
 */

import java.util.Scanner;

public class ifPrimeNumber {
    public static void isPrimeNum(int num){

        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0){
                //打印时删除下一行
                System.out.println(num+"不是素数");
                break;
            }
            else if(i==(int)Math.sqrt(num)){
                System.out.println(num+"是素数");
            }
        }
    }
    public static void main(String[] args) {
        //打印100以内素数
//        System.out.println(2+"是素数");
//        System.out.println(3+"是素数");
//        for(int i=2;i<=100;i++){
//            isPrimeNum(i);
        //输入一个数判断是否为素数
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        isPrimeNum(num);
        }
    }

