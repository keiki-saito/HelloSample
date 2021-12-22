package com.example.hellosample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btClick = findViewById(R.id.btClick);
        HelloListener listener = new HelloListener();
        btClick.setOnClickListener(listener);

        // クリアボタンであるButtonオブジェクトを取得
        Button btClear = findViewById(R.id.btClear);
        // クリアボタンにリスナを設定
        btClear.setOnClickListener(listener);
    }

    // ボタンをクリックしたときのリスナクラス
    private class HelloListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            // 名前に入力欄であるEditTextオブジェクトを取得
            EditText input = findViewById(R.id.etName);
            // メッセージを表示するTextViewオブジェクトを取得
            TextView output = findViewById(R.id.tvOutput);
            // タップされた画面部品のidのR値を取得
            int id = view.getId();
            // idのR値の応じて処理を分岐。
            switch (id) {
                case R.id.btClick:
                    // kkk
                    String inputStr = input.getText().toString();
                    output.setText(inputStr + "さん、こんにちは!");
                    break;
                case R.id.btClear:
                    input.setText("");
                    output.setText("");
                    break;
            }

        }
    }
}

