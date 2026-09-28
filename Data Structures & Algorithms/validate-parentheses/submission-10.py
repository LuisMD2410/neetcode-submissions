class Solution:
    def isValid(self, s: str) -> bool:
        parMap = {")" : "(", "}" : "{", "]" : "["}
        stack = []

        for ch in s:
            if ch in parMap:
                if stack and stack[-1] == parMap.get(ch):
                    stack.pop()
                else:
                    return False
            else: 
                stack.append(ch)
        return len(stack) == 0