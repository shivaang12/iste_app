package com.gcet.technica.iste.gcetiste;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * Created by shiva on 9/17/2015.
 */
public class MyTextView extends TextView {

    public MyTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public MyTextView(Context context) {
        super(context);
    }
    public void setTypeface(Typeface tf, int style) {
        if (style == Typeface.BOLD) {
            super.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/roboto_thin.ttf"));
        } else {
            super.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/roboto_thin.ttf"));
        }
    }
}
