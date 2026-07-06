class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        tmp_s, tmp_t = {}, {}

        for n in range(len(s)):
            tmp_s[s[n]] = 1 + tmp_s.get(s[n], 0)
            tmp_t[t[n]] = 1 + tmp_t.get(t[n], 0)
        return tmp_s == tmp_t
            

