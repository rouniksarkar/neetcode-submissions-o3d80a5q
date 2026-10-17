class Solution {
    public int minimumDifference(int[] nums, int k) {
        int count=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-k;i++){
            count=Math.min(count,nums[k+i-1]-nums[i]);
        }
        return count;
    }
}