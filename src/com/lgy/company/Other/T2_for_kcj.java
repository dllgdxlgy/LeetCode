package com.lgy.company.Other;

import java.util.Scanner;

public class T2_for_kcj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();


    }

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
