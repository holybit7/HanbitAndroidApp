package org.sdhanbit.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.content.Intent;
import android.view.View.OnClickListener;

/**
 * Created with IntelliJ IDEA.
 * User: jinhyunc
 * Date: 2/16/13
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class page_jintest extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_jintest);

        TextView tv1 = (TextView) findViewById (R.id.textView1);
        tv1.setText("This is Jin's test page!\nGod bless you");

        //Jin Test 02.16
        Button b2 = (Button) findViewById(R.id.button_jin2);
        b2.setText("GraphicTest");
        b2.setOnClickListener(this);
    }

    public void onClick(View v) {
        //To change body of implemented methods use File | Settings | File Templates.
        switch (v.getId()) {
            case R.id.button_jin2:
                Intent intent2 = new Intent(this,page_jin_graphic_test.class);
                startActivity(intent2);
                break;
        }
    }
}




