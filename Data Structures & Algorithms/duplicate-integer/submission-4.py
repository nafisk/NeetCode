class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        freq = collections.defaultdict(int)
        
        for i in nums:
            freq[i] += 1
            if freq[i] > 1:
                return True
            
        return False
