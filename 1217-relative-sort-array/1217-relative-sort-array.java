class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        //step 1
        int [] frequency=new int[1001];
        for(int num:arr1){
            frequency[num]++;
        }
        List<Integer>result=new ArrayList<>();
        for(int num:arr2){
            while(frequency[num]>0){
                result.add(num);
                frequency[num]--;
            }
        }
        for(int i=0;i<frequency.length;i++){
            while(frequency[i]>0){
                result.add(i);
                frequency[i]--;
            }
        }
        int[] final_result=new int[result.size()];
        for(int i=0;i<result.size();i++){
            final_result[i]=result.get(i);
        }
        return final_result;
    }
}