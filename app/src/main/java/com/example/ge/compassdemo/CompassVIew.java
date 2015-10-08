package com.example.ge.compassdemo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ge on 2015/10/8.
 */
public class CompassVIew extends View {
    private float bearing;

    public CompassVIew(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initCompassView();

    }

    public CompassVIew(Context context, AttributeSet attrs) {

        super(context, attrs);
        initCompassView();
    }

    public CompassVIew(Context context) {

        super(context);
        initCompassView();
    }
    private Paint markerPaint;
    private Paint textPaint;
    private Paint circlePaint;
    private String northString;
    private String eastString;
    private String westString;
    private String SouthString;
    private int textHeight;

    public void initCompassView() {
        setFocusable(true);
        Resources r=this.getResources();
        
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measuredHeight;
        int measuredWitdh;
        measuredHeight = measure(heightMeasureSpec);
        measuredWitdh = measure(widthMeasureSpec);
        int d = Math.min(measuredHeight, measuredWitdh);
        setMeasuredDimension(d, d);

    }

    private int measure(int measureSpec) {
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);
        int result = 0;
        if (specMode == MeasureSpec.UNSPECIFIED) {
            result = 200;
        } else {
            result = specSize;
        }
        return result;
    }

    public void setBearing(float bearing) {
        this.bearing = bearing;
    }

    public float getBearing() {
        return bearing;
    }

}
