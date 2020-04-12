public class test1 {
    public static void main(String[] args) {
        int num = 5;
        int ret = 1;
        for(;num<=5;num++){
            for(int i=1;i<=num;i++){
            ret *= i;
            }
        }
        System.out.println(ret);
    }}

    