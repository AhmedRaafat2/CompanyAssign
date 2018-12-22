package com.google.intentpractise;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmployeeForm extends AppCompatActivity implements View.OnClickListener {

    private EditText id,name,adress,salary,job;
    private Button submit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_form);

        id = findViewById(R.id.emp_id);
        name = findViewById(R.id.emp_name);
        adress = findViewById(R.id.emp_address);
        salary = findViewById(R.id.emp_salary);
        job = findViewById(R.id.emp_job);
        submit =findViewById(R.id.emp_submit);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.emp_submit){
            Intent intent = new Intent(this,EmpDataPreview.class);
            Employee emp = new Employee(id.getText().toString(),name.getText().toString(),adress.getText().toString(),salary.getText().toString(),job.getText().toString());
            intent.putExtra("user_data_for_preview",emp);
            startActivity(intent);
        }
    }
}
