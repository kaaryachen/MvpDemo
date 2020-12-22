package com.zhouxi.mvpdemo.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Single implementation class in model layer
 *
 * @Author: ZhouXi
 * @since 2020-12-04
 */
public class SingleInterfaceModel implements ISingleInterfaceModel{
    Map<String, String> hashMap = new HashMap(){
        {
            put("book", "this is book in model.");
            put("pen", "this is pen in model");
            put("desk", "this is desk in model");
        }
    };

    @Override
    public String sendDataFromModelToPresenter(String dataIndex) {
        return hashMap.get(dataIndex);
    }
}
