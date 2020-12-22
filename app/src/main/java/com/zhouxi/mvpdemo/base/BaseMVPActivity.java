package com.zhouxi.mvpdemo.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zhouxi.mvpdemo.presenter.IPresenter;
import com.zhouxi.mvpdemo.view.IView;

/**
 * Base activity in view layer
 *
 * @Author: ZhouXi
 * @since 2020-12-04
 */
public abstract class BaseMVPActivity<T extends IPresenter> extends AppCompatActivity implements IView {
    protected T mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initPresenter();
        init();
    }

    protected void initPresenter() {
        mPresenter = createPresenter();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroy();
    }

    protected abstract T createPresenter();

    protected abstract void init();
}
