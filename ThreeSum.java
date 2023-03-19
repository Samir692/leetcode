class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int target = 0, left = 0, right = nums.length-1;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int twoSum = target - nums[i];
            left = i+1;
            right = nums.length-1;
            while(left < right){
                if(nums[left] + nums[right] < twoSum){
                    left++;
                }
                else if(nums[left] + nums[right] > twoSum){
                    right--;
                }
                else{
                    result.add(new ArrayList<>(
                        Arrays.asList(nums[i], nums[left], nums[right])));
                    left+=1;

                    while(nums[left] == nums[left-1] && left < right){
                        left+=1;
                    }
                }
            }
        }
        return result;
    }
}
