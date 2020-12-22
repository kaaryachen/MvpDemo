package com.zhouxi.mvpdemo.base;

import com.zhouxi.mvpdemo.presenter.IPresenter;
import com.zhouxi.mvpdemo.view.IView;

import java.util.ArrayList;
import java.util.List;
/**
 * Base multiple presenter in presenter layer
 *
 * @Author: ZhouXi
 * @since 2020-12-04
 */
public class MultipleBasePresenter<T extends IView> extends SingleBasePresenter<T> {
    private T mView;

    private List<IPresenter> presenters = new ArrayList<>();

    @SafeVarargs
    public final <K extends IPresenter<T>> void addPresenter(K... addPresenter) {
        for (K ap : addPresenter) {
            ap.attachView(mView);
            presenters.add(ap);
        }
    }

    public MultipleBasePresenter(T mView) {
        this.mView = mView;
    }

    @Override
    public void detachView() {
        for (IPresenter presenter : presenters) {
            presenter.detachView();
        }
    }
}
