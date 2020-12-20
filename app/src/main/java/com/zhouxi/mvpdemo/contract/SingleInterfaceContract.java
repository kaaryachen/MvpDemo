package com.zhouxi.mvpdemo.contract;

import com.zhouxi.mvpdemo.view.IView;

/**
 * Single interface contract
 *
 * @Auther: ZhouXi
 * @since 2020-12-04
 */
public interface SingleInterfaceContract {
    interface View extends IView {
        String presenterGetDataFromView();
    }

    interface Presenter {
        String viewGetDataFromPresenter(int viewDataIndex);
    }
}
