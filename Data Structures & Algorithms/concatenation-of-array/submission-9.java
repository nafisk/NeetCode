class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < nums.length(); j++) {
                ans.add(nums[j]);
            }
        }
        
        return ans;
    }
}