public class LeftRotatebyK {
    public static void main(String[] args) {
    int[] a={1,2,3,4,5,6};
    int n=a.length;
    int k=2;
    leftRotate(a,n,k);
}
public static void leftRotate(int[]a ,int n,int k ){
    int temp[]=new int[k];
    for(int i=0;i<k;i++){
        temp[i]=a[i];
    }
    for(int i=k;i<n;i++){
        a[i-k]=a[i];
    }
    for(int i=n-k;i<n;i++){
        a[i]=temp[i-n+k];
    }
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
}
}
