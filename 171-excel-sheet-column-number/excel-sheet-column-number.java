class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;

        for (int index = 0; index < columnTitle.length(); index++) {
            sum *= 26;
            sum += columnTitle.charAt(index) - 'A' + 1;
        }
        return sum;
    }
}