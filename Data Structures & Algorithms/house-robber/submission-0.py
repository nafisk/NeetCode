class Solution:
    def rob(self, nums: List[int]) -> int:
        '''
            - do we skip 1 or can we skip any to find a better match so that
                adjacent rule doesnt kill our profits
            - intention
                - either take the current one or skip it
                - max(current, dfs(i+1))
                - memo results from respective indices and return the result

            nums = [2,9,8,3,6]
            Output: 16

            nums = [2,20,8,3,6]
            Output: 

            memo = {}
            dfs(i, prev):
                check for bounds:
                    return
                if i in memo: return memo[i]
                memo[i] = prev + max(nums[i], dfs(num[i], i+1))
                return memo[i]
        '''
        memo = {}

        def dfs(i):
            if i >= len(nums):
                return 0
            if i in memo:
                return memo[i]
            
            memo[i] = max(nums[i] + dfs(i + 2), dfs(i+1))
            return memo[i]

        return dfs(0)