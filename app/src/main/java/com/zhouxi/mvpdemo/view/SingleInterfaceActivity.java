package com.zhouxi.mvpdemo.view;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zhouxi.mvpdemo.R;
import com.zhouxi.mvpdemo.contract.SingleInterfaceContract;
import com.zhouxi.mvpdemo.base.BaseMVPActivity;
import com.zhouxi.mvpdemo.presenter.SingleInterfacePresenter;

/**
 * Single implementation class in view layer
 *
 * @Author: ZhouXi
 * @since 2020-12-04
 */
public class SingleInterfaceActivity extends BaseMVPActivity<SingleInterfacePresenter> implements SingleInterfaceContract.View {
    private Button button;

    private TextView textView;

    @Override
    protected SingleInterfacePresenter createPresenter() {
        Log.d("MvpDemo", "createPresenter");
        return new SingleInterfacePresenter();
    }

    @Override
    protected void init() {
        setContentView(R.layout.activity_single_interface);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(mPresenter.sendDataFromPresenterToView());
            }
        });
    }

    @Override
    public String presenterGetDataFromView() {
        return "book";
    }
}
