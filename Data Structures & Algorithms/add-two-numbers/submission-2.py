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

        while l1 or l2 or placeholder:
            v1 = l1.val if l1 else 0
            v2 = l2.val if l2 else 0

            numSum = v1 + v2 + placeholder
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
            if numSum >= 10:
                placeholder = 1
                numSum -= 10
            else:
                placeholder = 0
            curr.next = ListNode(numSum)
            curr = curr.next
        return newLinked.next