class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        map = {}

        for i in range(n):
            remain = target - nums[i]

            if remain in map:
                return [map[remain],i]
            
            map[nums[i]] = i

        return [-1,-1]
        