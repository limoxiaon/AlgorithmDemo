package ArrayDemo;
//最长连续1的个数
public class Solution_6 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int slow=0,fast=0;
        int max=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                slow=i;
                fast=slow;
                break;
            }
        }

        while (fast<nums.length){
            while(fast<nums.length&&nums[fast]!=0){
                fast++;
            }
            int sum=fast-slow;
            if (sum>max)
                max=sum;
            while(fast<nums.length&&nums[fast]==0){
                fast++;
            }
            slow=fast;
            fast++;
        }

        return max;
    }

    public static void main(String[] args) {
        Solution_6 solution_6=new Solution_6();
        int[] nums={0,0,0,1,1,1,1,1,1};
        System.out.println(solution_6.findMaxConsecutiveOnes(nums));
    }
}
