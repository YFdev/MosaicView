package com.elapse.mosaicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 *
 * Created by YF_lala on 2019/6/23.
 */

public class MosaicView extends android.support.v7.widget.AppCompatImageView {
    private Resources mResources;
    private Paint mPaint;
    private Bitmap b1,b2,b3,b4;
    private int mosaicType = 0;
//    private Rect mSrcRect,mDestRect;
    private int totalHeight,totalWidth;
    private int screenWidth;
    WindowManager windowManager;
    private Rect mSrcRect1,mDestRect1,mSrcRect2,mDestRect2,mSrcRect3,mDestRect3,mSrcRect4,mDestRect4;

    public MosaicView(Context context) {
        this(context,null);
    }

    public MosaicView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MosaicView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        windowManager= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics metrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(metrics);
        screenWidth = metrics.widthPixels;
//        screenWidth = windowManager.getDefaultDisplay().getWidth();
        mResources = getResources();
        intiBitmap();
        initPaint();
    }

    private void intiBitmap() {
        //todo optimize bitmap
        b1 = ((BitmapDrawable)mResources.getDrawable(R.mipmap.ic_launcher_round)).getBitmap();
        b2 = ((BitmapDrawable)mResources.getDrawable(R.mipmap.ic_launcher_round)).getBitmap();
        b3 = ((BitmapDrawable)mResources.getDrawable(R.mipmap.ic_launcher_round)).getBitmap();
        b4 = ((BitmapDrawable)mResources.getDrawable(R.mipmap.ic_launcher_round)).getBitmap();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        totalWidth = w;
        totalHeight = h;
    }

    private void initPaint() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setFilterBitmap(true);
        mPaint.setDither(true);

        mSrcRect1 = new Rect();
        mDestRect1 = new Rect();
        mSrcRect2 = new Rect();
        mDestRect2 = new Rect();
        mSrcRect3 = new Rect();
        mDestRect3 = new Rect();
        mSrcRect4 = new Rect();
        mDestRect4 = new Rect();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(screenWidth,screenWidth);
    }

    @Override
    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
        switch (mosaicType){
            case 0:
                mSrcRect1.set(0,0,b1.getWidth(),b1.getHeight());
                mDestRect1.set(0,0,totalWidth/2,totalHeight/2);

                mSrcRect2 .set(0,0,b2.getWidth(),b2.getHeight());
                mDestRect2.set(totalWidth/2,0,totalWidth,totalHeight/2);

                mSrcRect3 .set(0,0,b3.getWidth(),b3.getHeight());
                mDestRect3.set(0,totalHeight/2,totalWidth/2,totalHeight);

                mSrcRect4 .set(0,0,b4.getWidth(),b4.getHeight());
                mDestRect4 .set(totalWidth/2,totalHeight/2,totalWidth,totalHeight);
                break;
            case 1:
//                mSrcRect1.set();
//                mDestRect1.set();
//                mSrcRect2.set();
//                mDestRect2 .set();
//                mSrcRect3 .set();
//                mDestRect3 .set();
//                mSrcRect4 .set();
//                mDestRect4.set();
                break;
            case 2:
//                mSrcRect1.set();
//                mDestRect1.set();
//                mSrcRect2.set();
//                mDestRect2.set();
//                mSrcRect3.set();
//                mDestRect3.set();
//                mSrcRect4.set();
//                mDestRect4.set();
                break;
            case 3:
//                mSrcRect1.set();
//                mDestRect1.set();
//                mSrcRect2.set();
//                mDestRect2.set();
//                mSrcRect3.set();
//                mDestRect3.set();
//                mSrcRect4.set();
//                mDestRect4.set();
                break;
            case 4:
//                mSrcRect1.set();
//                mDestRect1.set();
//                mSrcRect2.set();
//                mDestRect2.set();
//                mSrcRect3.set();
//                mDestRect3.set();
//                mSrcRect4.set();
//                mDestRect4.set();
                break;
            case 5:
//                mSrcRect1.set();
//                mDestRect1.set();
//                mSrcRect2.set();
//                mDestRect2.set();
//                mSrcRect3.set();
//                mDestRect3.set();
//                mSrcRect4.set();
//                mDestRect4.set();
                break;
            case 6:
//                mSrcRect1.set();
//                mDestRect1.set();
//                mSrcRect2.set();
//                mDestRect2.set();
//                mSrcRect3.set();
//                mDestRect3.set();
//                mSrcRect4.set();
//                mDestRect4.set();
                break;
            case 7:
//                mSrcRect1.set();
//                mDestRect1.set();
//                mSrcRect2.set();
//                mDestRect2.set();
//                mSrcRect3.set();
//                mDestRect3.set();
//                mSrcRect4.set();
//                mDestRect4.set();
                break;
            case 8:
//                mSrcRect1.set();
//                mDestRect1.set();
//                mSrcRect2.set();
//                mDestRect2.set();
//                mSrcRect3.set();
//                mDestRect3.set();
//                mSrcRect4.set();
//                mDestRect4.set();
                break;
            case 9:
//                mSrcRect1.set();
//                mDestRect1.set();
//                mSrcRect2.set();
//                mDestRect2.set();
//                mSrcRect3.set();
//                mDestRect3.set();
//                mSrcRect4.set();
//                mDestRect4.set();
                break;
                default:
                    break;
        }

        canvas.drawBitmap(b1,mSrcRect1,mDestRect1,mPaint);
        canvas.drawBitmap(b2,mSrcRect2,mDestRect2,mPaint);
        canvas.drawBitmap(b3,mSrcRect3,mDestRect3,mPaint);
        canvas.drawBitmap(b4,mSrcRect4,mDestRect4,mPaint);
    }

//    public void setB1(String b1) {
//        this.b1 = b1;
//    }
//
//    public void setB2(String b2) {
//        this.b2 = b2;
//    }
//
//    public void setB3(String b3) {
//        this.b3 = b3;
//    }
//
//    public void setB4(String b4) {
//        this.b4 = b4;
//    }

    public void setMosaicType(int mosaicType) {
        this.mosaicType = mosaicType;
    }
}
