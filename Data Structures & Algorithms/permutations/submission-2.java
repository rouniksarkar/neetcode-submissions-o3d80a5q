class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> op= new ArrayList<>();
        List<Integer> ip= new ArrayList<>();
        backtrack(nums,ip,op,new boolean[nums.length]);
        return op;
    }

    public void backtrack(int[] nums,List<Integer> ip,List<List<Integer>> op,boolean[] used){
        if(ip.size()==nums.length){
            op.add(new ArrayList<>(ip));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            used[i]=true;
            ip.add(nums[i]);
            backtrack(nums,ip,op,used);
            ip.remove(ip.size()-1);
            used[i]=false;
        }
    }
}
