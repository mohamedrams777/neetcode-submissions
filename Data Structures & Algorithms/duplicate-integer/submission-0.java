class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hp.containsKey(nums[i])){
                hp.put(nums[i],1);
            }
            else{
                return true;
                }
        }
        return false;

    }
}