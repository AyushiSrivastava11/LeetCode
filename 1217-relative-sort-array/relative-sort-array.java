class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int one : arr1) {
            if (hashMap.containsKey(one)) {
                hashMap.put(one, hashMap.get(one) + 1);
            } else {
                hashMap.put(one, 1);
            }
        }
        int[] ans = new int[arr1.length];
        int count=0;
        for (int two : arr2) {
            while (hashMap.get(two) > 0) {
                ans[count] = two;
                count++;
                hashMap.put(two, hashMap.get(two) - 1);
            }
            hashMap.remove(two);
        }
        int[] remaining = new int[arr1.length-count];
        int index = 0;
        for (int one : arr1) {
            if (hashMap.containsKey(one)) {
                while (hashMap.get(one) > 0) {
                    remaining[index] = one;
                    index++;
                    hashMap.put(one, hashMap.get(one) - 1);
                }
                hashMap.remove(one);
            }
        }
        Arrays.sort(remaining);
        for (int rem : remaining) {
            ans[count] = rem;
            count++;
        }
        return ans;
    }
}