class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1, right = 1;
        for(int p : piles){
            right = Math.max(right, p);
        }

        int res = right;

        while(left <= right){
            int k = (left+right)/2;
            int hours = 0;

            for(int p : piles){
                hours += Math.ceil((double)p / k); 
            }

            if(hours <= h){
                right = k-1;
                res = Math.min(res, k);
            }
            else{
                left = k + 1;
            }
        }
        return res;
    }
}
