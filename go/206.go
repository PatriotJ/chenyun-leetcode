/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func reverseList(head *ListNode) *ListNode {
	if head == nil {
		return head
	}
	cur := head
	var prev *ListNode
	prev = nil
	for cur != nil {
		temp := cur
		cur = cur.Next
		temp.Next = prev
		prev = temp
	}
	return prev

}