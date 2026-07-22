class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int count = 0;
        for(int num=0;num<=nums.length-1;num++){
            if(count == 0){
                res = nums[num];
            }
            if(nums[num] == res){
                count++;
            }else{
                count--;
            }
        }
        return res;
    }
}