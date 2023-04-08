package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button button; //создаем обьект кнопка
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
      /**обьявляем id кнопке и слушателя*/
        button = findViewById(R.id.button3);
        button.setOnClickListener(listener);
       /**обьявляем id тексту и меняем текст*/
        text = findViewById(R.id.textView);
        text.setText("С днем рождением дорогой друг , желаю тебе счаться,здоровья,хорошего настроения,отличной сдачей экзаменов, " +
                "чтобы в 11 классе всех уделал в ЕГЭ ,также поскорее покупки стим дека)) чтобы вместе в доту рубиться:)");
    }
    /**метод для интента*/
    private  View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.i("SecondActivity",this.toString());
            Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
            startActivity(intent);
        }
    };
}

