package com.example.to_do_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddActivity extends AppCompatActivity {

    Button datePicker;
    Button addActivity;

    EditText activityText;
    Button cancel;
    DbHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_activity);
        dbHelper = new DbHelper(this);
        activityText = findViewById(R.id.activityInfo);
        cancel = findViewById(R.id.cancelBtn);
        cancel.setOnClickListener(v -> goBack());
        addActivity = findViewById(R.id.addToList);
        addActivity.setOnClickListener(v -> {
            String date = null;
            ActivityModel new_activity = new ActivityModel(activityText.getText().toString(),false);
            dbHelper.addActivity(new_activity);
            goBack();
        });
    }

    private void goBack(){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }


}