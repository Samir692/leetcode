class ProductOfArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];
        int prefixProduct = 1;
        for(int i = 0; i< nums.length; i++){
            output[i]  = prefixProduct;
            prefixProduct *= nums[i];
        }

        int postProduct = 1;
        for(int i = nums.length-1; i>-1; i--){
            output[i] *= postProduct;
            postProduct *= nums[i];
        }
        return output;
    }
}
