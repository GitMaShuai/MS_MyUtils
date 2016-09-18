package utils;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.WindowManager.LayoutParams;

import com.ms.myutils.R;


/**
 * 去掉黑色背景，可以自由设置大小的Dialog
 * @author MaShuai
 * @version 1.0
 * @created 2016-8-9
 */
public class MyDialog extends Dialog {

	private Context mContext;
	private LayoutInflater inflater;
	private LayoutParams lp;
	private int mLayoutId;
	/**
	 * width，height弹窗的宽高，默认为300
	 * @author huangchaobo
	 * created at 2016/5/19 21:14
	 */
	public MyDialog(Context context, Integer layoutId, float width, float height) {
		super(context, R.style.MyDialogStyle);

		this.mContext = context;
		this.mLayoutId=layoutId;
		setContentView(mLayoutId);
		// 设置window属性
		lp = getWindow().getAttributes();
		lp.gravity = Gravity.CENTER;
		lp.dimAmount = 0.5f; // 去背景遮盖
		lp.alpha = 1.0f;
		lp.width = dip2px(width);
		lp.height = dip2px(height);
		getWindow().setAttributes(lp);
		setCancelable(false);

	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);



	}
	/**
	 * dp 转 px
	 */
	public  int dip2px(float dpValue) {
		final float scale =mContext.getResources().getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);
	}
}