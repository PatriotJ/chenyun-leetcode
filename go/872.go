/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func leafSimilar(root1 *TreeNode, root2 *TreeNode) bool {
	leaf1 := make([]int, 0)
	leaf2 := make([]int, 0)
	dfs(root1, &leaf1)
	dfs(root2, &leaf2)
	if len(leaf1) != len(leaf2) {
		return false
	}
	for i := 0; i < len(leaf1); i++ {
		if leaf1[i] != leaf2[i] {
			return false
		}
	}
	return true
}
func dfs(node *TreeNode, leaf *([]int)) {
	if node == nil {
		return
	}
	if node.Left == nil && node.Right == nil {
		*leaf = append(*leaf, node.Val)
	}
	dfs(node.Left, leaf)
	dfs(node.Right, leaf)
}