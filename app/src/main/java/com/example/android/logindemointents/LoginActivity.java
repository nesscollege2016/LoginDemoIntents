package com.example.android.logindemointents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etName, etPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etName = (EditText) findViewById(R.id.etName);
        etPass = (EditText) findViewById(R.id.etPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
    }

    String getName(){
        String name = etName.getText().toString();
        if (name.isEmpty()){
            etName.setError("Must enter a name");
            return null;
        }
        return name;
    }


    String getPass(){
        String pass = etPass.getText().toString();
        if (pass.isEmpty()){
            etPass.setError("Must enter a pass");
            return null;
        }
        else if (!pass.equals("123456")){
            etPass.setError("Wrong Password");
            return null;
        }
        return pass;
    }


    @Override
    public void onClick(View v) {
        String pass = getPass();
        String name = getName();

        if (pass!=null && name!=null){
            Intent mainIntent = new Intent(this, MainActivity.class);

            mainIntent.putExtra("name", name);
            mainIntent.putExtra("pass", pass);

            startActivity(mainIntent);
        }
    }
}
