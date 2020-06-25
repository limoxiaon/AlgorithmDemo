package HashDemo;


import java.util.Vector;

class MyHashSet {

    private static boolean[] flag;

    /** Initialize your data structure here. */
    public MyHashSet() {
        flag=new boolean[100001];
    }

    public void add(int key) {
        flag[key]=true;
    }

    public void remove(int key) {
        if(flag[key]==true){
            flag[key]=false;
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(key<0||key>1000000){
            return false;
        }else if(flag[key]==true){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        MyHashSet hashSet=new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.contains(1);    // 返回 true
        hashSet.contains(3);    // 返回 false (未找到)
        hashSet.add(2);
        hashSet.contains(2);    // 返回 true
        hashSet.remove(2);
        hashSet.contains(2);
    }
}



