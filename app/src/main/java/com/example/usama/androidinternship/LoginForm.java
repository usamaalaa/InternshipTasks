package com.example.usama.androidinternship;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by usama on 7/7/2017.
 */

public class LoginForm extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.login);
        final EditText email=(EditText)findViewById(R.id.email);
        final EditText pass=(EditText)findViewById(R.id.pass);
        Button login=(Button)findViewById(R.id.login);
        Button register=(Button)findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=email.getText().toString();
                String s2=pass.getText().toString();
                if(Patterns.EMAIL_ADDRESS.matcher(s1).matches()){
                    if(pass.length()>=8) {
                        Toast.makeText(getBaseContext(), "Valid email address", Toast.LENGTH_SHORT).show();
                    }else if(pass.length()<8){
                        Toast.makeText(getBaseContext(), "Invalid Password", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(getBaseContext(),"Invalid email address",Toast.LENGTH_SHORT).show();
                }


            }
        });
        /*Intent data=this.getIntent();
        String infoE =data.getExtras().getString("email");
        String infoP=data.getExtras().getString("pass");
        email.setText(infoE);
        pass.setText(infoP);*/

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginForm.this,SignUp.class);
                startActivity(i);
                finish();
            }
        });





     /*   new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {

            }
        }.start();*/

      /* new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   Thread.sleep(2000);
                   runOnUiThread(new Runnable() {
                       @Override
                       public void run() {
                           //intent
                       }
                   });
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }).start();*/
    }
}
