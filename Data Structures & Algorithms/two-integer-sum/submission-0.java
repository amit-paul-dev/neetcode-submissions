class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> difference_map = new HashMap<>();
        // int[] indices = {};
        for(int i = 0; i<=nums.length(); i++){
            int difference = target - num;
            if(differnce_map.containsKey(difference)){
                return [i, difference_map.get(difference)]
            }
            difference_map.put(nums[i],i)
        }

        return new int[]{};
    }
}
