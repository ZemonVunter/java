import java.util.Scanner;

public class num3Max {
    public static void main(String[] args) {
        int max=0;
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
            if(n1>n2){max=n1;}
            else{max=n2;}
            if(n3>max){max=n3;}
        System.out.println(max);
    }
}
