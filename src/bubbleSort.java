public class bubbleSort {
    public static void main(String[] args) {
            int[] arr=new int[]{4,5,6,7,89,2,1,3,4,5};
            bubble(arr);
        for (int x:arr
             ) {
            System.out.print(x+" ");
        }
    }
    public static void bubble(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
