class Solution:
    def shipWithinDays(self, weights: List[int], D: int) -> int:
        
        def validCap(n,D,weights):
            # print(n)
            m = 1
            cap = 0
            for i in range(len(weights)):
                if cap + weights[i] > n:
                    m += 1
                    cap = weights[i]
                else:
                    cap += weights[i]
                
            print(n,m)
            return m <= D
        lo = max(weights)
        hi = sum(weights)
        while lo < hi:
            mid = (lo+hi)//2
            if validCap(mid,D,weights):
                hi = mid
            else:
                lo = mid + 1
        return lo