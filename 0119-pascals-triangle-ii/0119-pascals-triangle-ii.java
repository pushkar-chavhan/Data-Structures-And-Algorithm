class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < rowIndex+1; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // First and last elements are always 1
                } else {
                    int num = result.get(i - 1).get(j) + result.get(i - 1).get(j - 1);
                    row.add(num);
                }
            }
            result.add(row);
        }
        
        return result.get(rowIndex);
    }
}