/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func sumRootToLeaf(root *TreeNode) int {
	return sumRoot(root, 0)
}

func sumRoot(root *TreeNode, cur int) int {
	sum := 0
	if root == nil {
		return 0
	}
	cur = cur*2 + root.Val
	if root.Left == nil && root.Right == nil {
		return cur
	}
	if root.Left != nil {
		sum += sumRoot(root.Left, cur)
	}
	if root.Right != nil {
		sum += sumRoot(root.Right, cur)
	}
	return sum

}