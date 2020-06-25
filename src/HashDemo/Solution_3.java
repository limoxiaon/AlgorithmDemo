package HashDemo;

import java.util.HashMap;
import java.util.Map;
//字符串中的第一个唯一字符
public class Solution_3 {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                continue;
            }
            map.put(s.charAt(i),1);
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }

        return -1;
    }
}