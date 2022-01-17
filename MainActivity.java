package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
public void onBtnClick(View view){
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtSecondName = findViewById(R.id.txtSeciondName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText edtFIrstName = findViewById(R.id.edtFirstName);
        EditText edtSecondName = findViewById(R.id.edtSecondName);
        EditText edtEmail = findViewById(R.id.edtEmail);

        txtFirstName.setText("First Name : " + edtFIrstName.getText().toString());
        txtSecondName.setText("Second Name : " + edtSecondName.getText().toString());
        txtEmail.setText("Email : " + edtEmail.getText().toString());





}








}