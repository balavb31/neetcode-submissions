class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        HashMap<Integer, Integer> result = new HashMap<>(nums.length);
        int difference;
        for(int i=0; i<nums.length; i++) {
            difference = target - nums[i];
            if (result.containsKey(difference)) {
                return new int[] {result.get(difference), i};
            }
            if (!result.containsKey(nums[i])) {
                result.put(nums[i], i);
            }
            
        
        }
        return new int[0];
        
    }
}
