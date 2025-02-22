//Brute Force Approach
class Solution {
public static int largest(int[] arr) {
Arrays.sort(arr);
return arr[arr.length-1];
}
}
/*Time-complexity: O(nlogn)
  Space-complexity:O(1)*/

//Recursive Approach
class Solution{
public static void findMax(int arr[]){
  int max=arr[0];
  for(int i=1;i<arr.length;i++){
    if(arr[i]>max)
      max=arr[i];
  }
  return max;
}}
/*Time complexity:O(n)
  Space complexity:O(1)*/
