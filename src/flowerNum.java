/**
 * 打印所有水仙花数
 */
public class flowerNum {
    public static void main(String[] args) {
        //个位
        int a=0;
        //十位
        int b=0;
        //百位
        int c=0;
        for(int i=100;i<1000;i++){
            a=i%10;
            b=(i/10)%10;
            c=(i/100)%10;
            if((int)Math.pow(a,3)+(int)Math.pow(b,3)+(int)Math.pow(c,3)==i){
                System.out.println(i);
            }
        }
    }
}
