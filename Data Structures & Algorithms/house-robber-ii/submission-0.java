class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        return Math.max(dfs(nums,0,nums.length-2),dfs(nums,1,nums.length-1));
    }

    public int dfs(int[] nums,int start,int end){
        int prevMax=0;
        int curMax=0;

        for(int i=start ;i<=end;i++){
            int temp=Math.max(nums[i]+prevMax,curMax);
            prevMax = curMax;
            curMax = temp;
        }
        return curMax;
    }
}
