class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        tmp_s, tmp_t = {}, {}

        for n in s:
            if n in tmp_s:
                tmp_s[n] += 1
            else:
                tmp_s[n] = 1

        for i in t:
            if i in tmp_t:
                tmp_t[i] += 1
            else:
                tmp_t[i] = 1

        i = 0
        for n in tmp_s:
            if n in tmp_t and tmp_s[n] == tmp_t[n]:
                i += 1
            print(i)

        return i == len(tmp_s)

