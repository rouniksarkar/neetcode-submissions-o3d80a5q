class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s:strs){
            int[] idx = new int[26];
            for(char c: s.toCharArray()){
                idx[c-'a']++;
            }

            String key = Arrays.toString(idx);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }

            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
