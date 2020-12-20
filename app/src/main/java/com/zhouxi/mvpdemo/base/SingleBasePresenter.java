package com.zhouxi.mvpdemo.base;

import android.util.Log;

import com.zhouxi.mvpdemo.presenter.IPresenter;
import com.zhouxi.mvpdemo.view.IView;

/**
 * Base single presenter in presenter layer
 *
 * @Auther: ZhouXi
 * @since 2020-12-04
 */
public abstract class SingleBasePresenter<T extends IView> implements IPresenter<T> {
    protected T mView;

    @Override
    public void attachView(T view) {
        Log.e("MvpDemo", "attachView");
        if (view == null) {
            Log.e("MvpDemo", "mView is null");
        }
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    @Override
    public boolean isViewAttached() {
        return mView != null;
    }
}
