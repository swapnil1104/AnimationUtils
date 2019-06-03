package com.broooapps.animationutils;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;

import com.broooapps.animationutils.helper.CollapseViewHeightAnim;
import com.broooapps.animationutils.helper.CollapseViewWidthAnim;
import com.broooapps.animationutils.helper.ExpandViewHeightAnim;
import com.broooapps.animationutils.helper.ExpandViewWidthAnim;

/**
 * Created by Swapnil Tiwari on 2019-05-22.
 * swapnil.tiwari@box8.in
 */
public class AnimUtil {

    public static void expandLayoutVertically(final View view, int expandHeight, int durationMs) {

        ExpandViewHeightAnim expandAnimation = new ExpandViewHeightAnim(view, view.getHeight(), expandHeight);
        expandAnimation.setDuration(durationMs);
        expandAnimation.setInterpolator(new AccelerateDecelerateInterpolator());

        expandAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                view.setVisibility(View.VISIBLE);

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        view.startAnimation(expandAnimation);
    }

    public static void collapseLayoutVertically(final View view, int durationMs) {

        CollapseViewHeightAnim collapseAnimation = new CollapseViewHeightAnim(view, view.getHeight(), 0);
        collapseAnimation.setDuration(durationMs);
        collapseAnimation.setInterpolator(new AccelerateDecelerateInterpolator());

        collapseAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                view.setVisibility(View.VISIBLE);

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                /*view.setVisibility(View.INVISIBLE);*/
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        view.startAnimation(collapseAnimation);
    }

    public static void expandLayoutHorizontally(final View view, int expandWidth, int durationMs) {

        ExpandViewWidthAnim expandAnimation = new ExpandViewWidthAnim(view, view.getWidth(), expandWidth);
        expandAnimation.setDuration(durationMs);
        expandAnimation.setInterpolator(new AccelerateDecelerateInterpolator());

        expandAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                view.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        view.startAnimation(expandAnimation);
    }

    public static void collapseLayoutHorizontally(final View view, int durationMs) {

        CollapseViewWidthAnim collapseAnimation = new CollapseViewWidthAnim(view, view.getWidth(), 0);
        collapseAnimation.setDuration(durationMs);
        collapseAnimation.setInterpolator(new AccelerateDecelerateInterpolator());

        collapseAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                view.setVisibility(View.VISIBLE);

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        view.startAnimation(collapseAnimation);
    }


}
