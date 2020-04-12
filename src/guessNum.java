/**
 * 猜数字游戏
 */

import java.util.Random;
import java.util.Scanner;

public class guessNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字（0~100）：");
        Random rm=new Random();
        int guessNum= rm.nextInt(100);
        while(true){
            int result=sc.nextInt();
            if(result<guessNum){
                System.out.println("猜小了");
            }
            else if(result>guessNum){
                System.out.println("猜大了");
            }
            else {
                System.out.println("算你运气好，猜对了！");
                break;
            }
        }
    }
}
