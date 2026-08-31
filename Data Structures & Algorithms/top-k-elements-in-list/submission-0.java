class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new Hashmap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for (Map.entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(new int[] {entry.getKey(), entry.getValue()})
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        for(int i=k-1; i>=0; i--){
            reult[i] = minHeap.poll()[0];
        }

        return result;
    }
}
