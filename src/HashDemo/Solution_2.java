package HashDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

//两个数组的交集
public class Solution_2 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        int count=0;
        int flag=0;


        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }

        set.retainAll(set2);
        count=set.size();
        int[] union=new int[count];

        for(Integer num:set){
            union[flag]=num;
            flag++;
        }
        return union;
    }

    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        Solution_2 solution_2=new Solution_2();
        solution_2.intersection(nums1,nums2);
    }
}
