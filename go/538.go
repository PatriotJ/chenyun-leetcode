/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
var sum int

func convertBST(root *TreeNode) *TreeNode {
	if root == nil {
		return nil
	}
	sum = 0
	traverse(root)
	return root
}
func traverse(root *TreeNode) {
	if root != nil {
		traverse(root.Right)
		sum = sum + root.Val
		root.Val = sum
		traverse(root.Left)
	}
	// return root
}