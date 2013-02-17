package org.sdhanbit.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


/**
 * Created with IntelliJ IDEA.
 * User: jinhyunc
 * Date: 2/16/13
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class page_jintest extends Activity {
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

        setContentView(R.layout.page_jintest);

        TextView tv1 = (TextView) findViewById (R.id.textView1);
        tv1.setText("This is Jin's test page!\nGod bless you");
    }
}
