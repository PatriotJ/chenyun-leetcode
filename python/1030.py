class Solution:
    def allCellsDistOrder(self, R: int, C: int, r0: int, c0: int) -> List[List[int]]:
        ans = []
        d = collections.defaultdict(list)
        for i in range(R):
            for j in range(C):
                dist = abs(i-r0)+abs(j-c0)
                d[dist].append([i,j])
                # print(d[dist])
                # ans.append([i,j])
        for x in sorted(d.keys()):
            for l in d[x]:
                ans.append(l)
        return ans