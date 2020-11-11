package com.example.periodictable;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class ElementInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element_info);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Bundle b = getIntent().getExtras();

        setTitle(b.getString("name"));

        TextView edt = (TextView)findViewById(R.id.textView_sym);
        edt.setText(b.getString("symbol"));

        edt = (TextView)findViewById(R.id.textView_num);
        edt.setText(b.getString("atomicNumber"));

        edt = (TextView)findViewById(R.id.textView_mass);
        edt.setText(b.getString("atomicMass"));

        edt = (TextView)findViewById(R.id.textView_type);
        edt.setText(Utils.firstUpperCase(b.getString("type")));

        edt = (TextView)findViewById(R.id.textView_state);
        edt.setText(Utils.firstUpperCase(b.getString("defaultState")));

        edt = (TextView)findViewById(R.id.textView_config);
        edt.setText(b.getString("elecConfig"));

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setImageResource(android.R.drawable.ic_menu_share);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "https://ca.wikipedia.org/wiki/" + b.getString("name"));
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
            }
        });
    }

}
