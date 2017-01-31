package net.zdome.cs371.epp.implementsclassdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

 private TextView advise;
private Button panicButton;
private Button happyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        advise = (TextView)findViewById(R.id.advise);
        panicButton  = (Button)findViewById(R.id.PanicButton);
        panicButton.setOnClickListener(this);
        happyButton  = (Button)findViewById(R.id.HappyButton);
        happyButton.setOnClickListener(this);
    }

    public void onClick (View v)
    {
            advise.setTextColor(Color.RED);
            advise.setText("NO!");
    }
}
