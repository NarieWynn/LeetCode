class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs: 
            return ""
        for i in range (1, len(strs)):
            while strs[i].find(strs[0]) != 0:
                strs[0]= strs[0][:-1]  
                if not strs[0]: 
                    return ""
        return strs[0]