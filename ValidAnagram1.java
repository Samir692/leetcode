import java.util.*;

class ValidAnagram1 {
    public boolean isAnagram(String s, String t) {

        if(s.isEmpty() && t.isEmpty()){
            return true;
        }
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> repet_s = new HashMap<>();
        Map<Character, Integer> repet_t = new HashMap<>();

        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();

        for(int i = 0; i< s.length(); i++){
            if(repet_s.containsKey(s_char[i])){
                repet_s.merge(s_char[i], 1, Integer::sum);
            }
            else{
                repet_s.put(s_char[i], 1);
            }
            if(repet_t.containsKey(t_char[i])){
                repet_t.merge(t_char[i], 1, Integer::sum);
            }
            else{
                repet_t.put(t_char[i], 1);
            }
        }

        for(char s_item : s_char){
            if(!repet_s.get(s_item).equals(repet_t.get(s_item))){
                return false;
            }
        }
        return true;       
    }
}
