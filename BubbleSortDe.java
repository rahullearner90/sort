import java.util.Arrays;

class BubbleSortDe{
    // bubble sort method define
    public static void desendingSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int[] arr={3,5,1,6,0};
        // calling method
        desendingSort(arr);
        //  printing method
        System.out.println("Sorted array is : "+Arrays.toString(arr));
    }
}