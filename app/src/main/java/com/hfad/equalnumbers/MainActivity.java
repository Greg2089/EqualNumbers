package com.hfad.equalnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyLog", "");

        //region Получение ссылок на объекты из макета

        EditText firstET = findViewById(R.id.firstET);
        EditText secondET = findViewById(R.id.secondET);
        Button button = findViewById(R.id.button);
        //endregion

        //region Обработка нажатия кнопки
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MyLog", "OnClick");
            }
        });

        //endregion

    }
}