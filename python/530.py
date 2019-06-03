# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def getMinimumDifference(self, root):

        """
        :type root: TreeNode
        :rtype: int
        """
        # self.ans = float("inf")
        # self.val = None
        # def inorder(root):
        #     if root == None:
        #         return
        #     inorder(root.left)
        #     if self.val is not None:
        #         self.ans = min(self.ans, abs(root.val - self.val))
        #     self.val = root.val
        #     inorder(root.right)
        # inorder(root)
        # return self.ans
        self.mini = 2 ** 31
        self.pre = -1

        def inorder(root):
            if root == None:
                return self.mini
            inorder(root.left)

            if self.pre != -1:
                self.mini = min(self.mini,abs(root.val - self.pre))
            self.pre = root.val
            inorder(root.right)
            return self.mini
        inorder(root)
        return self.mini
