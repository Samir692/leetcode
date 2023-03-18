class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()){
            return false;
        }
        char[] s1_char = s1.toCharArray();
        char[] s2_char = s2.toCharArray();

        int[] count_s1 = new int[26];
        int[] count_s2 = new int[26];

        int matches = 0, index = 0, left = 0;;

        for(int i = 0; i < s1.length(); i++){
            count_s1[s1_char[i] - 'a'] += 1;
            count_s2[s2_char[i] - 'a'] += 1;
        }


        for(int i = 0; i < 26; i++){
            if(count_s1[i] == count_s2[i]){
                matches += 1;
            } 
        }

        
        for(int right = s1.length(); right < s2.length(); right++){
            if(matches == 26){return true;}

            index = s2_char[right] - 'a';
            count_s2[index] += 1;
            if(count_s1[index] == count_s2[index]){
                matches += 1;
            }
            else if(count_s1[index] + 1 == count_s2[index]){
                matches -= 1;
            }

            index = s2_char[left] - 'a';
            count_s2[index] -= 1;
            if(count_s1[index] == count_s2[index]){
                matches += 1;
            }
            else if(count_s1[index] - 1 == count_s2[index]){
                matches -= 1;
            }
            left += 1;
        }
        return matches == 26;
    }
}
