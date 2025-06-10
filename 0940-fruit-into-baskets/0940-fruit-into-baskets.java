class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer>basket=new HashMap<>();
        int left=0;
        int right=0;
        int maxFruit=0;
        for(right=0;right<fruits.length;right++){
            int currentCount=basket.getOrDefault(fruits[right],0);
            basket.put(fruits[right],currentCount+1);
            while(basket.size()>2){
                int fruitCount=basket.get(fruits[left]);
                if(fruitCount==1){//jr size >2 ahe ani vegla fruit aahe tr left la remove karayach
                    basket.remove(fruits[left]);
                }
               else{
                 basket.put(fruits[left],fruitCount-1);
                }//jr size jast nahi ahe basket chi tr left la tr add kara lagan basekt madhe
                left++;
            }
            maxFruit=Math.max(maxFruit,right-left+1);//subarray chi length
        }
        return maxFruit;
    }
}