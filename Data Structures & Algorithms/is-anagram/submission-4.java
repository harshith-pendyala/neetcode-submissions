class Solution {
    public boolean isAnagram(String s, String t) {
        String sortedA = sortChar(s);
        String sortedB = sortChar(t);
        return sortedA.equals(sortedB);
    }
    public String sortChar(String a){
        char[] charArray = a.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
