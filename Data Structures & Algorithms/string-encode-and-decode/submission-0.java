class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            int len = str.length();
            sb.append(len).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int n = str.length();
        while(i < n){
            int hashIndex = str.indexOf('#',i);

            if(hashIndex == -1){
                break;
            }
            
            int len = Integer.parseInt(str.substring(i,hashIndex));
            int start = hashIndex + 1;
            int end = start + len;

            String extracted = str.substring(start,end);
            result.add(extracted);

            i = end;

        }
        return result;
    }
}
