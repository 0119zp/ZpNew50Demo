package zp.com.zpnew50demo.activity;

import android.app.Activity;
import android.os.Bundle;

import zp.com.zpnew50demo.R;

/**
 * Created by Administrator on 2017/4/25 0025.
 */

public class ZpCardViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);
    }

    /**
     * app:cardBackgroundColor      这是设置背景颜色
     * app:cardCornerRadius         这是设置圆角大小
     * app:cardElevation            这是设置z轴的阴影
     * app:cardMaxElevation         这是设置z轴的最大高度值
     * app:cardUseCompatPadding     是否使用CompatPadding
     * app:cardPreventCornerOverlap 是否使用PreventCornerOverlap
     * app:contentPadding           设置内容的padding
     * app:contentPaddingLeft       设置内容的左padding
     * app:contentPaddingTop        设置内容的上padding
     * app:contentPaddingRight      设置内容的右padding
     * app:contentPaddingBottom     设置内容的底padding
     */
}
