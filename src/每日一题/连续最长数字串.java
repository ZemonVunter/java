package 每日一题;

import java.util.Scanner;

/**
 * 读入一个字符串str，输出字符串str中连续最长数字串
 * 输入sfsfasfafa123456wwe12
 * 输出123456
 */
public class 连续最长数字串 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            int max=0;
            int count=0;
            int end=0;
            for (int i = 0; i <str.length() ; i++) {
        if((str.charAt(i)>='0')&&(str.charAt(i)<='9')){
            count++;
            if(max<count){
               max=count;
                end=i;
            }
        }
            else {
                count=0;
            }
            } System.out.println(str.substring(end-max+1,end+1));
        }
    }
}
