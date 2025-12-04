class Solution {
    public int countCollisions(String directions) {
        int n=directions.length();
        int left=0;
        while(left<n&&directions.charAt(left)=='L'){
            left++;
        }
        int right=n-1;
        while(right>=0 && directions.charAt(right)=='R'){
            right--;
        }
        int collisions=0;
        while(left<=right){
            if(directions.charAt(left)!='S'){
                collisions++;
            }
            left++;
        }
        return collisions;

        // int n = directions.length();

        // int i = 0; // left boundary
        // while (i < n && directions.charAt(i) == 'L') {
        //     i++;
        // }

        // int j = n - 1; // right boundary
        // while (j >= 0 && directions.charAt(j) == 'R') {
        //     j--;
        // }

        // int collisions = 0;
        // while (i <= j) {
        //     if (directions.charAt(i) != 'S') {
        //         collisions++;
        //     }
        //     i++;
        // }

        // return collisions;
    }

}