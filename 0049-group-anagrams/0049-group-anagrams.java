class Solution {
     private String generate(String str) {

    // Frequency buckets
    int[] freq = new int[26];

    // Iterate over each character
    for (char c : str.toCharArray()) {
      freq[c - 'a']++;
    }

    // Start creating the frequency string
    StringBuilder frequencyString = new StringBuilder("");
    char c = 'a';
    for (int i : freq) {
      frequencyString.append(c);
      frequencyString.append(i);
      c++;
    }

    return frequencyString.toString();
  }
    public List<List<String>> groupAnagrams(String[] strs) {
        //with sorting
        // HashMap<String,List<String>>mp=new HashMap<>();
        // for(String s:strs){
        //     char []charArray=s.toCharArray();
        //     Arrays.sort(charArray);
        //     String sorted=new String(charArray);
        //     if(!mp.containsKey(sorted)){
        //         mp.put(sorted,new ArrayList<>());
        //     }
        //     mp.get(sorted).add(s);
        // }
        // return new ArrayList<>(mp.values());


        //without sorting and using generate freString
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            String newS = generate(s);

            if (!map.containsKey(newS)) {
                map.put(newS, new ArrayList<>());
            }

            map.get(newS).add(s);
        }

        return new ArrayList<>(map.values());
    }
}