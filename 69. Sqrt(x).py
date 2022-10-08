class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        
        if x < 2:
            return x
        
        start = 0
        end = x/2
        
        while (start <= end):
            
            mid = int((start + end) / 2)
            
            square = mid * mid
            
            if square == x:
                return mid
            
            if square > x:
                end = mid - 1
                
            else:
                start = mid + 1
                
        return end