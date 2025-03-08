public class ArraySortedOrNotBrute{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        boolean res=isSorted(arr,n);
        System.out.println("The arrays is sorted or not : "+res);
    }
    private static boolean isSorted(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }
        return true;
    }
}