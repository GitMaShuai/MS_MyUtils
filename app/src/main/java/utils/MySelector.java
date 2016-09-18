package utils;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

/**
 * Created by Ms on 2016/8/5.
 */
public class MySelector {
    StateListDrawable drawable;

    public MySelector(Drawable drawableP, Drawable drawableN) {

        drawable = new StateListDrawable();

        drawable.addState(new int[]{android.R.attr.state_checked,},drawableP);
        drawable.addState(new int[]{android.R.attr.state_pressed},drawableP);
        drawable.addState(new int[]{},drawableN);
    }

    /**
     * 对TextView设置不同状态时其文字颜色。
     */
    public ColorStateList createColorStateList(int normal, int pressed) {
        int[] colors = new int[]{pressed, pressed,normal};
        int[][] states = new int[3][];
        states[0] = new int[]{android.R.attr.state_checked};
        states[1] = new int[]{android.R.attr.state_pressed};
        states[2] = new int[]{};
        ColorStateList colorList = new ColorStateList(states, colors);
        return colorList;
    }

    public Drawable getDrawable() {

        return drawable;
    }
}
