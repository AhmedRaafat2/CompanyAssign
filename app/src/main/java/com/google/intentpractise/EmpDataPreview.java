package com.google.intentpractise;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class EmpDataPreview extends AppCompatActivity {

    private TextView id,name,adress,salary,job;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_data);

        id = findViewById(R.id.emp_id_data);
        name = findViewById(R.id.emp_name_data);
        adress = findViewById(R.id.emp_address_data);
        salary = findViewById(R.id.emp_salary_data);
        job = findViewById(R.id.emp_job_data);

        Intent intent = getIntent();
        Employee emp = (Employee) intent.getSerializableExtra("user_data_for_preview");

        id.setText(emp.getId());
        name.setText(emp.getName());
        adress.setText(emp.getAdress());
        salary.setText(emp.getSalary());
        job.setText(emp.getJob());


    }
}
