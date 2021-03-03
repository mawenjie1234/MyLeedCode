package com.company.Utils;

import java.util.LinkedList;

public class Instance {

    private static volatile   Instance mInstance;

    public static Instance GetInstances() {
        if(mInstance == null) {
            synchronized(Instance.class) {
                if(mInstance == null) {
                    mInstance = new Instance();
                }
                return mInstance;
            }
        }
        return mInstance;
    }

    private Instance() {
        LinkedList<Integer> list = new LinkedList<>();
//        list.poll();
//        list.peek();
    }

}
