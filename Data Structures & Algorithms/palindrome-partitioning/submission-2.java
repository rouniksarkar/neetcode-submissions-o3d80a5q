class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> op= new ArrayList<>();
        List<String> ip= new ArrayList<>();
        backTrack(s,ip,op,0);
        return op;
    }
    public void backTrack(String s,List<String> ip,List<List<String>> op,int i){
        if(s.length()<=i){
            op.add(new ArrayList<>(ip));
            return;
        }

        for(int k=i;k<s.length();k++){
            if(validPalindrom(s,i,k)){
                ip.add(s.substring(i,k+1));
                backTrack(s,ip,op,k+1);
                ip.remove(ip.size()-1);
            }
        }
    }
    public boolean validPalindrom(String s, int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
