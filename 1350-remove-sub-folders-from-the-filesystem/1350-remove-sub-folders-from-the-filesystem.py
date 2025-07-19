class Solution:
    def removeSubfolders(self, folder: List[str]) -> List[str]:
        ans=[]
        folder.sort()
        for i in folder:
            if not ans  or not i.startswith(ans[-1]+'/'):
                ans.append(i) 
        return ans