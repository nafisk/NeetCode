class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        '''
            create empty array ans
            iterate len(nums) * 2 times
                copy ans[i] = nums[(i % len(nums))]
            return ans
        '''

        ans = []
        nums_lens = len(nums)
        for i in range(nums_lens * 2):
            ans.append(nums[i % nums_lens])

        return ans
        