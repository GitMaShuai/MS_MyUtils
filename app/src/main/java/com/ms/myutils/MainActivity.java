package com.ms.myutils;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import utils.MyDialog;
import utils.MySelector;
import utils.MyShap;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
public class MainActivity extends AppCompatActivity {

    private TextView tv2, tv3, tv4, tv5;
    private MyShap maShap;
    private LinearLayout ll1,ll2;
    private CheckBox tv1;
    private MyDialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setLLBackgroung();
        setSelector();
        setSahap();
        setDialog();
    }

    private void initView() {
        ll1 = (LinearLayout) findViewById(R.id.ll1);
        tv1 = (CheckBox) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);

        ll2 = (LinearLayout) findViewById(R.id.ll2);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
    }

    private void setLLBackgroung() {
        MyShap myShap1 = new MyShap(this, Color.LTGRAY, Color.GRAY, -5, 2);
        ll1.setBackground(myShap1.getDrawable());
    }

    private void setSelector() {
        MyShap myShapN = new MyShap(this, Color.TRANSPARENT, Color.RED, 8, 1);
        MyShap myShapP = new MyShap(this, Color.RED, Color.RED, 8, 1);
        MySelector mySelector = new MySelector(myShapP.getDrawable(), myShapN.getDrawable());

        tv1.setBackground(mySelector.getDrawable());
        tv1.setTextColor(mySelector.createColorStateList(Color.RED, Color.WHITE));
    }


    private void setSahap() {

        MyShap myShapN1 = new MyShap(this, Color.TRANSPARENT, Color.BLUE, 20, 1);
        MyShap myShapP1 = new MyShap(this, Color.BLUE, Color.BLACK, 20, 1);
        MySelector mySelector1 = new MySelector(myShapP1.getDrawable(), myShapN1.getDrawable());
        tv2.setBackground(mySelector1.getDrawable());
        tv2.setTextColor(mySelector1.createColorStateList(Color.BLUE, Color.WHITE));
        tv2.setClickable(true);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(MainActivity.this.findViewById(R.id.ll1), "This is a Snackbar", Snackbar.LENGTH_INDEFINITE).
                        setAction("Cancel", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                            }
                        }).
                        setCallback(new Snackbar.Callback() {
                            @Override
                            public void onDismissed(Snackbar snackbar, int event) {
                                super.onDismissed(snackbar, event);
                                Toast.makeText(MainActivity.this,"This is a Toast",Toast.LENGTH_SHORT).show();
                                tv1.setChecked(false);
                            }

                            @Override
                            public void onShown(Snackbar snackbar) {
                                super.onShown(snackbar);
                                tv1.setChecked(true);
                            }
                        }).
                        setDuration(2000).
                        show();
            }
        });

    }

    private void setDialog() {
        MyShap myShap2 = new MyShap(this, Color.TRANSPARENT, Color.CYAN, 8, 1);
        tv3.setBackground(myShap2.getDrawable());
        tv3.setTextColor(Color.WHITE);
        myDialog=new MyDialog(this,R.layout.my_dialog,200,300);
        myDialog.setCanceledOnTouchOutside(true);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.show();
            }
        });
        myDialog.getWindow().findViewById(R.id.lld).setBackground(myShap2.getDrawable());
    }

}
