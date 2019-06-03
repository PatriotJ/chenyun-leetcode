# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def findMode(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        self.curV = 0
        self.currCount = 0
        self.maxC = 0
        self.modeCount = 0
        self.mode = []

        def inorder(root):
            if root == None:
                return
            inorder(root.left)
            handleV(root.val)
            inorder(root.right)

        def handleV(val):
            if val != self.curV:
                self.curV = val
                self.currCount = 0

            self.currCount += 1

            if self.currCount > self.maxC:
                self.maxC = self.currCount
                self.modeCount = 1
            elif self.currCount == self.maxC:
                if self.mode :
                    self.mode[self.modeCount] = self.curV
                self.modeCount += 1

        inorder(root)
        self.mode = [0] * self.modeCount
        self.modeCount = self.currCount = 0
        inorder(root)
        return self.mode
