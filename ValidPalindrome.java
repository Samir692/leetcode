class ValidPalindrome {

    private boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public boolean isPalindrome(String s) {
        int size_str = s.length();
        if(size_str== 0 || size_str == 1) {
            return true;
        }
        if(s == null) {
            return false;
        }

 
        char[] s_char = s.toCharArray();
        size_str = s_char.length;
        int left = 0;
        int right = size_str-1;

        while(left<right) {

            while(left < right && !isAlphaNumeric(s_char[left])){
                left++;
            }
            while(left < right && !isAlphaNumeric(s_char[right])){
                right--;
            }
            if(Character.toLowerCase(s_char[left]) != Character.toLowerCase(s_char[right])){
                return false;
            }
            left++;
            right--;
        }

        return true;

    }
}
