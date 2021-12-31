package com.michaldabski.filemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class SykTestActivity extends AppCompatActivity implements View.OnClickListener {

    public int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        number = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syk_test);
        findViewById(R.id.back).setOnClickListener(this);
        findViewById(R.id.add_one).setOnClickListener(this);
    }



    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.back:
                //return to pre activaty
                finish();
                break;
            case R.id.add_one:
                number = number + 10;
                TextView text = (TextView)findViewById(R.id.my_number);
                text.setText(Integer.toString(number));
                break;

        }
    }
}