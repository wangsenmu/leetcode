package com.wsm.jvm;

/**
 * @author wangsenmu
 * @date 2020-8-31 17:32
 */
public class GcCase {


    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            allocate_1M();
        }

    }


    public static void allocate_1M() {
        byte[] _1M = new byte[1024 * 1000];
    }


}