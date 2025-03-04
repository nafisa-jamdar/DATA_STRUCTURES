import java.util.*;
public class LargestElementInArray {
    public static void main(String[] args){
        int arr1[]={12,3,21,46};
        int arr2[]={2,3,98,12};
        System.out.println("Max ele in arr1 is "+findLarge(arr1));
        System.out.println("Max ele in arr2 is "+findLarge(arr2));
    }
    static int findLarge(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
