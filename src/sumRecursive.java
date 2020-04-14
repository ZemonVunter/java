/*递归求和

递归求 1 + 2 + 3 + ... + 10*/
public class sumRecursive {
    public static int fun(int n){
        if(n==1){
            return 1;
        }
        else return n+fun(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fun(10));
    }
}
