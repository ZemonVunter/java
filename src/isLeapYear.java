/**
 * 输入1000~2000的闰年
 */

import java.util.Scanner;

public class isLeapYear {
    public static void isYear(int year){
        if(((year%4==0)&&(year%100!=0))||year%400==0){
            System.out.println(year+"是闰年");
        }
    }
    public static void main(String[] args) {
        for(int year=1000;year<2000;year++) {
            isYear(year);
        }
    }
}
