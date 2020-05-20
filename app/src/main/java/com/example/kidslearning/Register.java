package com.example.kidslearning;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Register extends AppCompatActivity {
    EditText name,phone;
    DatePicker picker;
    String date;
    long dodate,cudate;
    Date ddate,cdate;
    String date1;
    Button button,button1;
    CharSequence s;
    String dob,name1,phone1;

    Database database=new Database(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name=(EditText)findViewById(R.id.name);
        phone=(EditText)findViewById(R.id.phone);
        button=(Button)findViewById(R.id.btn);
        picker=(DatePicker)findViewById(R.id.datePicker1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date d = new Date();
                s = DateFormat.format("dd/MM/yyyy", d.getTime());
                date1=String.valueOf(s);
                dob=picker.getDayOfMonth()+"/"+ (picker.getMonth() + 1)+"/"+picker.getYear();

                java.text.SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/mm/yyyy");

                try {
                    ddate=simpleDateFormat.parse(dob);
                    cdate=simpleDateFormat.parse(date1);
                    dodate=ddate.getTime();
                    cudate=cdate.getTime();

                }catch (Exception e){

                }
                if((!name.getText().toString().isEmpty() && !phone.getText().toString().isEmpty()))
                {
                    if(dodate <=cudate){
                        if ((phone.length() <11)){
                            Toast.makeText(getApplicationContext(),"Invalid Phone Number",Toast.LENGTH_SHORT).show();
                        }else{
                            name1=name.getText().toString();
                            phone1=phone.getText().toString();

                            SaveData(dob);
                            database.insertData(name1,phone1,dob);
                            startActivity(new Intent(Register.this,Dashboard.class));
                            finish();
                        }
                    }else{
                        Toast.makeText(getApplicationContext(),"Wrong Date",Toast.LENGTH_SHORT).show();
                    }

                }else

                {

                   Toast.makeText(getApplicationContext(),"All field must be filled",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    void  showmessage(String title,String Message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(Register.this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
    public void SaveData(String ddd){
        SharedPreferences sharedPreferences=getSharedPreferences("saveDob",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("DOB",ddd);
        editor.apply();
    }
}
