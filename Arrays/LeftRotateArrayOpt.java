public class LeftRotateArrayOpt {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int n=a.length;
        RotateByOne(a,n);
    }
    private static void RotateByOne(int[] a,int n){
        int temp=a[0];
        for(int i=0;i<n-1;i++){
            a[i]=a[i+1];
        }
        a[n-1]=temp;
        System.out.println("Sorted array is ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
