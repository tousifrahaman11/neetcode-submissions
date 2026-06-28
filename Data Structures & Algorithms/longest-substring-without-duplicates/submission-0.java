class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int l = 0, r = 0;
        for(int i = 0; i<s.length();i++){
            while(st.contains(s.charAt(i))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(i));
            r = Math.max(r, i-l+1);
        }
        return r;
    }
}
