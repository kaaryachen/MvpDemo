package com.zhouxi.mvpdemo.contract;

import com.zhouxi.mvpdemo.view.IView;

/**
 * Multiple interface contract
 *
 * @Author: ZhouXi
 * @since 2020-12-04
 */
public interface MultipleInterfaceContract {
    interface View extends IView {
        String presenterGetDataFromView();
    }

    interface Presenter {
        String viewGetDataFromPresenter(int viewDataIndex);
    }
}