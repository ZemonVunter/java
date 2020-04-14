/*一只青蛙一次可以跳1级台阶，也可以跳2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。*/
public class frogStep {
    public static int calc3(int n) {
        if (1 == n || 2 == n)
            return n;

        int s1 = 1, s2 = 2, s3 = 1;
        for (int i = 3; i <= n; i++) {
            s3 = s1 + s2;
            s1 = s2;
            s2 = s3;
        }
        return s3;
    }
    public static void main(String[] args) {
        System.out.println(calc3(10));
    }
}
