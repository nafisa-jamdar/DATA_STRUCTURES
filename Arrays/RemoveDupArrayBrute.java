
import java.util.HashSet;

public class RemoveDupArrayBrute {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3,4,4,4,5,5};
        int n=arr.length;
        int k=RemoveDup(arr,n);
        System.out.println("Sorted array after removing duplicates is ");
        for(int i=0;i<k;i++){
            System.out.print(arr[i]);
        }
    }
    private static int RemoveDup(int[] arr, int n){
        HashSet<Integer> sets=new HashSet<>();
        for(int i=0;i<n;i++){
            sets.add(arr[i]);
        }
        int j=0;
        for (int x : sets) {
            arr[j++]=x;
        }
        int k=sets.size();
        return k;
    }
}
