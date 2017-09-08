package in.inz.uniqueidentificationsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class otp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        Button next = (Button) findViewById(R.id.button2);
        TextView mnd;
        mnd = (TextView) findViewById(R.id.textView2);
        mnd.setText(mnd.getText() + Config.Name);
        final EditText vcd;
        final String otnp = Config.Password;
        vcd = (EditText) findViewById(R.id.txtotp);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String otpn = vcd.getText().toString().trim();
                if (otpn.equals(otnp)) {

                    Intent myIntent = new Intent(view.getContext(), appdrawer.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });
    }
}

