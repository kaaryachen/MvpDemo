package com.zhouxi.mvpdemo.presenter;

import com.zhouxi.mvpdemo.view.IView;

/**
 * Top layer presenter interface
 *
 * @Author: ZhouXi
 * @since 2020-12-04
 */
public interface IPresenter<T extends IView> {
    void attachView(T view);

    void detachView();

    boolean isViewAttached();
}
