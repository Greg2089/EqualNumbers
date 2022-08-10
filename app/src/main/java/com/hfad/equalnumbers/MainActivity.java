package com.hfad.equalnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyLog", "onCreate");

        //region Получение ссылок на объекты из макета

        EditText firstET = findViewById(R.id.firstET);
        EditText secondET = findViewById(R.id.secondET);
        Button button = findViewById(R.id.button);
        TextView textV = findViewById(R.id.textV);
        //endregion

        //region Обработка нажатия кнопки
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MyLog", "OnClick");

                // region Один из вариантов сравнения объектов
                /*String strOne = firstET.getText().toString();
                String strTwo = secondET.getText().toString();
                if (strOne.equals(strTwo)){
                    textV.setText("Равно");
                }
                else {
                    textV.setText("Не равно");
                }*/
                //endregion
                Integer one = Integer.valueOf(firstET.getText().toString());
                Integer two = Integer.valueOf(secondET.getText().toString());
                if (one.equals(two)) {
                    textV.setText("Равно");
                } else {
                    textV.setText("Не равно");
                }
            }
        });

        //endregion

    }
}