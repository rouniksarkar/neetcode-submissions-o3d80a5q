class Solution {
    public int[] dp=new int[101];
    public int rob(int[] nums) {
       if(nums.length==0){
        return 0;
       } 
       Arrays.fill(dp,-1);
       return dfs(nums,0);
    }

    public int dfs(int[] nums, int n){
        if(n>=nums.length){
            return 0;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]=Math.max(nums[n]+dfs(nums,n+2),dfs(nums,n+1));
        return dp[n];
    }
}
