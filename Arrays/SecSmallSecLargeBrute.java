//Time complexity---O(NlogN)
//Space complexity---O(1)
import java.util.*;
public class SecSmallSecLargeBrute {
    public static void main(String[] args) {
        int arr[]={1,3,2,4,9};
        int n=arr.length;
        findResult(arr,n);
    }
    static void findResult(int[] array, int n){
        if(n==0||n==1){
            System.out.println(-1);
            System.out.println();
            System.out.println(-1);
            System.out.println();
        }
        //sorting entire array
        Arrays.sort(array);
        System.out.println("Second smallest is "+array[1]);
        System.out.println("Second largest is "+array[n-2]);
    }
}
