package com.example.kranthikumarpolimetla.lifecycledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        next  = (Button) findViewById(R.id.nextPage);
        textView.append("on create called \n");
        Log.d("life-cycle", "on create called");
        SecondActivity.firstName = "Kranthi kumar";
        SecondActivity.lastName = "Polimetla";
        next.setOnClickListener((view)-> {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("email", "khalejakranthi@gmail.com");
            intent.putExtra("phoneNo", "9799000155");
            intent.putExtra("address", "irving, Texas");
            startActivity(intent);
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        textView.append("on start called \n");
        Log.d("life-cycle", "on start called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        textView.append("on resume called \n");
        Log.d("life-cycle", "on resume called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        textView.append("on stop called \n");
        Log.d("life-cycle", "on stop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textView.append("on destroy called \n");
        Log.d("life-cycle", "on destroy called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textView.append("on restart called \n");
        Log.d("life-cycle", "on restart called");
    }
}
