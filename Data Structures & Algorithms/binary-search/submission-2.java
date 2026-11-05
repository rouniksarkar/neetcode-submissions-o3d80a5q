class Solution {
    public int search(int[] nums, int target) {
        int f=0;
        int l=nums.length-1;
        while(f<=l){
            int mid=(f+l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                f=mid+1;
            }
            else{
                l=mid-1;
            }
        }
        return -1;
    }
}
