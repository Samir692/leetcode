class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        int difference = 0;
        Map<Integer, Integer> sumArray = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            difference = target - nums[i];
            if(sumArray.containsKey(difference)){
                return new int[]{i, sumArray.get(difference)};
            }
            else{
                sumArray.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
