class Solution {
    public String interpret(String command) {
        StringBuilder s = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                s.append("G");
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                s.append("o");
                i += 2;  // skip past the "()"
            } else {
                s.append("al");
                i += 4;  // skip past the "(al)"
            }
        }
        return s.toString();
    }
}
