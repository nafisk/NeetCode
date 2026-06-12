class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # have to have the same chars
        # iterate once to get all chars and put count in a map
        # return true if map same for both


        if len(s) != len(t):
            return False
        
        map_s = collections.defaultdict(int)
        map_t = collections.defaultdict(int)
        for i in range(len(s)):
            map_s[s[i]] += 1
            map_t[t[i]] += 1
        
        return True if map_s == map_t else False