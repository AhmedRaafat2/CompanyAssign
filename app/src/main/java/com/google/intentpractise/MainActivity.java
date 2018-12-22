package com.google.intentpractise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button createEmp, createDept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createEmp = findViewById(R.id.create_emp);
        createDept = findViewById(R.id.create_dept);

        createEmp.setOnClickListener(this);
        createDept.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.create_emp){
            Intent intent = new Intent(this,EmployeeForm.class);
            startActivity(intent);

        }else if(v.getId() == R.id.create_dept){
            Intent intent = new Intent(this,DepartmentForm.class);
            startActivity(intent);
        }else{

        }

    }
}
