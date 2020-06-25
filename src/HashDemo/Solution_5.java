package HashDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//字母异位次分组
public class Solution_5 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists=new ArrayList<>();
        Map<Integer,String> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] chars=strs[i].toCharArray();

        }
        return lists;
    }
}
