package HashDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//字母异位词分组
public class Solution_6 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists=new ArrayList<>();
        HashMap<String,List<String>> hashMap=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] array=strs[i].toCharArray();
            Arrays.sort(array);
            String tempString=String.valueOf(array);
            if(hashMap.containsKey(tempString)){
                hashMap.get(tempString).add(strs[i]);
            }else{
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                hashMap.put(tempString,list);
            }
        }

        for(String key:hashMap.keySet()){
            lists.add(hashMap.get(key));
        }
        return lists;
    }
}
