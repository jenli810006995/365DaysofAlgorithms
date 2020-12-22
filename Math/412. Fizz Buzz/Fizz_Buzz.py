class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        ## start with module of 15 == 0
        res = []
        for i in range(1, n + 1):
            if i % 15 == 0:
                res.append('FizzBuzz')
            elif i % 5 == 0:
                res.append('Buzz')
            elif i % 3 == 0:
                res.append('Fizz')
            else:
                string = str(i)
                res.append(string)
       return res
## Link: https://leetcode.com/problems/fizz-buzz/
