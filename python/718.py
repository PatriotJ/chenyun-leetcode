class Solution:
    def findLength(self, A: List[int], B: List[int]) -> int:
        l = len(A)
        m = [[0]*(l+1) for i in range(l+1)]
        mx = 0
        for i in range(l):
            for j in range(l):
                if A[i] == B[j]:
                    m[i+1][j+1] = m[i][j] + 1
                    mx = max(m[i+1][j+1],mx)
                # else:
                #     m[i+1][j+1] = max(m[i][j+1],m[i+1][j])
        # print(m)
        return mx