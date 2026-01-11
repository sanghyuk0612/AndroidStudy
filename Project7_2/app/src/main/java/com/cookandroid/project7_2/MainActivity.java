package com.cookandroid.project7_2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
     Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("change background(Context Menu)");
        baseLayout = (LinearLayout) findViewById(R.id.baselayout);
        button1 = findViewById(R.id.button1);
        registerForContextMenu(button1);
        button2 = findViewById(R.id.button2);
        registerForContextMenu(button2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater mInflater = getMenuInflater();
        if(v == button1) {
            menu.setHeaderTitle("change background");
            mInflater.inflate(R.menu.menu1, menu);
        }
        if (v == button2) {
            mInflater.inflate(R.menu.menu2, menu);

        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId(); // 아이템 ID를 변수에 저장

        if (id == R.id.itemRed) {
            baseLayout.setBackgroundColor(Color.RED);
            return true;
        } else if (id == R.id.itemGreen) {
            baseLayout.setBackgroundColor(Color.GREEN);
            return true;
        } else if (id == R.id.itemBlue) {
            baseLayout.setBackgroundColor(Color.BLUE);
            return true;
        } else if (id == R.id.subRotate) {
            button2.setRotation(45);
            return true;
        } else if (id == R.id.subSize) {
            button2.setScaleX(2);
            return true;
        }

        return super.onContextItemSelected(item);
    }

}