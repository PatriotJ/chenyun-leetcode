/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func constructMaximumBinaryTree(nums []int) *TreeNode {
	return cons(nums, 0, len(nums))
}

func cons(nums []int, l int, r int) *TreeNode {
	if l == r {
		return nil
	}
	max := max(nums, l, r)
	root := &TreeNode{Val: nums[max]}
	root.Left = cons(nums, l, max)
	root.Right = cons(nums, max+1, r)
	return root
}

func max(nums []int, l int, r int) int {
	id := l
	for i := l; i < r; i++ {
		if nums[id] < nums[i] {
			id = i
		}
	}
	return id
}