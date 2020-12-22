class Solution:

  def __init__(self, nums: List[int]):
      self.original = nums[:]
      
  def reset(self) -> List[int]:
      return self.original
      
  def shuffle(self) -> List[int]:
      results = self.original[:]
      random.shuffle(results)
      return results
      
## Link: https://leetcode.com/problems/shuffle-an-array/
      
