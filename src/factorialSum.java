/*求1~n的阶乘和*/
public class factorialSum {
    //求n的阶乘值
    public static int fun1(int n){
        if(n==1){return  1;}
        else {return n*fun1(n-1);}
    }
public static int fun2(int n){
        int[] num=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            num[i]=fun1(i+1);
        }
    for (int i = 0; i<n; i++) {
            sum+=num[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(fun2(4));
    }
}
