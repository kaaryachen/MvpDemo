package com.zhouxi.mvpdemo.model;

/**
 * Single middle layer model interface
 *
 * @Author: ZhouXi
 * @since 2020-12-04
 */
public interface ISingleInterfaceModel extends IModel {
    String sendDataFromModelToPresenter(String dataIndex);
}
