# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def bstFromPreorder(self, preorder: List[int]) -> TreeNode:
        
        if not preorder:
            return None
        root = TreeNode(preorder[0])
        i = 1
        while i < len(preorder) and preorder[i] < preorder[0]:
            i += 1
        root.left = self.bstFromPreorder(preorder[1:i])
        root.right = self.bstFromPreorder(preorder[i:len(preorder)])
        return root

    # def bstFromPreorder(self, preorder: List[int]) -> TreeNode:
        
    #     if not preorder:
    #         return None
    #     l = len(preorder)
    #     root = TreeNode(preorder[0])
    #     stack = [root]
    #     for i in range(1,l):
    #         node,child = stack[-1],TreeNode(preorder[i])
    #         while stack and stack[-1].val < child.val:
    #             node = stack.pop()
    #         if node.val < child.val:
    #             node.right = child
    #         else:
    #             node.left = child
    #         stack.append(child)
    #     return root
