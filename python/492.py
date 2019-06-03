import math
class Solution:
    def constructRectangle(self, area):
        """
        :type area: int
        :rtype: List[int]
        """
        a = int(math.sqrt(area))
        if a * a == area:
            return [a,a]
        width = a
        while area % width != 0:
            width -=1
        return area//width,width
