class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int index=1;index<=numRows;index++){
            ans.add(generateRow(index));
        }
        return ans;
    }
    public ArrayList<Integer> generateRow(int row){
        ArrayList<Integer> arr = new ArrayList<>();
        int answer= 1;
        arr.add(1);
        for(int col=1;col<row;col++){
            answer = answer * (row-col);
            answer = answer /col;
            arr.add(answer);
        }
        return arr;
    }
}