public class RemovDupArrayOpt {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3};
        int n=arr.length;
        int k=RemoveDup(arr,n);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]);
        }
    }
    private static int RemoveDup(int[] arr, int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
