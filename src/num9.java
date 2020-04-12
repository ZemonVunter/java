/*数字9 出现的次数

编写程序数一下 1到 100 的所有整数中出现多少个数字9*/
public class num9 {
    public static void main(String[] args) {
        int count=0;
        for(int i=0;i<=100;i++){
            if(i%10==9){
                count++;
            }
            else if((i/10)%10==9){
                count++;
            }
        }
        System.out.println(count);
    }
}
