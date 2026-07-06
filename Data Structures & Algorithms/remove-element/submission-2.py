class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        tmp = []
        for n in nums:
            if n == val:
                continue
            tmp.append(n)
        for n in range(len(tmp)):
            nums[n] = tmp[n]
        return len(tmp)