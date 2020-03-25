package com.example.publictoblog.programselectdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.publictoblog.R;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        //创建应用选择对话
        final ProgramSelectDialog dialog = new ProgramSelectDialog(this,
                new ProgramSelectDialog.OnClickListener() {
            @Override
            public void onClick(Dialog dialog, int rate) {
                if(rate == 0) {
                    Toast.makeText(MainActivity.this,"QQ",Toast.LENGTH_SHORT).show();
                }else if(rate == 1){
                    Toast.makeText(MainActivity.this,"手机",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"微信",Toast.LENGTH_SHORT).show();
                }
                dialog.dismiss();
            }
        });

        Button button = findViewById(R.id.button);
        //为Button控件设置监听
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });
    }
}
