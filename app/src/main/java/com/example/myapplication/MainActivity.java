package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button; //создаем обьект кнопка
    TextView text; //создаем обьект текста

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**присваиваем id кнопки и назначем слушателя*/
        button = findViewById(R.id.button);
        button.setOnClickListener(listener);
        /**присваиваем id тексту и меняем текст*/
        text = findViewById(R.id.textView);
        text.setText("Хочешь сюрприз ?");
    }
    /**создаем интет и метод для него*/
private  View.OnClickListener listener = new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Log.i("MainActivity",this.toString());
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(intent);
    }
};
}