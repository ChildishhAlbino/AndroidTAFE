package com.example.conno.androidtafe;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.ToggleButton;


public class GUI extends AppCompatActivity {
    public static int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gui);
        final ToggleButton button = (ToggleButton)findViewById(R.id.toggleButton);
        final TextView tv = (TextView)findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button.isChecked()){
                    tv.setText("Button Checked");
                }
                else{
                    tv.setText("Button UnChecked");
                }
            }
        });
        
        tv.setText(String.valueOf(i));
    }
}
