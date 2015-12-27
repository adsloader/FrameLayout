package com.adslo.framelayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    ImageButton btnCount = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUI();
    }

    // 화면을 설정하는 메소드
    private void setUpUI() {
        btnCount = (ImageButton) findViewById(R.id.imageButton);
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sDisplay = "";
                for (int i = 0; i < 100; i++){
                    sDisplay += Integer.toString( i) + "\n" ;
                }
                TextView txtCount = (TextView) findViewById(R.id.textView);
                txtCount.setText(sDisplay);
            }
        });
    }
}
