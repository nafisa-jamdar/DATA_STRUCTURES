public class LeftRotateArrayBrute {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int n=a.length;
        RotateByOne(a,n);
    }
    static void RotateByOne(int[] a,int n){
        int[] temp=new int[n];
        for(int i=1;i<n;i++){
            temp[i-1]=a[i];
        }
        temp[n-1]=a[0];
        System.out.println("Rotated array is ");
        for(int i=0;i<n;i++){
            System.out.print(temp[i]);
        }
    }
}
