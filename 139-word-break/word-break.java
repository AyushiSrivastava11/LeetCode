import java.util.*;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict);
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> seen = new HashSet<>();

        queue.offer(0);

        while (!queue.isEmpty()) {
            int start = queue.poll();
            if (start == s.length()) {
                return true;
            }

            for (int end = start + 1; end <= s.length(); end++) {
                if (seen.contains(end)) {
                    continue;
                }

                if (words.contains(s.substring(start, end))) {
                    queue.offer(end);
                    seen.add(end);
                }
            }
        }

        return false;
    }
}
