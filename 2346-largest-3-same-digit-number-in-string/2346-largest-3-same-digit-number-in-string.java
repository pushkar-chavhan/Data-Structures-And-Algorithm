class Solution {
    public String largestGoodInteger(String num) {
    //   String maxgood="";
    //   for(int i=0;i<=num.length()-3;i++){
    //     char ch=num.charAt(i);
    //     if(ch==num.charAt(i+1) && ch==num.charAt(i+2)){
    //         String good=num.substring(i,i+3);
    //         if(maxgood.isEmpty() || good.compareTo(maxgood)>0){
    //             maxgood=good;
    //         }
    //     }
    //   }
    //   return maxgood;

    char maxchar=' ';
    for(int i=2;i<num.length();i++){
        if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i-2)){
            maxchar=(char) Math.max(maxchar,num.charAt(i));
        }
    }
    return maxchar==' ' ? "": new String(new char[]{maxchar,maxchar,maxchar});
    }
}