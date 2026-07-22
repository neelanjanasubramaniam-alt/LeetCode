class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer,Integer>map=new HashMap<>();
     for(int i=0;i<nums.length;i++){
        int twoSum = target - nums[i];
       if(map.containsKey(twoSum)){
        return new int[]{map.get(twoSum),i};
       }
        map.put(nums[i],i);

    }
    return new int[]{};}
    }


