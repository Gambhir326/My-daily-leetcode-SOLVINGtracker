class Solution {
    public int minAddToMakeValid(String s) {
        int open_needed = 0;
        int close_needed= 0;

        for(char ch: s.toCharArray()) {
            if(ch == '(') {
                close_needed++;
            }
            else{
                if(close_needed > 0) {
                    close_needed--;
                }
                else{
                    open_needed++;
                }
            }
        }
        return open_needed + close_needed;
    }
}