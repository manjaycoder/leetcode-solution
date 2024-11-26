class Solution:
    def myAtoi(self, s: str) -> int:
        s = s.strip()
        if not s:
            return 0
        negative = False
        out = 0
        if s[0] == '-':
            negative = True
        elif s[0] == '+':
            pass 
        elif not s[0].isdigit():
            return 0
     
        start_index = 1 if s[0] in ('-', '+') else 0
        for i in range(start_index, len(s)):
            if s[i].isdigit():
                out = out * 10 + (ord(s[i]) - ord('0'))
            else:
                break
        
            if not negative and out >= 2147483647:
                return 2147483647
            if negative and out > 2147483648: 
                return -2147483648
        
 
        return -out if negative else out
