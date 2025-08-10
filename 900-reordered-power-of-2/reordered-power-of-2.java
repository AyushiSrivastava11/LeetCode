class Solution {
    public boolean reorderedPowerOf2(int n) {
        String[] signatures = {
            "1", "2", "4", "8", "16", "23", "46", "128", "256", "125",
            "0124", "0248", "0469", "1289", "13468", "23678", "35566",
            "011237", "122446", "224588", "0145678", "0122579", 
            "0134449", "0368888", "11266777", "23334455", "01466788",
            "112234778", "234455668", "012356789", "0112344778",
            "1234446788", "2244667999", "2345588999"
    };
        String num = Integer.toString(n);
        char[] chars = num.toCharArray(); 
        Arrays.sort(chars);             
        String sortedNum = new String(chars);
        for(int index = 0;index<signatures.length;index++){
            if(sortedNum.equals(signatures[index])){
                return true;
            }
        }
        return false;
    }
}