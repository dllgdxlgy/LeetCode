package com.lgy.datastructure;

import java.util.Stack;

/**
 * 链接：https://www.cnblogs.com/toSeeMyDream/p/5816682.html
 * 树的深度遍历
 * 英文缩写为DFS即Depth First Search.其过程简要来说是对每一个可能的分支路径深入到不能再深入为止，而且每个节点只能访问一次。
 * 对于上面的例子来说深度优先遍历的结果就是：A,B,D,E,I,C,F,G,H.(假设先走子节点的的左侧)。
 * 深度优先遍历各个节点，需要使用到栈（Stack）这种数据结构。stack的特点是是先进后出。整个遍历过程如下：
 * 首先将A节点压入栈中，stack（A）;
 * 将A节点弹出，同时将A的子节点C，B压入栈中，此时B在栈的顶部，stack(B,C)；
 * 将B节点弹出，同时将B的子节点E，D压入栈中，此时D在栈的顶部，stack（D,E,C）；
 * 将D节点弹出，没有子节点压入,此时E在栈的顶部，stack（E，C）；
 * 将E节点弹出，同时将E的子节点I压入，stack（I,C）；
 * ...依次往下，最终遍历完成，Java代码大概如下
 */
public class DFS {
    public void depthFirst(){
        // 创建一个栈空间
        Stack<Integer> stack = new Stack<>();

    }


}
