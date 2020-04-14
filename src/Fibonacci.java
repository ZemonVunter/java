/*求斐波那契第n项（迭代）*/
public class Fibonacci {
    public static void fun(int n){
        int[] num=new int[n];
        num[0]=num[1]=1;
       for(int i=2;i<n;i++){
           num[i]=num[i-1]+num[i-2];
       }
        System.out.println(num[n-1]);
    }
    public static void main(String[] args) {
        fun(64);
    }
}
