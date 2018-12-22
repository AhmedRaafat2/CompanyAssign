package com.google.intentpractise;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DepartmentForm extends AppCompatActivity implements View.OnClickListener {

    private EditText no, name, description;
    private Button submit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_form);

        no = findViewById(R.id.dept_no);
        name = findViewById(R.id.dept_name);
        description = findViewById(R.id.dept_desc);

        submit = findViewById(R.id.dept_submit);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.dept_submit){
            Intent intent = new Intent(this,DepartmentDataPreview.class);
            intent.putExtra("no",no.getText().toString());
            intent.putExtra("name",name.getText().toString());
            intent.putExtra("desc",description.getText().toString());
            startActivity(intent);
        }
    }
}
