# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        placeholder = 0
        newLinked = ListNode(0)
        curr = newLinked

        while l1 and l2:
            numSum = l1.val + l2.val + placeholder
            l1 = l1.next
            l2 = l2.next
            if numSum >= 10:
                placeholder = 1
                numSum -= 10
            else:
                placeholder = 0
            curr.next = ListNode(numSum)
            curr = curr.next

        if l1:
            while l1:
                numSum = l1.val + placeholder
                l1 = l1.next
                if numSum >= 10:
                    placeholder = 1
                    numSum -= 10
                else:
                    placeholder = 0
                curr.next = ListNode(numSum)
                curr = curr.next
        else:
            while l2:
                numSum = l2.val + placeholder
                l2 = l2.next
                if numSum >= 10:
                    placeholder = 1
                    numSum -= 10
                else:
                    placeholder = 0
                curr.next = ListNode(numSum)
                curr = curr.next 


        if placeholder > 0:
            curr.next = ListNode(1)

        return newLinked.next