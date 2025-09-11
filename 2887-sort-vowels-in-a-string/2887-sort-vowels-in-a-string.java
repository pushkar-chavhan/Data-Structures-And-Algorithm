class Solution {
    static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

    // Swap function that works on char array
    // void swap(char[] arr, int i, int j) {
    //     char temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }

    public String sortVowels(String s) {
        char[] arr = s.toCharArray();
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (isVowel(arr[i]) && isVowel(arr[j])) {
        //             if (arr[i] > arr[j]) {
        //                 swap(arr, i, j);
        //             }
        //         }
        //     }
        // }
        // return new String(arr);


        List<Character>vowel=new ArrayList<>();
        for(char ch:arr){
            if(isVowel(ch)){
                vowel.add(ch);
            }
        }
        Collections.sort(vowel);
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(isVowel(arr[i])){
                arr[i]=vowel.get(ind++);
            }
        }
        return new String(arr);
    }
}
