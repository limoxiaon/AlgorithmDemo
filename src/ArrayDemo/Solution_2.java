package ArrayDemo;
//搜索插入位置
public class Solution_2 {
    public int searchInsert(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            if(target>nums[i]){
                continue;
            }

            if(target==nums[i]){
                return i;
            }

            if(target<nums[i]){
                return i;
            }
        }

        return nums.length;
    }
}
