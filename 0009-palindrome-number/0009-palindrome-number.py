class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False

        temp = x
        rev = 0

        while x > 0:
            ld = x % 10
            rev = (rev * 10) + ld
            x = x // 10

        if temp == rev:
            return True

        return False