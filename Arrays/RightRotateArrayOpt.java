public class RightRotateArrayOpt {
        public static void main(String[] args) {
            int[] a={1,2,3,4,5,6};
            int n=a.length;
            RotateByOne(a,n);
        }
        private static void RotateByOne(int[] a,int n){
            int temp=a[n-1];
            /*Elements should shift right, not overwrite previous values.
Fix the loop direction (iterate from right to left).*/

            for(int i=n-1;i>0;i--){
                a[i]=a[i-1];
            }
            a[0]=temp;
            System.out.println("Sorted array is ");
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
        }
    }
