class Solution {
    public void sortColors(int[] a) {
    int n = a.length - 1;
    int low = 0;
    int mid = 0;
    int high = n;
    while(mid<=high){
    if(a[mid]==0){
        int temp = a[low];
        a[low]=a[mid];
        a[mid]=temp;
        low++;
        mid++;
    }else if(a[mid]==1){
        mid++;
    }else{
        int temp = a[mid];
        a[mid] = a[high];
        a[high] = temp;
        high--;
    }}
        
    }
}