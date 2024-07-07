package net.xtapu.android.kbo;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void teamClick(View v) {
        Intent intent = new Intent(getApplicationContext(), Main.class);
        startActivity(intent);
    }
}