package com.bezier;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends Activity {
    private  RadioButton button1,button2;
    private BezierView2 bezierView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //BezierView bezierView = new BezierView(this);
        //setContentView(bezierView);
       /* setContentView(R.layout.activity_main);
        bezierView2 = findViewById(R.id.bezierView2);
        RadioGroup mRadioGroup = findViewById(R.id.radiogroup);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i) {
                    case R.id.button1:
                        bezierView2.setMode(true);
                        break;
                    case R.id.button2:
                        bezierView2.setMode(false);
                        break;
                    default:
                        break;
                }
            }
        });*/
        setContentView(R.layout.activity_main1);

    }
}
