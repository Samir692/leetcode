class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1){
            return nums;
        }

        Map<Integer, Integer> repet = new HashMap<>();
        List<Integer> count[] = new ArrayList[nums.length + 1];
        int[] res = new int[k];

        for(int num : nums){
           repet.merge(num, 1, Integer::sum);
        }
        
        for (int key : repet.keySet()){
            int freq = repet.get(key);
            if(count[freq] == null)
                count[freq] = new ArrayList<>();
            count[freq].add(key);
        }
    
        int index = 0;
        for(int i = nums.length; i>=0; i--){
            if(count[i] != null){
                for (int val : count[i]){
                    res[index++] = val;
                    if(index == k)
                        return res;
                }
            }
        
        }

    return res;
    }
}
