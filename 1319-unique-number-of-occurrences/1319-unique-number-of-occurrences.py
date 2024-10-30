class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        frequency_map={}
        for num in arr:
            if num in frequency_map:
                frequency_map[num]+=1
            else:
                frequency_map[num]=1
        frequency=list(frequency_map.values())
        return len(frequency)==len(set(frequency))