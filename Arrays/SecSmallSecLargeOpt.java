//Time complexity is O(n) [single traversal]
//Space complexity is O(1)
public class SecSmallSecLargeOpt {
    public static void main(String[] args) {
        int arr[]={1,3,2,4,9};
        int n=arr.length;
        int res1=findSecSmall(arr,n);
        int res2=findSecLarge(arr,n);
        System.out.println("Second small  is "+res1);
        System.out.println("Second large  is "+res2);
    }
    private static int findSecSmall(int[] arr, int n){
        int small=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<small){
                second_small=small;
                small=arr[i];
            }
            else if(arr[i]<second_small&&arr[i]!=small){
                second_small=arr[i];
            }
        }
        return second_small;
    }
    private static int findSecLarge(int[] arr,int n){
        int large=Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                second_large=large;
                large=arr[i];
            }
            else if(arr[i]<second_large&&arr[i]!=large){
                second_large=arr[i];
            }
        }
        return second_large;
    }
}
