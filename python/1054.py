class Solution:
    def rearrangeBarcodes(self, barcodes: List[int]) -> List[int]:
        ans = [0]*len(barcodes)
        cnt = sorted(collections.Counter(barcodes).items(),key = lambda x:x[1])
        # print(cnt)
        ref = [val for val,ct in cnt for _ in range(ct)]
        # print(ref)
        for i in range(0,len(barcodes),2):
            ans[i] = ref.pop()
        for i in range(1,len(barcodes),2):
            ans[i] = ref.pop()
        return ans