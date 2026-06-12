class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans = []
        nums_lens = len(nums)
        for i in range(nums_lens * 2):
            ans.append(nums[i % nums_lens])

        return ans
        