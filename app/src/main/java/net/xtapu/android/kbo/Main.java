package net.xtapu.android.kbo;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonKiwoomPressed(View v) {
        Intent intent = new Intent(getApplicationContext(), Kiwoom.class);
        startActivity(intent);
    }
    public void buttonKtPressed(View v) {
        Snackbar.make(v,"개발중",Snackbar.LENGTH_SHORT).show();
    }
    public void buttonSSGPressed(View v) {
        Snackbar.make(v,"개발중",Snackbar.LENGTH_SHORT).show();
    }
    public void buttonHanwhaPressed(View v) {
        Snackbar.make(v,"개발중",Snackbar.LENGTH_SHORT).show();
    }
    public void buttonLgPressed(View v) {
        Snackbar.make(v,"개발중",Snackbar.LENGTH_SHORT).show();
    }
    public void buttonDoosanPressed(View v) {
        Snackbar.make(v,"개발중",Snackbar.LENGTH_SHORT).show();
    }
    public void buttonKiaPressed(View v) {
        Snackbar.make(v,"개발중",Snackbar.LENGTH_SHORT).show();
    }
    public void buttonLottePressed(View v) {
        Snackbar.make(v,"개발중",Snackbar.LENGTH_SHORT).show();
    }
    public void buttonNcPressed(View v) {
        Snackbar.make(v,"개발중",Snackbar.LENGTH_SHORT).show();
    }
    public void buttonSamsungPressed(View v) {
        Snackbar.make(v,"개발중",Snackbar.LENGTH_SHORT).show();
    }
}