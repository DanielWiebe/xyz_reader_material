package com.example.xyzreader.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;

public class AnimationUtils {

     public static void translateYAnimate(RecyclerView.ViewHolder holder , boolean goesDown){


          AnimatorSet animatorSet = new AnimatorSet();

          ObjectAnimator animatorTranslateY = ObjectAnimator.ofFloat(holder.itemView, "translationY", goesDown ? 200 : -200, 0);
          animatorTranslateY.setDuration(500);

          animatorSet.playTogether(animatorTranslateY);

          animatorSet.start();

     }
}