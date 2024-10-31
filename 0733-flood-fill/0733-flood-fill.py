from typing import List

class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        oldColor = image[sr][sc]
        if oldColor == color:
            return image  # No need to fill if the new color is the same as the old color

        def dfs(r, c):
            # Check bounds and color
            if r < 0 or r >= len(image) or c < 0 or c >= len(image[0]) or image[r][c] != oldColor:
                return
            # Fill with new color
            image[r][c] = color
            # Recur for the four directions
            dfs(r + 1, c)
            dfs(r - 1, c)
            dfs(r, c + 1)
            dfs(r, c - 1)

        dfs(sr, sc)
        return image
