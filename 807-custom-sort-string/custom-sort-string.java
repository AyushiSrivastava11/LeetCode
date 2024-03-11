class Solution {
    public String customSortString(String order, String s) {
        List<Character> result = new ArrayList<>();
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char orderChar : order.toCharArray()) {
            if (charCountMap.containsKey(orderChar)) {
                int count = charCountMap.get(orderChar);
                for (int i = 0; i < count; i++) {
                    result.add(orderChar);
                }
                charCountMap.remove(orderChar);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                result.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : result) {
            sb.append(c);
        }

        return sb.toString();
    }
}