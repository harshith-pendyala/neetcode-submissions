class Solution {
    public boolean isAnagram(String s, String t) {
        String sortS = sorted(s);
        String sortT = sorted(t);
        return sortS.equals(sortT);
    }
    public String sorted(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
