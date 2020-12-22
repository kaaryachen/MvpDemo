package com.zhouxi.mvpdemo.model;

/**
 * Multiple implementation class in model layer
 *
 * @Author: ZhouXi
 * @since 2020-12-04
 */
public class MultipleInterfaceModel implements IMultipleInterfaceModel {

    @Override
    public String presenterGetDataFromModel(int dataIndex) {
        return "this is information in model.";
    }
}
