package com.wsm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author wangsenmu
 * @date 2020-9-8 22:01
 */
public class BreadthFirst {


    public static void main(String[] args) {

        List<Tree> childList1 = new ArrayList<>();
        childList1.add(new Tree("b", new ArrayList<>()));
        childList1.add(new Tree("c", new ArrayList<>()));

        List<Tree> childList2 = new ArrayList<>();
        childList2.add(new Tree("e", new ArrayList<>()));
        childList2.add(new Tree("f", new ArrayList<>()));
        Tree tree1 = new Tree("m", childList2);
        childList1.add(tree1);
        Tree tree = new Tree("a", childList1);
        System.out.println(tree);


        Stream.concat()
        childList1.stream().c.close();

    }


}

class Tree {
    private List<Tree> childs;
    private Object data;

    public Tree(Object data, List<Tree> childs) {
        this.childs = childs;
        this.data = data;
    }

    public List<Tree> getChilds() {
        return childs;
    }

    public void setChilds(List<Tree> childs) {
        this.childs = childs;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
