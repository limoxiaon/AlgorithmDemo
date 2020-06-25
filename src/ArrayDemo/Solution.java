package ArrayDemo;

//寻找数组的中心索引
public class Solution {

    public int pivotIndex(int[] nums) {

        if(nums.length==0){
            return -1;
        }

        int left=0;
        int right=0;
        for(int i=1;i<nums.length;i++){
            right+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            if(left==right){
                return i;
            }else{
                if(i!=nums.length-1) {
                    left += nums[i];
                    right -= nums[i + 1];
                }
            }
        }
        return -1;
    }
}
