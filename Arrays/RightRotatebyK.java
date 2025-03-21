public class RightRotatebyK {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int n=a.length;
        int k=2;
        rightRotate(a,n,k);
    }
    public static void rightRotate(int[] a,int n,int k){
        int temp[]=new int[k];
        for(int i=n-k;i<n;i++){
            temp[i-n+k]=a[i];
        }
        for(int i=n-k-1;i>=0;i--){
            a[i+k]=a[i];
        }
        for(int i=0;i<k;i++){
            a[i]=temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
