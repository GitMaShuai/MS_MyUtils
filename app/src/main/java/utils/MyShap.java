package utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/**
 * Created by Ms on 2016/8/4.
 */
/**
 * 生成圆角矩形背景
 * @author Administrator
 *
 */
public class MyShap {

    private Context mContext;
    private int roundRadius ;//圆角半径
    private int strokeWidth = 0;//边框厚度
    private int strokeColor;
    private int inColor;

    public Context getmContext() {
        return mContext;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    public int getRoundRadius() {
        return roundRadius;
    }

    public void setRoundRadius(int roundRadius) {
        this.roundRadius = roundRadius;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public int getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(int strokeColor) {
        this.strokeColor = strokeColor;
    }

    public int getInColor() {
        return inColor;
    }

    public void setInColor(int inColor) {
        this.inColor = inColor;
    }

    public  MyShap(Context mContext){}

    public  MyShap(Context mContext, int colorMain, int colorEdg, int radius, int edgWidth){
        this.mContext    = mContext;
        this.strokeWidth = edgWidth; // 3dp 边框宽度
        this.roundRadius = radius;   // 8dp 圆角半径
        this.strokeColor = colorEdg; //边框颜色
        this.inColor     = colorMain;//内部填充颜色

    }

    public Drawable getDrawable(){

        GradientDrawable gd = new GradientDrawable();//创建drawable
        gd.setColor(inColor);
        gd.setCornerRadius(dip2px(roundRadius));
        gd.setStroke(dip2px(strokeWidth), strokeColor);

        return gd;
    }
    /**
     * dp 转 px
     */
    public  int dip2px(float dpValue) {
        final float scale =mContext.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

}