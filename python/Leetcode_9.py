class Solution:
    def isPalindrome(self, x: int) -> bool:
        re_num= 0
        original= x
        if x < 0:
            return False
        if x <10:
            return True
        while x > 0:
            re_num= re_num * 10 + x%10
            x= x//10
        return re_num == original