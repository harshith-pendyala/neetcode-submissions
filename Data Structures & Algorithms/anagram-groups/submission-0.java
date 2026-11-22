class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mapSorted = new HashMap<>();
        for(String str: strs){
            // String sorted = sortString(str);
            int[] count = new int[26];
            for(char c: str.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            mapSorted.putIfAbsent(key,new ArrayList<>());
            mapSorted.get(key).add(str);
        }
    return new ArrayList<>(mapSorted.values());
    }

    // public String sortString(String s){
    //     char[] arr = s.toCharArray();
    //     Arrays.sort(arr);
    //     return new String(arr);
    // }
}
