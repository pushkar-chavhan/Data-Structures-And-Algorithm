class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        #step 1
        frequency={}
        for num in arr1:
            if num in frequency:
                frequency[num]+=1
            else:
                frequency[num]=1
        #step2
        result=[]
        for num in arr2:
            if num in frequency:
                result.extend([num]*frequency[num])
                del frequency[num]#remove items once it added to result
        #step3 remaining items sort in acsending order
        remain_element=sorted(frequency.keys())
        for num in remain_element:
            result.extend([num]*frequency[num])
        return result