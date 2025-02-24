//Brute-force approach
for(int i=0;i<n-1;i++){
for(int j=0;j<n-i-1;j++){
if(arr[j]>arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
/*Time complexity=O(n²)
Space complexity=O(1)*/

//Optimal approach
void bubbleSortOptimized(int arr[], int n) {
bool swapped;  // Flag to track if any swaps occurred
for (int i = 0; i < n - 1; i++) {
swapped = false;  // Reset flag at the start of each pass
for (int j = 0; j < n - i - 1; j++) {
if (arr[j] > arr[j + 1]) {
swap(arr[j], arr[j + 1]);
swapped = true;  // Swap happened, so array is not sorted yet
}
}
if (!swapped) break;  // If no swaps, exit early (array is sorted)
}
}
/*TIme complexity=O(n)
  Space complexity=O(1)*/
