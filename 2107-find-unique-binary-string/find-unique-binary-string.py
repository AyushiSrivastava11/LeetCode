class Solution(object):
    def findDifferentBinaryString(self, nums):
        res = ''
        for i in range(len(nums)):
            res += '1' if nums[i][i] == '0' else '0'
        return res