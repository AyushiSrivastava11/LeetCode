class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for(int index=0;index<operations.length;index++){
            if(operations[index].equals("--X") || operations[index].equals("X--")){
                res--;
            }
            else res++;
        }
        return res;
    }
}