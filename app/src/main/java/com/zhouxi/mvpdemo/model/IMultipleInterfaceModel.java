package com.zhouxi.mvpdemo.model;

/**
 * Multiple middle layer model interface
 *
 * @Author: ZhouXi
 * @since 2020-12-04
 */
public interface IMultipleInterfaceModel extends IModel {
    String presenterGetDataFromModel(int dataIndex);
}