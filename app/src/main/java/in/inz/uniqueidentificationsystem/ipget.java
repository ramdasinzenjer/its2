package in.inz.uniqueidentificationsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ipget extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipget);
        Button ipget;
        final EditText ip;
        ip = (EditText) findViewById(R.id.ip_text);
        ipget = (Button) findViewById(R.id.ip_button);

        ipget.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Config.url = ip.getText().toString();
                Toast.makeText(ipget.this, Config.url, Toast.LENGTH_LONG).show();
                Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);

            }
        });
    }
}
