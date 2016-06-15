package com.claudiawu.todoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String item = getIntent().getStringExtra("item");
        position = getIntent().getIntExtra("position", 0);
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText(item);
    }


    public void onSubmit(View v) {
        EditText etName = (EditText) findViewById(R.id.editText);
        String change = etName.getText().toString();
        Intent data = new Intent();
        data.putExtra("item", change);
        data.putExtra("position", position);
        setResult(RESULT_OK, data);
        finish();
    }


}
