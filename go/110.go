/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
var flag = true

func isBalanced(root *TreeNode) bool {
	if root == nil {
		return true
	}
	_, b := helper(root)
	return b
}

func helper(node *TreeNode) (int, bool) {
	if node == nil {
		return 0, true
	}
	left, b1 := helper(node.Left)
	right, b2 := helper(node.Right)
	b := b1 && b2
	if left-right > 1 || right-left > 1 {
		b = false
	}
	return max(left, right) + 1, b
}

func max(i, j int) int {
	if i > j {
		return i
	}
	return j
}