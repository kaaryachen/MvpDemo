package com.zhouxi.mvpdemo.contract;

import com.zhouxi.mvpdemo.view.IView;

/**
 * Multiple interface contract
 *
 * @Auther: ZhouXi
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