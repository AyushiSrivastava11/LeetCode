class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> frequency = new HashMap<>();
        for(char ch : s.toCharArray()){
            frequency.put(ch,(frequency.getOrDefault(ch,0)+1));
        }
        PriorityQueue<Map.Entry<Character,Integer>> priorityQueue= new PriorityQueue<>(
            (a,b)-> Integer.compare(b.getValue(),a.getValue())
        );
        priorityQueue.addAll(frequency.entrySet());
        StringBuilder result= new StringBuilder();
        

        while(!priorityQueue.isEmpty()){
            Map.Entry<Character, Integer> entry = priorityQueue.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return result.toString();
    }
}