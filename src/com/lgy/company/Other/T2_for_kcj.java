package com.lgy.company.Other;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class T2_for_kcj {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        ConcurrentHashMap map = new ConcurrentHashMap();

        int f = 0x7FFFFFFF;
        int f1 = 0x7FFFFFFF;
        System.out.println(f+f1);

    }
//    V put(K key, int hash, V value, boolean onlyIfAbsent) {
//        lock();    // 上锁
//        try {
//            int c = count;
//            if (c++ > threshold) // ensure capacity
//                rehash();
//            HashEntry<K,V>[] tab = table;    // table是Volatile的
//            int index = hash & (tab.length - 1);    // 定位到段中特定的桶
//            HashEntry<K,V> first = tab[index];   // first指向桶中链表的表头
//            HashEntry<K,V> e = first;
//
//            // 检查该桶中是否存在相同key的结点
//            while (e != null && (e.hash != hash || !key.equals(e.key)))
//                e = e.next;
//
//            V oldValue;
//            if (e != null) {        // 该桶中存在相同key的结点
//                oldValue = e.value;
//                if (!onlyIfAbsent)
//                    e.value = value;        // 更新value值
//            }else {         // 该桶中不存在相同key的结点
//                oldValue = null;
//                ++modCount;     // 结构性修改，modCount加1
//                tab[index] = new HashEntry<K,V>(key, hash, first, value);  // 创建HashEntry并将其链到表头
//                count = c;      //write-volatile，count值的更新一定要放在最后一步(volatile变量)
//            }
//            return oldValue;    // 返回旧值(该桶中不存在相同key的结点，则返回null)
//        } finally {
//            unlock();      // 在finally子句中解锁
//        }
//    }
//
//
//    void rehash() {
//        HashEntry<K,V>[] oldTable = table;    // 扩容前的table
//        int oldCapacity = oldTable.length;   //获取旧表的长度
//        if (oldCapacity >= MAXIMUM_CAPACITY)   // 判断已经扩到最大容量，直接返回
//            return;
//
//        // 新创建一个table，其容量是原来的2倍
//        HashEntry<K,V>[] newTable = HashEntry.newArray(oldCapacity<<1);
//        threshold = (int)(newTable.length * loadFactor);   // 计算新的阈值
//        int sizeMask = newTable.length - 1;     // 用于定位桶
//        // 对旧的结构进行遍历
//        for (int i = 0; i < oldCapacity ; i++) {
//            // 依次指向旧 table 中的每个桶的链表表头
//            HashEntry<K,V> e = oldTable[i];
//            // 旧table的该桶中链表不为空
//            if (e != null) {  //进入就是有数据
//                HashEntry<K,V> next = e.next; //获取下一个数据
//                int idx = e.hash & sizeMask;   // 重哈希已定位到新桶的位置
//                if (next == null)    //  判断旧table的该桶中只有一个节点，如果只有一个节点，那就直接放在新的桶里的数组位置中。
//                    newTable[idx] = e;
//                else {
//                    //说明旧数组桶里不止一个元素
//                    // Reuse trailing consecutive sequence at same slot
//                    HashEntry<K,V> lastRun = e;
//                    int lastIdx = idx;
//                    for (HashEntry<K,V> last = next;last != null;last = last.next) {
//                        //判断插入的位置
//                        int k = last.hash & sizeMask;
//                        // 寻找k值相同的子链，该子链尾节点与父链的尾节点必须是同一个
//                        if (k != lastIdx) {
//                            lastIdx = k;
//                            lastRun = last;
//                        }
//                    }
//
//                    // JDK直接将子链lastRun放到newTable[lastIdx]桶中
//                    newTable[lastIdx] = lastRun;
//
//                    // 对该子链之前的结点，JDK会挨个遍历并把它们复制到新桶中
//                    for (HashEntry<K,V> p = e; p != lastRun; p = p.next) {
//                        int k = p.hash & sizeMask;
//                        HashEntry<K,V> n = newTable[k];
//                        newTable[k] = new HashEntry<K,V>(p.key, p.hash, n, p.value);
//                    }
//                }
//            }
//        }
//        table = newTable;   // 扩容完成
//    }

}
