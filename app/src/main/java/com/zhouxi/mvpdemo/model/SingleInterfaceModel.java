package com.zhouxi.mvpdemo.model;

/**
 * Single implementation class in model layer
 *
 * @Auther: ZhouXi
 * @since 2020-12-04
 */
public class SingleInterfaceModel implements ISingleInterfaceModel{

    @Override
    public String presenterGetDataFromModel(int dataIndex) {
        return "this is information in model.";
    }
}
