class Solution:
    def defangIPaddr(self, address: str) -> str:
        n = len(address)
        s = ""
        for i in range(n):
            if address[i] == ".":
                s += "[.]"
            else:
                s += address[i]
        return s
