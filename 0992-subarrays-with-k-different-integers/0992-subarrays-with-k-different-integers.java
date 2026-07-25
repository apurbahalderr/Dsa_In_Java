class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return cnt(nums,k) - cnt(nums,k-1);
    }
    private int cnt(int[] nums,int k){
        int n = nums.length;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int l =0,r=0;
        while(r<n){
            int x = nums[r];
            map.put(x,map.getOrDefault(x, 0) + 1);
            while(map.size()>k){
                int ap = nums[l];
                map.put(ap,map.get(ap)-1);
                if(map.get(ap) == 0){
                    map.remove(ap);
                }
                l++;
            }
            count += r-l+1;
            r++;
        }
        return count;
    }
}