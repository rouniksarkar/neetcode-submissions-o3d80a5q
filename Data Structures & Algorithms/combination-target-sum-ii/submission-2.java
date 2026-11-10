class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> op= new ArrayList<>();
        List<Integer> ip= new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,target,ip,op,0,0);
        return op;
    }
    public void backtrack(int[] arr, int target,List<Integer> ip, List<List<Integer>> op,int i,int total){
        if(target==total){
            op.add(new ArrayList<>(ip));
            return;
        }
        if(total>target || i==arr.length){
            return;
        }

        ip.add(arr[i]);
        backtrack(arr,target,ip,op,i+1,total+arr[i]);
        ip.remove(ip.size()-1);

        while(i+1<arr.length && arr[i]==arr[i+1]){
            i++;
        }
        backtrack(arr,target,ip,op,i+1,total);
    }
}
