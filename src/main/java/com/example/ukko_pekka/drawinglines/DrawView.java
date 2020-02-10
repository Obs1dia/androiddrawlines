package com.example.ukko_pekka.drawinglines;

/**
 * Created by Ukko-Pekka on 27.11.2017.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class DrawView extends View {
    Paint paint = new Paint();
    private final int paintColor = Color.BLACK;
    private Paint drawPaint;
    private void init() {
        paint.setColor(Color.BLACK);
    }

    public DrawView(Context context ) {
        super(context);
        init();
    }


    public DrawView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }
    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setupPaint();
    }
    private void setupPaint() {
        drawPaint = new Paint();
        drawPaint.setColor(paintColor);
        drawPaint.setAntiAlias(true);
        drawPaint.setStrokeWidth(5);
        drawPaint.setStyle(Paint.Style.STROKE);
        drawPaint.setStrokeJoin(Paint.Join.ROUND);
        drawPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public void onDraw(Canvas canvas) {
        //x ja y akseli
        canvas.drawLine(50,100,50,1000, drawPaint);
        canvas.drawLine(0,550,900,550,drawPaint);
        drawPaint.setStrokeWidth(3);
        // lämpöasteet
        canvas.drawLine(40, 150,60,150, drawPaint);//+4
        canvas.drawLine(40, 250,60,250, drawPaint);//+3
        canvas.drawLine(40, 350,60,350, drawPaint);//+2
        canvas.drawLine(40, 450,60,450, drawPaint);//+1
        canvas.drawLine(40, 650,60,650, drawPaint);//-1
        canvas.drawLine(40, 750,60,750, drawPaint);//-2
        canvas.drawLine(40, 850,60,850, drawPaint);//-3
        canvas.drawLine(40, 950,60,950, drawPaint);//-4
        // viikonpäivät
        drawPaint.setStrokeWidth(5);
        canvas.drawLine(40,1000,900,1000,drawPaint);
        drawPaint.setStrokeWidth(3);
        canvas.drawLine(160,1050,160,100,drawPaint);
        canvas.drawLine(280,1050,280,100,drawPaint);
        canvas.drawLine(400,1050,400,100,drawPaint);
        canvas.drawLine(520,1050,520,100,drawPaint);
        canvas.drawLine(640,1050,640,100,drawPaint);
        canvas.drawLine(760,1050,760,100,drawPaint);

        //lämpöasteet
        drawPaint.setStrokeWidth(5);
        drawPaint.setColor(Color.RED);
        canvas.drawLine(40,350,160,250,drawPaint);
        canvas.drawLine(160,250,280,250,drawPaint);
        canvas.drawLine(280,250,400,550,drawPaint);
        drawPaint.setColor(Color.CYAN);
        canvas.drawLine(400,550,520,650,drawPaint);
        canvas.drawLine(520,650,640,600,drawPaint);
        canvas.drawLine(640,600,760,750,drawPaint);
        canvas.drawLine(760,750,880,825,drawPaint);


        //lämpöasteluvut ja viikonpäivämerkinnät
        drawPaint.setStrokeWidth(3);
        drawPaint.setColor(Color.BLACK);
        drawPaint.setTextSize(48f);
        canvas.drawText("+1",30,450, drawPaint);
        canvas.drawText("+2",30,350, drawPaint);
        canvas.drawText("+3",30,250, drawPaint);
        canvas.drawText("+4",30,150, drawPaint);
        canvas.drawText("-1",30,650, drawPaint);
        canvas.drawText("-2",30,750, drawPaint);
        canvas.drawText("-3",30,850, drawPaint);
        canvas.drawText("-4",30,950, drawPaint);

        canvas.drawText("MA",80,1050, drawPaint);
        canvas.drawText("TI",200,1050, drawPaint);
        canvas.drawText("KE",320,1050, drawPaint);
        canvas.drawText("TO",440,1050, drawPaint);
        canvas.drawText("PE",560,1050, drawPaint);
        canvas.drawText("LA",680,1050, drawPaint);
        canvas.drawText("SU",800,1050, drawPaint);

    }

}