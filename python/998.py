# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def insertIntoMaxTree(self, root: TreeNode, val: int) -> TreeNode:
        if root == None:
            return TreeNode(val)
        else:
            if root.val < val:
                node = TreeNode(val)
                node.left = root
                return node
            else:
                root.right = self.insertIntoMaxTree(root.right,val)
                return root