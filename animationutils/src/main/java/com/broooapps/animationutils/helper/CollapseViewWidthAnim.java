package com.broooapps.animationutils.helper;

/**
 * Created by Swapnil Tiwari on 2019-05-22.
 * swapnil.tiwari@box8.in
 */

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by Swapnil Tiwari on 2019-05-22.
 * swapnil.tiwari@box8.in
 */
public class CollapseViewWidthAnim extends Animation {

    private View view;
    private int width;
    private int diffWidth;

    public CollapseViewWidthAnim(View view, int prevWidth, int toWidth) {
        this.view = view;
        this.width = prevWidth;
        this.diffWidth = prevWidth - toWidth;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (width - diffWidth * interpolatedTime);
        if(layoutParams.width <= view.getLayoutParams().width) view.setLayoutParams(layoutParams);
    }

    @Override
    public boolean willChangeBounds() {
        return true;
    }
}

