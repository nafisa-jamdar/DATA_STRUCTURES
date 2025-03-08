public class ArraySortedOrNotOpt {
    public static void main(String[] args) {
    int arr[]={1,2,3,14,5};
    int n=arr.length;
    boolean res=isSorted(arr,n);
    System.out.println("The arrays is sorted or not : "+res);
}
private static boolean isSorted(int[] arr,int n){
    for(int i=1;i<n;i++){
        if(arr[i]<arr[i-1]){
            return false;
        }
    }
    return true;
}
}