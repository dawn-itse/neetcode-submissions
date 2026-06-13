class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 1; 
        for (int i = 0; i < n; i++) {
            result[i] = left;   
            left = left * nums[i];
        }
        int post = 1; 
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * post; 
            post = post * nums[i];        
        }
        return result;
    }
}