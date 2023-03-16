class LongestSubStringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }

        int res = 0, left = 0;
        Set<Character> subSet = new HashSet<>();
        char[] s_char = s.toCharArray();

        for(char s_c : s_char){
            while(subSet.contains(s_c)){
                subSet.remove(s_char[left]);
                left += 1;
            }
            subSet.add(s_c);
            res = Math.max(res, subSet.size());
        }
        return res;
    }
}
