package ArrayDemo;

//移除元素
public class Solution_5 {
    public int removeElement(int[] nums, int val) {
        int slow=0,fast=0;
        for(;fast<nums.length;fast++){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow+1;
    }
}
