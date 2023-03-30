class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
    
        dfs(0, result, subset, candidates, 0, target);
        return result;
        
    }

      void dfs(int i, List<List<Integer>> result, List<Integer> subset, int[] nums, int total, int target){

            if(i >= nums.length || total > target){
                return;
            }

            if(total == target) {
                result.add(new ArrayList<>(subset));
                return;
            }

            subset.add(nums[i]);
            dfs(i, result, subset, nums, total + nums[i], target);

            subset.remove(subset.size()-1);
            dfs(i+1, result, subset, nums, total, target);
        }
}
