//package com.company.leetcode.editor.cn;//运用你所掌握的数据结构，设计和实现一个 LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。
////
//// 获取数据 get(key) - 如果关键字 (key) 存在于缓存中，则获取关键字的值（总是正数），否则返回 -1。
////写入数据 put(key, value) - 如果关键字已经存在，则变更其数据值；如果关键字不存在，则插入该组「关键字/值」。当缓存容量达到上限时，它应该在
////写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。
////
////
////
//// 进阶:
////
//// 你是否可以在 O(1) 时间复杂度内完成这两种操作？
////
////
////
//// 示例:
////
//// LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );
////
////cache.put(1, 1);
////cache.put(2, 2);
////cache.get(1);       // 返回  1
////cache.put(3, 3);    // 该操作会使得关键字 2 作废
////cache.get(2);       // 返回 -1 (未找到)
////cache.put(4, 4);    // 该操作会使得关键字 1 作废
////cache.get(1);       // 返回 -1 (未找到)
////cache.get(3);       // 返回  3
////cache.get(4);       // 返回  4
////
//// Related Topics 设计
//// 👍 763 👎 0
//
//
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.LinkedList;
//import java.util.Map;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class LRUCache extends LinkedHashMap<Integer, Integer> {
//
////    public static void main(String[] args) {
////        LRUCache cache = new LRUCache(2);
////        cache.put(1,1);
////        cache.put(2,2);
////        System.out.println(cache.get(1));
////        cache.put(3,3);
////        System.out.println(cache.get(2));
////        cache.put(4,4);
////        System.out.println(cache.get(1));
////        System.out.println(cache.get(3));
////        System.out.println(cache.get(4));
////
////
////    }
//
//    private int mCapacity;
//
//    public LRUCache(int capacity) {
//        super(capacity, 0.75f, true);
//        this.mCapacity = capacity;
//    }
//
//    public int get(int key) {
//        return super.getOrDefault(key, -1);
//    }
//
//    public void put(int key, int value) {
//        super.put(key, value);
//    }
//
//    @Override
//    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
//        return size() > mCapacity;
//    }
//
//    //    class Node{
////        int key;
////        int value;
////
////        private Node(int key, int value) {
////            this.key = key;
////            this.value = value;
////        }
////    }
////
////    private final LinkedList<Node> mList;
////    private final HashMap<Integer, Node> mMap;
////    private final int mCapacity;
////
////    public LRUCache(int capacity) {
////        mCapacity = capacity;
////        mList = new LinkedList<Node>();
////        mMap = new HashMap<>();
////    }
////
////    public int get(int key) {
////        if(!mMap.containsKey(key)) {
////            return -1;
////        }
////        Node node = mMap.get(key);
////        mList.remove(node);
////        mList.addFirst(node);
////        return node.value;
////    }
////
////    public void put(int key, int value) {
////        Node node;
////        if (mMap.containsKey(key)) {
////            node = mMap.get(key);
////            if(node.value != value) {
////                node.value = value;
////            }
////            mList.remove(node);
////        } else {
////            node = new Node(key, value);
////            mMap.put(key, node);
////        }
////        mList.addFirst(node);
////        checkSize();
////    }
////
////    private void checkSize() {
////        if(mMap.size() > mCapacity) {
////           Node node = mList.getLast();
////           mList.removeLast();
////           mMap.remove(node.key);
////        }
////    }
//}
//
///**
// * Your LRUCache object will be instantiated and called as such:
// * LRUCache obj = new LRUCache(capacity);
// * int param_1 = obj.get(key);
// * obj.put(key,value);
// */
////leetcode submit region end(Prohibit modification and deletion)
