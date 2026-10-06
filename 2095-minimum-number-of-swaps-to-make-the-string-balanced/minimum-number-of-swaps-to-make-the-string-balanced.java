class Solution {
    public int minSwaps(String s) {
        int max_imbalance = 0;
        int current_imbalance = 0;

        for(char ch: s.toCharArray()) {
            if( ch == ']') {
                current_imbalance++;
            }
            else{
                current_imbalance--;
            }
            if(current_imbalance > max_imbalance) {
                max_imbalance = current_imbalance;
            }
        }
        return(max_imbalance + 1) / 2;
    }
}