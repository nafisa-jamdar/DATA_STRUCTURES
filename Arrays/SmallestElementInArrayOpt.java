class SmallestElementInArrayOpt{
    public static void main(String[]args){
        int arr1[]={2,1,4,7,0};
        int arr2[]={12,4,7,1,54};
        System.out.println("Small in arr1 is "+sortFunc(arr1));
        System.out.println("Small in arr2 is "+sortFunc(arr2));
    }
    static int sortFunc(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return  min;
    }
}