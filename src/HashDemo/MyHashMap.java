package HashDemo;

public class MyHashMap {

    int[] list=new int[100001];

    /** Initialize your data structure here. */
    public MyHashMap() {
        for(int i=0;i<list.length;i++){
            list[i]=-1;
        }
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
         list[key]=value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return list[key];
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        list[key]=-1;
    }

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(3));
        hashMap.put(2, 1);
        System.out.println(hashMap.get(2));
        hashMap.remove(2);
        System.out.println(hashMap.get(2));
    }
}
