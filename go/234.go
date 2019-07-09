/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func isPalindrome(head *ListNode) bool {
	var slow = head
	var fast = head
	for fast != nil && fast.Next != nil {
		slow = slow.Next
		fast = fast.Next.Next
	}
	if fast != nil {
		slow = slow.Next
	}

	slow = reverseList(slow)
	fast = head
	for slow != nil && fast != nil {
		if slow.Val != fast.Val {
			return false
		}
		slow = slow.Next
		fast = fast.Next
	}
	return true
}
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
