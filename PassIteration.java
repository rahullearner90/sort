import java.util.Arrays;
public class PassIteration {
    
    static void insertionSort(int arr[]){
        int first=0,second=0;
        for(int i=1; i<arr.length; i++){
            first++;
            int j=i;
            while(j>0 && arr[j]>arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                second++;

                j--;
            }
        }
        System.out.println("First : "+first+" ,Second : "+second);
    }

    public static void main(String[] args) {
        int[] arr={3,5,1,6,0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}