class Solution:
    def capitalizeTitle(self, title: str) -> str:
        split_str=title.split()
        for i in range(len(split_str)):
            if len(split_str[i])>=3:
                split_str[i]=split_str[i].title()
            else:
                split_str[i]=split_str[i].lower()
        return " ".join(split_str)