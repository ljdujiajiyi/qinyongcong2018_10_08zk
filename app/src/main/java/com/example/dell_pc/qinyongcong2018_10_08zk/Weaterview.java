package com.example.dell_pc.qinyongcong2018_10_08zk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/*
 * 作者：秦永聪
 *日期：2018/10/8
 * */public class Weaterview extends View {
    Paint paint1;
    Paint paint2;
    Path path1;
    Path path2;
    private float a;
    public Weaterview(Context context) {
        super(context);
        init(context);
    }



    public Weaterview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public Weaterview(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }
    private void init(Context context) {
       paint1=new Paint();
       paint2=new Paint();
       paint1.setColor(Color.YELLOW);
       paint2.setColor(Color.BLUE);
       paint1.setAntiAlias(true);
       paint2.setAntiAlias(true);
       path1 =new Path();
       path2 =new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        path1.reset();
        path2.reset();
        path1.moveTo(getLeft(),getBottom());
        path2.moveTo(getLeft(),getBottom());
        double my=Math.PI*2/getWidth();
        a-=0.1f;
        for (int i=0;i<getWidth();i+=20){
            path1.lineTo(i, (float) (10*(Math.cos(my*i+a))+10));
            path2.lineTo(i, (float) (10*(Math.sin(my*i+a))));
        }
        path1.lineTo(getRight(),getBottom());
        path2.lineTo(getRight(),getBottom());
        canvas.drawPath(path1,paint1);
        canvas.drawPath(path2,paint2);
       postInvalidateDelayed(20);
     }
     private Animalister listter;
     public void anmio(Animalister listter){
         this.listter=listter;
     }
     public interface  Animalister{
        void anmio(float f);
     }
}
