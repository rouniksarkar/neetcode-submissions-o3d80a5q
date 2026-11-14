class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for(int i:nums){
            if(i ==0){
                maxCount = Math.max(count,maxCount);
                count = 0;
            }
            else{
                count++;
            }
        }
        return Math.max(count,maxCount);
    }
}