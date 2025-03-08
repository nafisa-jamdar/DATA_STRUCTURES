//time complexity is O(N)
//Space complexity is O(1)

public class SecSmallSecLargeBetter {
    public static void main(String[] args) {
        int[] arr={2,43,1,34,65,122};
        int n=arr.length;
        findTheAns(arr,n);
    }
    static void  findTheAns(int[] arr,int n){
        if(n==0||n==1){
           System.out.println(-1);
        }
        int small=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            small=Math.min(small,arr[i]);
            large=Math.max(large,arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]<second_small&&arr[i]!=small){
                second_small=arr[i];
            }
            if(arr[i]>second_large&&arr[i]!=large){
                second_large=arr[i];
            }
    }
    System.out.println("Second smallest is "+second_small);
    System.out.println("Second Largest is "+second_large);

}
}