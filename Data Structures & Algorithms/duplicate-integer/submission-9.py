class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        tmp = set()
        for n in nums:
            if n in tmp:
                return True
            tmp.add(n)
        return False