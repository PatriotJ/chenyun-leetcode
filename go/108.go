/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func sortedArrayToBST(nums []int) *TreeNode {
	if len(nums) == 0 {
		return nil
	}
	l := len(nums) / 2
	root := &TreeNode{nums[l], nil, nil}
	root.Left = sortedArrayToBST(nums[:l])
	root.Right = sortedArrayToBST(nums[l+1:])
	return root
}