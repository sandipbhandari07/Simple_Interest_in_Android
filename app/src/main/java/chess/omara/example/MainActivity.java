package chess.omara.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText p,t,r;
    Button rslt;
    TextView si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p=findViewById(R.id.p);
        t=findViewById(R.id.t);
        r=findViewById(R.id.r);
        si=findViewById(R.id.si);
        rslt=findViewById(R.id.rslt);

        rslt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Integer.parseInt(p.getText().toString());
                float b=Integer.parseInt(t.getText().toString());
                float c=Integer.parseInt(r.getText().toString());
                float d;
                d=(a*b*c)/100;

                si.setText("total si :"+String.valueOf(d));
            }
        });

    }
}