class MinimumWindowSubstring {
    public String minWindow(String s, String t) {

        if(t.length() == 0){
            return "";
        }

        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        char[] s_c = s.toCharArray();
        char[] t_c = t.toCharArray();

        for(char c : t_c){
            if(countT.containsKey(c)){
                countT.merge(c, 1, Integer::sum);
            }
            else{
                countT.put(c, 0);
            }
        }

        int have = 0, need = countT.size();

        int[] res = new int[2];
        int resLen = s_c.length+1, l = 0;

        for(int r = 0; r < s_c.length; r++){
            char s_item = s_c[r];

            if(window.containsKey(s_item)){
                window.merge(s_item, 1, Integer::sum);
            }
            else{
                window.put(s_item, 0);
            }

            if(countT.containsKey(s_item) && window.get(s_item).equals(countT.get(s_item))){
                have += 1;
            }
            
            while (have == need){
                //update result
                if ((r-l+1) < resLen){
                    res[0] = l;
                    res[1] = r;
                    resLen = (r-l+1);
                }

                //pop left from window
                window.merge(s_c[l], 1, (oldValue, newValue) -> oldValue - newValue );

                if(countT.containsKey(s_c[l]) && window.get(s_c[l]) < countT.get(s_c[l])){
                    have -= 1;
                }
                l += 1;
            }
        }


        if(resLen > s_c.length){
            return "";
        }
        String finalString = "";
        for(int i = res[0]; i <= res[1]; i++){
            finalString += s_c[i];
        }
        return finalString;
    }
}
