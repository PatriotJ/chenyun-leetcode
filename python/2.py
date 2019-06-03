# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        lst = []
        digit = 0
        while(l1 != None and l2 != None) :
            x = (l1.val + l2.val+digit)%10
            digit = (l1.val+l2.val+digit)//10
            l1 = l1.next
            l2 = l2.next
            lst.append(x)
        if  l1 == None:
            while l2 != None:
                x = (l2.val+digit)%10
                digit = (l2.val+digit)//10
                l2 = l2.next
                lst.append(x)
        elif l2 == None:
            while l1 != None:
                x = (l1.val+digit)%10
                digit = (l1.val+digit)//10
                l1 = l1.next
                lst.append(x)
        if digit:
            lst.append(digit)
        return lst
