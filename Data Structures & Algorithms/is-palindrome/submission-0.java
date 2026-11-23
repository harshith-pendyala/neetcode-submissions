class Solution {
    public boolean isPalindrome(String s) {
        if(s == null) return false;
        String clear = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int l=0, r = clear.length() - 1;
        while(l<r){
            if(clear.charAt(l) != clear.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
