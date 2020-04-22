public class exchangeArr {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,9};
        int arr2[]={9,8,7,6,5,4,3,2,1};

        for (int x:arr1
             ) {
            System.out.print(x+" ");
        }
        System.out.println();
        for (int y:arr2
             ) {
            System.out.print(y+" ");
        }
        System.out.println();
        exchangeArr(arr1,arr2);
        for (int x:arr1
        ) {
            System.out.print(x+" ");
        }
        System.out.println();
        for (int y:arr2
        ) {
            System.out.print(y+" ");
        }

    }
    public static void exchangeArr(int[] arr1,int[] arr2){
        for(int i=0;i<arr1.length;i++){
            int temp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp;
        }
    }
}
