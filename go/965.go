/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func isUnivalTree(root *TreeNode) bool {
	if root == nil {
		return true
	} else if root.Left == nil && root.Right == nil {
		return true
	} else if root.Left == nil {
		return root.Val == root.Right.Val && isUnivalTree(root.Right)
	} else if root.Right == nil {
		return root.Val == root.Left.Val && isUnivalTree(root.Left)
	} else {
		return root.Val == root.Right.Val && isUnivalTree(root.Right) && root.Val == root.Left.Val && isUnivalTree(root.Left)
	}
}