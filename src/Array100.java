public class Array100 {
    public static void main(String[] args) {
        int[] arr=new int[100];
        for (int i=0;i<100;i++){
            arr[i]=i+1;
        }
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
}
