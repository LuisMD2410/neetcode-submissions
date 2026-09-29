class Solution:

    def encode(self, strs: List[str]) -> str:
        encodedStr = ""

        for s in strs:
            encodedStr += str(len(s)) + "#" + s
        
        return encodedStr

    def decode(self, s: str) -> List[str]:
        strs = []
        start = 0
        idx = 0

        while idx < len(s):
            if s[idx] == "#":
                length = int(s[start : idx])
                idx += 1
                strs.append(s[idx : idx + length])
                idx += length
                start = idx
            else:
                idx += 1
        return strs       

