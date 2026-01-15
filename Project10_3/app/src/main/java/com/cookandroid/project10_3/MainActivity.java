package com.cookandroid.project10_3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("액티비티 테스트 예제");
        Log.i("액티비티 테스트", "onCreate() 호출됨");

        Button btnDial = findViewById(R.id.btnDial);
        Button btnFinish = findViewById(R.id.btnFinish);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri  = Uri.parse("tel:01012345678");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("액티비티 테스트", "onStop() 호출됨");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("액티비티 테스트", "onStart() 호출됨");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("액티비티 테스트", "onResume() 호출됨");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("액티비티 테스트", "onRestart() 호출됨");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("액티비티 테스트", "onPause() 호출됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("액티비티 테스트", "onDestroy() 호출됨");
    }
}