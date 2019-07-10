/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func minDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}

	return helper(root)
}
func helper(root *TreeNode) int {
	if root == nil {
		return int(^uint(0) >> 1)
	}
	if root.Left == nil && root.Right == nil {
		return 1
	}
	left := helper(root.Left)
	right := helper(root.Right)

	return 1 + min(left, right)
}
func min(i, j int) int {
	if i < j {
		return i
	}
	return j
}
