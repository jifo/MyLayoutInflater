package org.iptime.mylayoutinflater;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by joff on 2015-06-02.
 */
public class SubLayout extends LinearLayout{

    public SubLayout(Context context) {
        super(context);

        init(context);
    }



    public SubLayout(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.subl_ayout, this, true);
    }
}
