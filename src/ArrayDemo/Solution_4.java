package ArrayDemo;

//两数之和
public class Solution_4 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        int line=numbers.length;

        for(int i=0;i<numbers.length;i++){
            if(target>0&&target<numbers[i]){
                line=i;
                break;
            }
        }

        for(int i=0;i+1<line;i++){
            int j=i+1;
            while(j<line){
                int sum=numbers[i]+numbers[j];
                if(sum==target){
                    System.out.println("hello");
                    result[0]=i+1;
                    result[1]=j+1;
                    break;
                }else if(sum<target){
                    j++;
                }else{
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution_4 solution_4 =new Solution_4();
        int[] numbers={-1,0};
        int[] result= solution_4.twoSum(numbers,-1);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
