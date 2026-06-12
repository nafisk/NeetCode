class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < nums.length; j++) {
                ans[i * nums.length + j] = nums[j];
            }
        }
        
        return ans;
    }
}