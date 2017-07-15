package com.example.usama.androidinternship;

import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by usama on 7/7/2017.
 */

public class SignUp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.signup);


        final EditText name=(EditText)findViewById(R.id.name);
        final EditText email=(EditText)findViewById(R.id.emailRe);
        final EditText pass=(EditText)findViewById(R.id.passRe);
        final EditText confpass=(EditText)findViewById(R.id.confpass);
        final EditText mob=(EditText)findViewById(R.id.mob);
        EditText sliver=(EditText)findViewById(R.id.sliver);

        Button regis=(Button)findViewById(R.id.regis);

        Spinner country=(Spinner)findViewById(R.id.country);
        Spinner times=(Spinner)findViewById(R.id.times);
        Spinner fiqh=(Spinner)findViewById(R.id.figh);

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameInput=name.getText().toString();
                if(nameInput.isEmpty()){
                    name.setHint("Name field is empty");
                    name.setHintTextColor(getResources().getColor(R.color.red));
                }
                String emailInput=email.getText().toString();
                if(!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()){
                    email.setText("");
                    email.setHint("invalid email");
                    email.setHintTextColor(getResources().getColor(R.color.red));
                }
                String passInput=pass.getText().toString();
                if(pass.length()<8){
                    pass.setText("");
                    pass.setHint("password is less than 8 character");
                    pass.setHintTextColor(getResources().getColor(R.color.red));
                }
                if(!confpass.getText().toString().equals(passInput)){
                    confpass.setText("");
                    confpass.setHint("it is not the same ");
                    confpass.setHintTextColor(getResources().getColor(R.color.red));
                }
                String mobInput=mob.getText().toString();
                if(mobInput.isEmpty() || mobInput.length()<11){
                    mob.setText("");
                    mob.setHint("please enter valid mobile number");
                    mob.setHintTextColor(getResources().getColor(R.color.red));
                }

            }
        });



        ImageView back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SignUp.this,LoginForm.class);
               // i.putExtra("email",email.getText().toString());
               // i.putExtra("pass",pass.getText().toString());
                startActivity(i);
                finish();
            }
        });

    }

}
