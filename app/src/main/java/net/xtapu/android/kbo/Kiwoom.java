package net.xtapu.android.kbo;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;

public class Kiwoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiwoom);
    }
    public void back(View v) {
        Snackbar.make(v,"개발중",Snackbar.LENGTH_SHORT).show();
    }
}