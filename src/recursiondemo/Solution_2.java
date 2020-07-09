package recursiondemo;

import java.util.ArrayList;
import java.util.List;
//杨辉三角
public class Solution_2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists=new ArrayList<>();

        if(numRows==0){
            return lists;
        }
        List<Integer> temp=new ArrayList<>();
        temp.add(1);
        lists.add(temp);

        for(int i=1;i<numRows;i++){
            List<Integer> list=new ArrayList<>();
            list.add(1);
            for(int j=1;j<i;j++){
                list.add(lists.get(i-1).get(j-1)+lists.get(i-1).get(j));
            }
            list.add(1);
            lists.add(list);
        }
        return lists;
    }
}
