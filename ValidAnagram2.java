import java.util.*;

class ValidAnagram2 {
    public boolean isAnagram(String s, String t) {

        if(s.isEmpty() && t.isEmpty()){
            return true;
        }
        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();
        Arrays.sort(s_char);
        Arrays.sort(t_char);
        return String.valueOf(s_char).equals(String.valueOf(t_char));  
    }
}
