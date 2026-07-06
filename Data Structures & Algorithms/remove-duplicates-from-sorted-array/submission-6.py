class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        tmp =[]
        for n in nums:
            if n in tmp:
                continue
            tmp.append(n)
        for n in range(len(tmp)):
            nums[n] = tmp[n]
        return len(tmp)