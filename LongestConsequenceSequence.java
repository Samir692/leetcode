class LongestConsequenceSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();

        for(int num : nums){
            numSet.add(num);
        }
        int longest = 0;
        int length = 0;

        for(int num : nums){
            if(!numSet.contains(num-1)){
                length = 0;
                while(numSet.contains(num+length)){
                    length+=1;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}c
