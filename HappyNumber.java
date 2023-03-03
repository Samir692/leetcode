import java.util.*; 

class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> visitSet = new HashSet<>();

        while (!visitSet.contains(n)){
            visitSet.add(n);
            n = sumOfSquares(n);

            if(n == 1){
                return true;
            }

        }
        return false;
    }

    private int sumOfSquares(int n){
        int output = 0;
        int digit = 0;
        while(n>0){
            digit = n%10;
            digit *= digit;
            output+=digit;
            n /= 10;
        }
        return output;
    }
}
