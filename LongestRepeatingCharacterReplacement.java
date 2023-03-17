class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        char[] s_char = s.toCharArray();
        Map<Character, Integer> count = new HashMap<>();
        int res = 0, left = 0;

        for(int right = 0; right < s_char.length; right++){
            count.merge(s_char[right], 1, Integer::sum);
            while((right-left+1 - Collections.max(count.values())) > k){
                count.merge(s_char[left], 1, (oldValue, one) -> oldValue - 1);
                left += 1;
            }
            res = Math.max(res, right-left+1);
        }
        return res;
    }
}
