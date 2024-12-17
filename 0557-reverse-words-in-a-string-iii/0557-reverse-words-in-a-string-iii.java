class Solution {
    private void reverse(char[] arr,int l,int r){
        while(l<r){
            char temp=arr[l];
            arr[l++]=arr[r];
            arr[r--]=temp;
        }
    }
    public String reverseWords(String s) {
        char []arr=s.toCharArray();
        int l=0,r=0;
        while(r<arr.length){
            if(arr[r]==' '){
                reverse(arr,l,r-1);
                l=r+1;
            }
            r++;
        }
        reverse(arr,l,r-1);
        return new String(arr);
    }
}