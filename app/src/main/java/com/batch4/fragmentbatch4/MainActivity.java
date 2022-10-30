package com.batch4.fragmentbatch4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button,button1;
    boolean status = true;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button4);
        editText = findViewById(R.id.name);

        button.setOnClickListener(v -> {
            String name = editText.getText().toString();
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new BlankFragment(name)).commit();
//           if(status){
//               FragmentManager obj = getSupportFragmentManager();
//               FragmentTransaction fragmentTransaction  =obj.beginTransaction();
//               fragmentTransaction.replace(R.id.frameLayout,new BlankFragment()).commit();
//               status = false;
//           }else{
//               getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new BlankFragment2()).commit();
//               status = true;
//           }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });




    }
}