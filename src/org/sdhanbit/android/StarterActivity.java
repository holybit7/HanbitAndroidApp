package org.sdhanbit.android;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import org.sdhanbit.android.util.CurrentTime;
import com.google.inject.Inject;
import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;
import android.view.View;
import android.view.View.OnClickListener;

public class StarterActivity extends RoboActivity implements OnClickListener {
    @InjectView(R.id.title)
    TextView title;

    @InjectView(R.id.current_time)
    TextView currentTimeText;

    @Inject
    private CurrentTime currentTime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        title.setText("Hello World");
        currentTimeText.setText(String.valueOf(currentTime.currentTimeMillis()));

        //Jin Test 02.16
        Button b1 = (Button) findViewById(R.id.button_jin1);
        b1.setText("JinTest");
        b1.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_jin1:
                Intent intent1 = new Intent(this,page_jintest.class);
                startActivity(intent1);
                break;
        }
    }
}
