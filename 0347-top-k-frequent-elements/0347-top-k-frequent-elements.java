class Solution {
    public int[] topKFrequent(int[] nums, int k) {
           Map<Integer, Integer> numFrequencyMap = new HashMap<>();
        for (int n : nums)
            numFrequencyMap.put(n, numFrequencyMap.getOrDefault(n, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> topKElements = new PriorityQueue<Map.Entry<Integer, Integer>>(
                (e1, e2) -> e1.getValue() - e2.getValue());
        for (Map.Entry<Integer, Integer> entry : numFrequencyMap.entrySet()) {
            topKElements.add(entry);
            if (topKElements.size() > k) {
                topKElements.poll();
            }
        }
        int [] topNumbers =new int[k];
        int counter=0;
        while (!topKElements.isEmpty()) {
            topNumbers[counter++]=topKElements.poll().getKey();
        }
        return topNumbers; 
    }
}