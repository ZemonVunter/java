public class max2Plus {
    public static int max2(int a,int b){
        if(a>b){    return a;}
        else {return b;}

    }
    public static double max2(double a,double b){
        if(a>b){    return a;}
        else {return b;}

    }
    public static double max2(int a,double b){
        if(a>b){    return a;}
        else {return b;}

    }
    public static double max2(double a,int b){
        if(a>b){    return a;}
        else {return b;}

    }

    public static void main(String[] args) {
        System.out.println(max2(14,15));
        System.out.println(max2(14.1,15));
        System.out.println(max2(14,15.6));
        System.out.println(max2(14.78,15.6));
    }
}
