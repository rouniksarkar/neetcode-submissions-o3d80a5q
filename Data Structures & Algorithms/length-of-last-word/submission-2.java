class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        int val = 0;
        while(s.charAt(n)==' '){
            n--;
        }
        while(n>=0 && s.charAt(n)!= ' '){
            n--;
            val++;
        }
        return val;
    }
}