class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort(reverse = True)
        lo,hi = 0,len(people)-1
        # boats = 0
        while lo <= hi:
            # if lo == hi:
            #     boats += 1
            if people[lo] >= limit:
                lo += 1
                # boats += 1
                continue
            else:
                if people[lo] + people[hi] > limit:
                    lo += 1
                    # boats += 1
                    continue
                else:
                    lo += 1
                    # boats += 1
                    hi -= 1
        return lo