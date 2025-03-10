
import java.util.Arrays;

public class SelectionSort {
    static int[] selectionSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j])
                min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={1,4,2,44,12};
        int[] arr1=selectionSort(arr);
        System.out.println(Arrays.toString(arr1));
    }
}