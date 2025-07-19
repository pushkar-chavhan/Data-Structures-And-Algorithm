class Solution {
    public List<String> removeSubfolders(String[] folder) {
      List<String>ans=new ArrayList<>();
      //sort the list first
      Arrays.sort(folder);;
      for(int i=0;i<folder.length;i++){
        int n=ans.size();
        if(n==0||!folder[i].startsWith(ans.get(n-1)+'/')){
            ans.add(folder[i]);
        }
      }  
      return ans;
    }
}