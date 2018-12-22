package com.google.intentpractise;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DepartmentDataPreview extends AppCompatActivity {

    private TextView no,name,description;

    private String dept_no,dept_name,dept_desc;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_data);

        no = findViewById(R.id.dept_no_data);
        name = findViewById(R.id.dept_name_data);
        description = findViewById(R.id.dept_desc_data);

        Intent intent = getIntent();
        dept_no = intent.getStringExtra("no");
        dept_name = intent.getStringExtra("name");
        dept_desc = intent.getStringExtra("desc");

        no.setText(dept_no);
        name.setText(dept_name);
        description.setText(dept_desc);


    }
}
