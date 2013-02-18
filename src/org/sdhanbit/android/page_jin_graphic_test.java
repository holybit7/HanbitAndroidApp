package org.sdhanbit.android;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created with IntelliJ IDEA.
 * User: jinhyunc
 * Date: 2/17/13
 * Time: 8:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class page_jin_graphic_test extends Activity {

    protected class MyView extends View
    {
        int x= 100, y = 100;
        String str;
        //String is a sentence that device view on the display what you write in "~"

        public MyView(Context context)
        {
            super(context);
            setBackgroundColor(Color.BLACK);
        }

        @Override
        protected void onDraw(Canvas canvas)
        {
            Paint paint = new Paint();
            paint.setColor(Color.WHITE);
            //ctrl+spacebar to show available declaration and press Enter to finish which you have selected
            canvas.drawRect(x,y,x+50,y+50,paint);
            canvas.drawText("action type"+ str, 0, 20, paint);
            canvas.drawText("x axis"+ x,0,40,paint);
            canvas.drawText("y axis"+ y,0,60,paint);
        }

        @Override
        public boolean  onTouchEvent(MotionEvent event)
        {
            x = (int) event.getX();
            //getX() is calling X axis value
            y = (int) event.getY();

            if (event.getAction()==MotionEvent.ACTION_DOWN)
                //when you click of touch device display that is ACTION_DOWN
                str = "ACTION_DOWN";
            if (event.getAction()==MotionEvent.ACTION_MOVE)
                //while you touch device and move around your finger this action is used to be ACTION_MOVE
                str = "ACTION_MOVE";
            if (event.getAction()==MotionEvent.ACTION_UP)
                //when you take off finger from device display or button that is ACTION_UP
                str = "ACTION_UP";
            invalidate();
            //it is nothing just ignore what ever it happens
            return true;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        MyView w = new MyView(this);
        setContentView(w);
    }



}
