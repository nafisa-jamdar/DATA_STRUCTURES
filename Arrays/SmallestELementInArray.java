import java.util.*;
class SmallestElementInArray{
    public static void main(String[] args) {
       int arr1[]={1,2,3,0};
       int arr2[]={2,3,1,5};
       System.out.println("Small in arr1:"+sortFunc(arr1));
       System.out.println("Small in arr1:"+sortFunc(arr2));
    }
    static int sortFunc(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
}