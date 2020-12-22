package com.zhouxi.mvpdemo.contract;

import com.zhouxi.mvpdemo.view.IView;

/**
 * Single interface contract
 *
 * @Author: ZhouXi
 * @since 2020-12-04
 */
public interface SingleInterfaceContract {
    interface View extends IView {
        String presenterGetDataFromView();
    }

    interface Presenter {
        String sendDataFromPresenterToView();
    }
}
