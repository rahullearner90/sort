import java.util.Arrays;
public class SelectionSort {
    public static void descendingSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int max_idx=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[max_idx]){
                    max_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[max_idx];
            arr[max_idx]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={3,5,1,6,0};
        descendingSort(arr);
        System.out.println("Sorted array is : "+Arrays.toString(arr));
    }
}
