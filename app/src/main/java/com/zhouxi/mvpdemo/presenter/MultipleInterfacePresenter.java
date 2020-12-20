package com.zhouxi.mvpdemo.presenter;

import com.zhouxi.mvpdemo.contract.MultipleInterfaceContract;
import com.zhouxi.mvpdemo.base.SingleBasePresenter;
import com.zhouxi.mvpdemo.model.IMultipleInterfaceModel;
import com.zhouxi.mvpdemo.model.MultipleInterfaceModel;

/**
 * Multiple implementation class in presenter layer
 *
 * @Auther: ZhouXi
 * @since 2020-12-04
 */
public class MultipleInterfacePresenter extends SingleBasePresenter<MultipleInterfaceContract.View>
        implements MultipleInterfaceContract.Presenter {

    private final IMultipleInterfaceModel multipleInterfaceModel;

    public MultipleInterfacePresenter() {
        this.multipleInterfaceModel = new MultipleInterfaceModel();
    }

    @Override
    public String viewGetDataFromPresenter(int viewDataIndex) {
        return multipleInterfaceModel.presenterGetDataFromModel(viewDataIndex);
    }
}
