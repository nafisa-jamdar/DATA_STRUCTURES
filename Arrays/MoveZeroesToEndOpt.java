public class MoveZeroesToEndOpt {
    public static void main(String[] args){
        int[] arr={1,0,2,1,0,1};
        int n=arr.length;
        MoveZero(arr);
        for(int i=0;i<n;i++){
            System.err.print(arr[i]);
        }
    }
    public static void MoveZero(int[] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<arr.length;i++){
            if (arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}
