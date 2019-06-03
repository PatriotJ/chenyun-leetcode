/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
var sum int

func findTilt(root *TreeNode) int {
	sum = 0
	dfs(root)
	return sum
}

func dfs(root *TreeNode) int {
	if root == nil {
		return 0
	}
	left := dfs(root.Left)
	right := dfs(root.Right)
	if left > right {
		sum += left - right
	} else {
		sum += right - left
	}
	return left + right + root.Val
}