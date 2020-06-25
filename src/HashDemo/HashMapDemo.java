package HashDemo;

import java.util.HashMap;
import java.util.Map;

// "static void main" must be defined in a public class.
public class HashMapDemo {

    public static void main(String[] args) {
        // 1. 初始化HashMap
        Map<Integer, Integer> hashMap = new HashMap<>();
        // 2. 插入一个新的键值对
        hashMap.putIfAbsent(0, 0);
        hashMap.putIfAbsent(2, 3);
        // 3. 插入新的键值对或者更新存在的键的值
        hashMap.put(1, 1);
        hashMap.put(1, 2);
        // 4. 得到特定的键的值
        System.out.println("The value of key 1 is: " + hashMap.get(1));
        // 5. 删除键
        hashMap.remove(2);
        // 6. 查询HashMap是否有这个键
        if (!hashMap.containsKey(2)) {
            System.out.println("Key 2 is not in the hash map.");
        }
        // 7. 得到HashMap的大小
        System.out.println("The size of hash map is: " + hashMap.size());
        // 8. HashMap的迭代
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.print("(" + entry.getKey() + "," + entry.getValue() + ") ");
        }
        System.out.println("are in the hash map.");
        // 9. 清除HashMap
        hashMap.clear();
        // 10. 检查HashMap是否为空
        if (hashMap.isEmpty()) {
            System.out.println("hash map is empty now!");
        }
    }
}
