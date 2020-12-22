package com.zhouxi.mvpdemo.view;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zhouxi.mvpdemo.contract.MultipleInterfaceContract;
import com.zhouxi.mvpdemo.R;
import com.zhouxi.mvpdemo.contract.SingleInterfaceContract;
import com.zhouxi.mvpdemo.base.BaseMVPActivity;
import com.zhouxi.mvpdemo.base.MultipleBasePresenter;
import com.zhouxi.mvpdemo.presenter.MultipleInterfacePresenter;
import com.zhouxi.mvpdemo.presenter.SingleInterfacePresenter;

/**
 * Multiple implementation class in view layer
 *
 * @Author: ZhouXi
 * @since 2020-12-04
 */
public class MultipleInterfaceActivity extends BaseMVPActivity<MultipleBasePresenter>
        implements SingleInterfaceContract.View, MultipleInterfaceContract.View {

    private Button button;
    private TextView textView;
    private Button btn;
    private TextView tv;
    private SingleInterfacePresenter singleInterfacePresenter;
    private MultipleInterfacePresenter multipleInterfacePresenter;


    @Override
    protected void init() {
        setContentView(R.layout.activity_multiple_interface);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                singleInterfacePresenter.sendDataFromPresenterToView();
            }
        });


        btn = findViewById(R.id.btn);
        tv = findViewById(R.id.tv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multipleInterfacePresenter.viewGetDataFromPresenter(4);
            }
        });
    }

    @Override
    protected MultipleBasePresenter createPresenter() {
        MultipleBasePresenter multipleBasePresenter = new MultipleBasePresenter(this);

        singleInterfacePresenter = new SingleInterfacePresenter();
        multipleInterfacePresenter = new MultipleInterfacePresenter();

        multipleBasePresenter.addPresenter(singleInterfacePresenter);
        multipleBasePresenter.addPresenter(multipleInterfacePresenter);
        return multipleBasePresenter;
    }

    @Override
    public String presenterGetDataFromView() {
        return "book";
    }
}

