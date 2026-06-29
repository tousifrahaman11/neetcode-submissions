class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> mp = new HashMap<>();

        int l = 0, r = 0;
        int mxf = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
            mxf = Math.max(mxf, mp.get(ch));
            while((i-l+1) - mxf >k){
                char lf = s.charAt(l);
                mp.put(lf, mp.get(lf)-1);
                l++;
            }
            r = Math.max(r, i-l+1);
        }
        return r;
    }
}
