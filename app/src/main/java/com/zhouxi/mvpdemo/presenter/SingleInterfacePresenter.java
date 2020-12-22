package com.zhouxi.mvpdemo.presenter;

import com.zhouxi.mvpdemo.contract.SingleInterfaceContract;
import com.zhouxi.mvpdemo.base.SingleBasePresenter;
import com.zhouxi.mvpdemo.model.SingleInterfaceModel;

/**
 * Single implementation class in presenter layer
 *
 * @Author: ZhouXi
 * @since 2020-12-04
 */
public class SingleInterfacePresenter extends SingleBasePresenter<SingleInterfaceContract.View> implements SingleInterfaceContract.Presenter{
    private final SingleInterfaceModel singleInterfaceModel;

    public SingleInterfacePresenter() {
        this.singleInterfaceModel = new SingleInterfaceModel();
    }

    @Override
    public String sendDataFromPresenterToView() {
        String dataIndex = mView.presenterGetDataFromView();
        return singleInterfaceModel.sendDataFromModelToPresenter(dataIndex);
    }
}