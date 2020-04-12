/**
 * 求两个数的最大公约数
 *
 */
public class greatestCommonDivisor {
    public static void fun2(int a,int b){
        //保证a>b
        if(a<b){
            a=a^b;
            b=a^b;
            a=a^b;
        }
        int temp=0;
        while(true){
            if(a%b==0){
                System.out.println("最大公约数为"+b);
                break;
            }
            else {
                temp=a%b;
                a=b;
                b=temp;
            }
        }
    }
    public static void main(String[] args) {
    fun2(90,900);
    }
}
