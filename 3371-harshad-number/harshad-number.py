class Solution:
    def sumOfTheDigitsOfHarshadNumber(self, x: int) -> int:
        sumX=sum(int(d) for d in str(x))
        return sumX if x%sumX ==0 else -1