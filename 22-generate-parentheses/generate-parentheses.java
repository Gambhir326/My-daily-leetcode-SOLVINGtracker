class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        if (n == 0) {
            result.add("");
            return result;
        }

        for (int c = 0; c < n; c++) {
            List<String> leftList = generateParenthesis(c);
            List<String> rightList = generateParenthesis(n - 1 - c);

            for (int i = 0; i < leftList.size(); i++) {
                for (int j = 0; j < rightList.size(); j++) {
                    String left = leftList.get(i);
                    String right = rightList.get(j);
                    result.add("(" + left + ")" + right);
                }
            }
        }
        return result; 
    }
}