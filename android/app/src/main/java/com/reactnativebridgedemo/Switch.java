package com.reactnativebridgedemo;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

public class Switch extends Button {
    public Boolean isTurnedOn = false;
    public String textProp="default text";
    public void setIsTurnedOn (Boolean switchStatus){
        isTurnedOn = switchStatus;
        changeColor();
    }
    public void setTextProp (String textStatus){
        textProp = textStatus;
    }

    public Switch(Context context) {
        super(context);
        this.setTextColor(Color.BLUE);
        this.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                isTurnedOn = !isTurnedOn;
                changeColor();
            }
        });
        changeColor();
    }
    private void changeColor() {
        if (isTurnedOn) {
            setBackgroundColor(Color.YELLOW);
            setText("I am ON with" + textProp);
        } else {
            setBackgroundColor(Color.GRAY);
            setText("I am OFF with" + textProp);
        }
    }

    public Switch(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public Switch(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
