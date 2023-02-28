class KthLargest {
      public int k;
        public PriorityQueue<Integer> topKHeap;
        public KthLargest(int k, int[] nums) {
            this.k = k;
            topKHeap = new PriorityQueue<Integer> ();
            for (int num: nums) {
                topKHeap.offer(num);
            }
            while (topKHeap.size() > k) {
                topKHeap.poll();
            }
        }

        public int add(int val) {
            topKHeap.offer(val);
            if (topKHeap.size() > k) {
                topKHeap.poll();
            }
            return topKHeap.peek();
        }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */