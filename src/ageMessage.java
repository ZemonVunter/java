/**
 * 年龄打印
 *
 *
 * 根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
 */

import java.util.Scanner;

public class ageMessage {
    public static void age(int age){
        if(age<=18){
            System.out.println("少年");
        }
        else if(age>18&&age<=28){
            System.out.println("青年");
        }
        else if(age>28&&age<=55){
                System.out.println("中年");

        }
        else {
            System.out.println("老年");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        age(age);
    }
}
