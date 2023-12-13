import java.util.Arrays;

public class PassBubbleSort {
    public static int bubbleSortP(int arr[]){
        int pass=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    pass++;
                }
            }
        }
        return pass;
    }
    public static void main(String[] args) {
        int[] arr={3,5,1,6,0};
        int pass=bubbleSortP(arr);
        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(arr));
        System.out.println("Passes during Sorting : "+pass);
    }
}
