package org.ranapat.parameterizedmessage;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        ((TextView) findViewById(R.id.message1)).setText(viewModel.getMessage1().getMessage(this));
        ((TextView) findViewById(R.id.message2)).setText(viewModel.getMessage2("something").getMessage(this));
        ((TextView) findViewById(R.id.message3)).setText(viewModel.getMessage3().getMessage(this));
        ((TextView) findViewById(R.id.message4)).setText(viewModel.getMessage4("something").getMessage(this));
    }
}
