/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func mergeTwoLists(l1 *ListNode, l2 *ListNode) *ListNode {
	if l1 == nil && l2 == nil {
		return nil
	}
	if l1 == nil {
		return l2
	}
	if l2 == nil {
		return l1
	}
	cur := &ListNode{Val: 0}
	if l1.Val < l2.Val {
		cur.Next = l1
		cur.Next.Next = mergeTwoLists(l1.Next, l2)
	} else {
		cur.Next = l2
		cur.Next.Next = mergeTwoLists(l2.Next, l1)
	}
	return cur.Next

}