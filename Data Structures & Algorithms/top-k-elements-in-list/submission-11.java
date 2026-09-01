class Solution{
    public int[] topKFrequent(int[] nums, int k){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num: nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);

        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)-> a[1]-b[1]);

        for(Map.Entry<Integer,Integer> entry: frequencyMap.entrySet()){
            int currentNumber = entry.getKey();
            int currentFrequency = entry.getValue();

            minHeap.add(new int[]{currentNumber, currentFrequency});
            
            if(minHeap.size()>k){
                minHeap.remove();
            }
        }

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = minHeap.poll()[0];
        }

        return result;
    }
}